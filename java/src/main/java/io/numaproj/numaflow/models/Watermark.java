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
import io.numaproj.numaflow.models.IdleSource;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.numaproj.numaflow.ApiClient;
/**
 * Watermark
 */
@JsonPropertyOrder({
  Watermark.JSON_PROPERTY_DISABLED,
  Watermark.JSON_PROPERTY_IDLE_SOURCE,
  Watermark.JSON_PROPERTY_MAX_DELAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Watermark {
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_IDLE_SOURCE = "idleSource";
  private IdleSource idleSource;

  public static final String JSON_PROPERTY_MAX_DELAY = "maxDelay";
  private String maxDelay = null;

  public Watermark() { 
  }

  public Watermark disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Disabled toggles the watermark propagation, defaults to false.
   * @return disabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public Watermark idleSource(IdleSource idleSource) {
    this.idleSource = idleSource;
    return this;
  }

  /**
   * Get idleSource
   * @return idleSource
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDLE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IdleSource getIdleSource() {
    return idleSource;
  }


  @JsonProperty(JSON_PROPERTY_IDLE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdleSource(IdleSource idleSource) {
    this.idleSource = idleSource;
  }


  public Watermark maxDelay(String maxDelay) {
    this.maxDelay = maxDelay;
    return this;
  }

  /**
   * Get maxDelay
   * @return maxDelay
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaxDelay() {
    return maxDelay;
  }


  @JsonProperty(JSON_PROPERTY_MAX_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDelay(String maxDelay) {
    this.maxDelay = maxDelay;
  }


  /**
   * Return true if this Watermark object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watermark watermark = (Watermark) o;
    return Objects.equals(this.disabled, watermark.disabled) &&
        Objects.equals(this.idleSource, watermark.idleSource) &&
        Objects.equals(this.maxDelay, watermark.maxDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, idleSource, maxDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watermark {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    idleSource: ").append(toIndentedString(idleSource)).append("\n");
    sb.append("    maxDelay: ").append(toIndentedString(maxDelay)).append("\n");
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

    // add `disabled` to the URL query string
    if (getDisabled() != null) {
      joiner.add(String.format("%sdisabled%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idleSource` to the URL query string
    if (getIdleSource() != null) {
      joiner.add(getIdleSource().toUrlQueryString(prefix + "idleSource" + suffix));
    }

    // add `maxDelay` to the URL query string
    if (getMaxDelay() != null) {
      joiner.add(String.format("%smaxDelay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMaxDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

