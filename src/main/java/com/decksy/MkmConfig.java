package com.decksy;

import io.micronaut.context.annotation.ConfigurationProperties;
import javax.validation.constraints.NotNull;

@ConfigurationProperties("mkm")
public class MkmConfig {

  @NotNull(message = "Access Token Secret is mandatory")
  private String accessTokenSecret;

  @NotNull(message = "Access Token Secret is mandatory")
  private String accessTokenApp;

  @NotNull(message = "App Secret is mandatory")
  private String appSecret;

  @NotNull(message = "App Token is mandatory")
  private String appToken;

  @NotNull(message = "Api Version is mandatory")
  private String apiVersion;

  @NotNull(message = "Api Url is mandatory")
  private String apiUrl;

  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }

  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  public String getAccessTokenApp() {
    return accessTokenApp;
  }

  public void setAccessTokenApp(String accessTokenApp) {
    this.accessTokenApp = accessTokenApp;
  }

  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  public String getAppToken() {
    return appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public String getApiUrl() {
    return apiUrl + apiVersion + "/output.json";
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }
}
