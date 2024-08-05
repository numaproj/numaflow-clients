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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * GeneratorSource
 */
@JsonPropertyOrder({
  GeneratorSource.JSON_PROPERTY_DURATION,
  GeneratorSource.JSON_PROPERTY_JITTER,
  GeneratorSource.JSON_PROPERTY_KEY_COUNT,
  GeneratorSource.JSON_PROPERTY_MSG_SIZE,
  GeneratorSource.JSON_PROPERTY_RPU,
  GeneratorSource.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class GeneratorSource {
  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration = null;

  public static final String JSON_PROPERTY_JITTER = "jitter";
  private String jitter = null;

  public static final String JSON_PROPERTY_KEY_COUNT = "keyCount";
  private Integer keyCount;

  public static final String JSON_PROPERTY_MSG_SIZE = "msgSize";
  private Integer msgSize;

  public static final String JSON_PROPERTY_RPU = "rpu";
  private Long rpu;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public GeneratorSource() { 
  }

  public GeneratorSource duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public GeneratorSource jitter(String jitter) {
    this.jitter = jitter;
    return this;
  }

  /**
   * Get jitter
   * @return jitter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJitter() {
    return jitter;
  }


  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJitter(String jitter) {
    this.jitter = jitter;
  }


  public GeneratorSource keyCount(Integer keyCount) {
    this.keyCount = keyCount;
    return this;
  }

  /**
   * KeyCount is the number of unique keys in the payload
   * @return keyCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getKeyCount() {
    return keyCount;
  }


  @JsonProperty(JSON_PROPERTY_KEY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyCount(Integer keyCount) {
    this.keyCount = keyCount;
  }


  public GeneratorSource msgSize(Integer msgSize) {
    this.msgSize = msgSize;
    return this;
  }

  /**
   * Size of each generated message
   * @return msgSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMsgSize() {
    return msgSize;
  }


  @JsonProperty(JSON_PROPERTY_MSG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgSize(Integer msgSize) {
    this.msgSize = msgSize;
  }


  public GeneratorSource rpu(Long rpu) {
    this.rpu = rpu;
    return this;
  }

  /**
   * Get rpu
   * @return rpu
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRpu() {
    return rpu;
  }


  @JsonProperty(JSON_PROPERTY_RPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRpu(Long rpu) {
    this.rpu = rpu;
  }


  public GeneratorSource value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Value is an optional uint64 value to be written in to the payload
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Long value) {
    this.value = value;
  }


  /**
   * Return true if this GeneratorSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratorSource generatorSource = (GeneratorSource) o;
    return Objects.equals(this.duration, generatorSource.duration) &&
        Objects.equals(this.jitter, generatorSource.jitter) &&
        Objects.equals(this.keyCount, generatorSource.keyCount) &&
        Objects.equals(this.msgSize, generatorSource.msgSize) &&
        Objects.equals(this.rpu, generatorSource.rpu) &&
        Objects.equals(this.value, generatorSource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, jitter, keyCount, msgSize, rpu, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratorSource {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    keyCount: ").append(toIndentedString(keyCount)).append("\n");
    sb.append("    msgSize: ").append(toIndentedString(msgSize)).append("\n");
    sb.append("    rpu: ").append(toIndentedString(rpu)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format("%sduration%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `jitter` to the URL query string
    if (getJitter() != null) {
      joiner.add(String.format("%sjitter%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getJitter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `keyCount` to the URL query string
    if (getKeyCount() != null) {
      joiner.add(String.format("%skeyCount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getKeyCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `msgSize` to the URL query string
    if (getMsgSize() != null) {
      joiner.add(String.format("%smsgSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMsgSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rpu` to the URL query string
    if (getRpu() != null) {
      joiner.add(String.format("%srpu%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRpu()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getValue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

