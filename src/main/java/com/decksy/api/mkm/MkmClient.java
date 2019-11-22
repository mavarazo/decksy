package com.decksy.api.mkm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.decksy.MkmConfig;

@Singleton
public class MkmClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(MkmClient.class);
  private static final String GET = "GET";
  private static final String OAUTH_AUTHORIZATION_HEADER = "Authorization";
  public static final String ENCODING = "UTF-8";

  private final MkmConfig mkmConfig;
  private final OAuth2Impl oAuth2;

  public MkmClient(MkmConfig mkmConfig, OAuth2Impl oAuth2) {
    this.mkmConfig = mkmConfig;
    this.oAuth2 = oAuth2;
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

  private static boolean isSuccessful(int responseCode) {
    return responseCode >= 200 && responseCode < 300;
  }

  private void inputStreamToString(InputStream inputStream) {
    StringBuilder textBuilder = new StringBuilder();
    try (Reader reader =
        new BufferedReader(
            new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
      int c = 0;
      while ((c = reader.read()) != -1) {
        textBuilder.append((char) c);
      }
    } catch (IOException e) {
      LOGGER.error(e.getMessage(), e);
    }
    LOGGER.debug(textBuilder.toString());
  }
}
