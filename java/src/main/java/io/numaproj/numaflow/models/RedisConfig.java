/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.2.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.numaproj.numaflow.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * RedisConfig
 */
@JsonPropertyOrder({
  RedisConfig.JSON_PROPERTY_MASTER_NAME,
  RedisConfig.JSON_PROPERTY_PASSWORD,
  RedisConfig.JSON_PROPERTY_SENTINEL_PASSWORD,
  RedisConfig.JSON_PROPERTY_SENTINEL_URL,
  RedisConfig.JSON_PROPERTY_URL,
  RedisConfig.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class RedisConfig {
  public static final String JSON_PROPERTY_MASTER_NAME = "masterName";
  private String masterName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private V1SecretKeySelector password = null;

  public static final String JSON_PROPERTY_SENTINEL_PASSWORD = "sentinelPassword";
  private V1SecretKeySelector sentinelPassword = null;

  public static final String JSON_PROPERTY_SENTINEL_URL = "sentinelUrl";
  private String sentinelUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public RedisConfig() { 
  }

  public RedisConfig masterName(String masterName) {
    this.masterName = masterName;
    return this;
  }

  /**
   * Only required when Sentinel is used
   * @return masterName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMasterName() {
    return masterName;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterName(String masterName) {
    this.masterName = masterName;
  }


  public RedisConfig password(V1SecretKeySelector password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public V1SecretKeySelector getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(V1SecretKeySelector password) {
    this.password = password;
  }


  public RedisConfig sentinelPassword(V1SecretKeySelector sentinelPassword) {
    this.sentinelPassword = sentinelPassword;
    return this;
  }

  /**
   * Get sentinelPassword
   * @return sentinelPassword
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTINEL_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public V1SecretKeySelector getSentinelPassword() {
    return sentinelPassword;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentinelPassword(V1SecretKeySelector sentinelPassword) {
    this.sentinelPassword = sentinelPassword;
  }


  public RedisConfig sentinelUrl(String sentinelUrl) {
    this.sentinelUrl = sentinelUrl;
    return this;
  }

  /**
   * Sentinel URL, will be ignored if Redis URL is provided
   * @return sentinelUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTINEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSentinelUrl() {
    return sentinelUrl;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentinelUrl(String sentinelUrl) {
    this.sentinelUrl = sentinelUrl;
  }


  public RedisConfig url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Redis URL
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public RedisConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Redis user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  /**
   * Return true if this RedisConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedisConfig redisConfig = (RedisConfig) o;
    return Objects.equals(this.masterName, redisConfig.masterName) &&
        Objects.equals(this.password, redisConfig.password) &&
        Objects.equals(this.sentinelPassword, redisConfig.sentinelPassword) &&
        Objects.equals(this.sentinelUrl, redisConfig.sentinelUrl) &&
        Objects.equals(this.url, redisConfig.url) &&
        Objects.equals(this.user, redisConfig.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterName, password, sentinelPassword, sentinelUrl, url, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisConfig {\n");
    sb.append("    masterName: ").append(toIndentedString(masterName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sentinelPassword: ").append(toIndentedString(sentinelPassword)).append("\n");
    sb.append("    sentinelUrl: ").append(toIndentedString(sentinelUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `masterName` to the URL query string
    if (getMasterName() != null) {
      joiner.add(String.format("%smasterName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMasterName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sentinelPassword` to the URL query string
    if (getSentinelPassword() != null) {
      joiner.add(String.format("%ssentinelPassword%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSentinelPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sentinelUrl` to the URL query string
    if (getSentinelUrl() != null) {
      joiner.add(String.format("%ssentinelUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSentinelUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUser()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

