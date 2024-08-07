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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * GetRedisServiceSpecReq
 */
@JsonPropertyOrder({
  GetRedisServiceSpecReq.JSON_PROPERTY_LABELS,
  GetRedisServiceSpecReq.JSON_PROPERTY_REDIS_CONTAINER_PORT,
  GetRedisServiceSpecReq.JSON_PROPERTY_SENTINEL_CONTAINER_PORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class GetRedisServiceSpecReq {
  public static final String JSON_PROPERTY_LABELS = "Labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_REDIS_CONTAINER_PORT = "RedisContainerPort";
  private Integer redisContainerPort;

  public static final String JSON_PROPERTY_SENTINEL_CONTAINER_PORT = "SentinelContainerPort";
  private Integer sentinelContainerPort;

  public GetRedisServiceSpecReq() { 
  }

  public GetRedisServiceSpecReq labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GetRedisServiceSpecReq putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public GetRedisServiceSpecReq redisContainerPort(Integer redisContainerPort) {
    this.redisContainerPort = redisContainerPort;
    return this;
  }

  /**
   * Get redisContainerPort
   * @return redisContainerPort
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDIS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getRedisContainerPort() {
    return redisContainerPort;
  }


  @JsonProperty(JSON_PROPERTY_REDIS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedisContainerPort(Integer redisContainerPort) {
    this.redisContainerPort = redisContainerPort;
  }


  public GetRedisServiceSpecReq sentinelContainerPort(Integer sentinelContainerPort) {
    this.sentinelContainerPort = sentinelContainerPort;
    return this;
  }

  /**
   * Get sentinelContainerPort
   * @return sentinelContainerPort
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENTINEL_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSentinelContainerPort() {
    return sentinelContainerPort;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentinelContainerPort(Integer sentinelContainerPort) {
    this.sentinelContainerPort = sentinelContainerPort;
  }


  /**
   * Return true if this GetRedisServiceSpecReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRedisServiceSpecReq getRedisServiceSpecReq = (GetRedisServiceSpecReq) o;
    return Objects.equals(this.labels, getRedisServiceSpecReq.labels) &&
        Objects.equals(this.redisContainerPort, getRedisServiceSpecReq.redisContainerPort) &&
        Objects.equals(this.sentinelContainerPort, getRedisServiceSpecReq.sentinelContainerPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, redisContainerPort, sentinelContainerPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRedisServiceSpecReq {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    redisContainerPort: ").append(toIndentedString(redisContainerPort)).append("\n");
    sb.append("    sentinelContainerPort: ").append(toIndentedString(sentinelContainerPort)).append("\n");
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

    // add `Labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%sLabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(ApiClient.valueToString(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `RedisContainerPort` to the URL query string
    if (getRedisContainerPort() != null) {
      joiner.add(String.format("%sRedisContainerPort%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRedisContainerPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `SentinelContainerPort` to the URL query string
    if (getSentinelContainerPort() != null) {
      joiner.add(String.format("%sSentinelContainerPort%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSentinelContainerPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

