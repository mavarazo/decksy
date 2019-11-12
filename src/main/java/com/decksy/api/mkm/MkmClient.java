package com.decksy.api.mkm;

import com.decksy.MkmConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class MkmClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(MkmClient.class);
  private static final String GET = "GET";
  private static final String OAUTH_AUTHORIZATION_HEADER = "Authorization";

  private final MkmConfig mkmConfig;
  private final OAuth2Impl oAuth2;

  public MkmClient(MkmConfig mkmConfig, OAuth2Impl oAuth2) {
    this.mkmConfig = mkmConfig;
    this.oAuth2 = oAuth2;
  }

  public String get(String uri) throws IOException, HttpException {
    return get(uri, Collections.emptyMap());
  }

  public String get(String uri, Map<String, String> params) throws HttpException, IOException {
    String url = mkmConfig.getApiUrl() + uri;
    LOGGER.debug("LINK=%s", url);

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

    return connection.getResponseMessage();
  }

  private static boolean isSuccessful(int responseCode) {
    return responseCode >= 200 && responseCode < 300;
  }
}
