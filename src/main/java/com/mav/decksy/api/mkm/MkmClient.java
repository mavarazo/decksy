package com.mav.decksy.api.mkm;

import com.mav.decksy.MkmConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MkmClient {

  public static final String ENCODING = "UTF-8";
  private static final Logger LOGGER = LoggerFactory.getLogger(MkmClient.class);
  private static final String GET = "GET";
  private static final String OAUTH_AUTHORIZATION_HEADER = "Authorization";

  private final MkmConfig mkmConfig;
  private final OAuth2Impl oAuth2;

  @Autowired
  public MkmClient(MkmConfig mkmConfig, OAuth2Impl oAuth2) {
    this.mkmConfig = mkmConfig;
    this.oAuth2 = oAuth2;
  }

  private static boolean isSuccessful(int responseCode) {
    return responseCode >= 200 && responseCode < 300;
  }

  public static void inputStreamToString(InputStream inputStream) {
    String text = null;
    try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
      text = scanner.useDelimiter("\\A").next();
    }
    LOGGER.info(text);
  }

  public InputStream get(String uri) throws IOException, HttpException {
    return get(uri, Collections.emptyMap());
  }

  public InputStream get(String uri, Map<String, String> params) throws HttpException, IOException {
    String url = mkmConfig.getApiUrl() + uri;
    LOGGER.debug("LINK {}", url);

    if (Objects.nonNull(params) && params.size() > 0) {
      url += "?";
      url +=
          params.entrySet().stream()
              .map(entry -> entry.getKey() + "=" + entry.getValue())
              .collect(Collectors.joining("&"));
    }

    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.addRequestProperty(OAUTH_AUTHORIZATION_HEADER, oAuth2.generateSignature(url, GET));
    connection.connect();
    if (!isSuccessful(connection.getResponseCode())) {
      throw new HttpException(connection.getResponseCode());
    }

    return connection.getInputStream();
  }
}
