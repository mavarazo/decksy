package com.decksy.api.mkm;

import com.decksy.MkmConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import javax.xml.bind.DatatypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class OAuth2Impl {

  private static final Logger LOGGER = LoggerFactory.getLogger(OAuth2Impl.class);
  public static final String SIGNATURE_METHOD = "HMAC-SHA1";
  public static final String VERSION = "1.0";
  public static final String ENCODING = "UTF-8";

  private final MkmConfig mkmConfig;

  public OAuth2Impl(MkmConfig mkmConfig) {
    this.mkmConfig = mkmConfig;
  }

  public String generateSignature(String url, String method) {
    int index = url.indexOf('?');
    String baseUri = (index > 0 ? url.substring(0, index) : url);

    Map<String, String> headerParams = buildOAuthHeaderParameters(baseUri, method);
    String baseString = method.toUpperCase() + "&" + encodeString(baseUri) + "&";
    LOGGER.trace("OAUTH2=" + baseString);

    if (index > 0) {
      addQueryToHeaderParameters(url, index, headerParams);
    }

    String paramString = encodeHeaderParameters(headerParams);
    LOGGER.trace("paramString=" + paramString);
    baseString += paramString;

    String oAuthSignature = getOAuthSignature(baseString);
    headerParams.put("oauth_signature", oAuthSignature);

    List<String> headerParamStrings =
        headerParams.entrySet().stream()
            .map(entry -> entry.getKey() + "=\"" + entry.getValue() + "\"")
            .collect(Collectors.toList());

    String authHeader = "OAuth " + String.join(", ", headerParamStrings);
    LOGGER.debug("authHeader=" + authHeader);
    return authHeader;
  }

  private Map<String, String> buildOAuthHeaderParameters(String baseUri, String method) {
    Map<String, String> headerParams = new TreeMap<>();
    headerParams.put("oauth_consumer_key", mkmConfig.getAppToken());
    headerParams.put("oauth_token", mkmConfig.getAccessTokenApp());
    headerParams.put("oauth_nonce", "" + System.currentTimeMillis());
    headerParams.put("oauth_timestamp", "" + (System.currentTimeMillis() / 1000));
    headerParams.put("oauth_signature_method", SIGNATURE_METHOD);
    headerParams.put("oauth_version", VERSION);
    headerParams.put("realm", baseUri);

    return headerParams;
  }

  private void addQueryToHeaderParameters(String url, int index, Map<String, String> headerParams) {
    String urlParams = url.substring(index + 1);
    Map<String, String> args = OAuth2Impl.parseQueryString(urlParams);

    for (Entry<String, String> k : args.entrySet()) {
      headerParams.put(k.getKey(), k.getValue());
      LOGGER.trace("headerParams.put(" + k.getKey() + "," + k.getValue() + ")");
    }
  }

  private static Map<String, String> parseQueryString(String query) {
    Map<String, String> queryParameters = new TreeMap<>();
    String[] querySegments = query.split("&");
    for (String segment : querySegments) {
      String[] parts = segment.split("=");
      if (parts.length > 0) {
        String key = parts[0].replaceAll("\\?", " ").trim();
        String val = parts[1].trim();
        queryParameters.put(key, val);
      }
    }
    return queryParameters;
  }

  private String encodeHeaderParameters(Map<String, String> headerParams) {
    List<String> paramStrings =
        headerParams.entrySet().stream()
            .filter(entry -> !"realm".equalsIgnoreCase(entry.getKey()))
            .map(entry -> encodeString(entry.getKey()) + "=" + entry.getValue())
            .collect(Collectors.toList());

    return encodeString(String.join("&", paramStrings)).replaceAll("'", "%27");
  }

  private String encodeString(String value) {
    try {
      return URLEncoder.encode(value, ENCODING);
    } catch (UnsupportedEncodingException e) {
      LOGGER.error(e.getMessage());
      throw new RuntimeException(e);
    }
  }

  private String getOAuthSignature(String baseString) {
    try {
      Mac mac = mac = Mac.getInstance("HmacSHA1");

      String signatureKey =
          URLEncoder.encode(mkmConfig.getAppSecret(), ENCODING)
              + "&"
              + URLEncoder.encode(mkmConfig.getAccessTokenSecret(), ENCODING);
      SecretKeySpec secret = new SecretKeySpec(signatureKey.getBytes(), mac.getAlgorithm());
      mac.init(secret);
      byte[] digest = mac.doFinal(baseString.getBytes());
      return DatatypeConverter.printBase64Binary(digest);
    } catch (NoSuchAlgorithmException | InvalidKeyException | UnsupportedEncodingException e) {
      LOGGER.error(e.getMessage());
      throw new RuntimeException(e);
    }
  }
}
