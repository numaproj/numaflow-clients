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
 * Lifecycle
 */
@JsonPropertyOrder({
  Lifecycle.JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS,
  Lifecycle.JSON_PROPERTY_DESIRED_PHASE,
  Lifecycle.JSON_PROPERTY_PAUSE_GRACE_PERIOD_SECONDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Lifecycle {
  public static final String JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS = "deleteGracePeriodSeconds";
  private Integer deleteGracePeriodSeconds;

  public static final String JSON_PROPERTY_DESIRED_PHASE = "desiredPhase";
  private String desiredPhase;

  public static final String JSON_PROPERTY_PAUSE_GRACE_PERIOD_SECONDS = "pauseGracePeriodSeconds";
  private Integer pauseGracePeriodSeconds;

  public Lifecycle() { 
  }

  public Lifecycle deleteGracePeriodSeconds(Integer deleteGracePeriodSeconds) {
    this.deleteGracePeriodSeconds = deleteGracePeriodSeconds;
    return this;
  }

  /**
   * DeleteGracePeriodSeconds used to delete pipeline gracefully
   * @return deleteGracePeriodSeconds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDeleteGracePeriodSeconds() {
    return deleteGracePeriodSeconds;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGracePeriodSeconds(Integer deleteGracePeriodSeconds) {
    this.deleteGracePeriodSeconds = deleteGracePeriodSeconds;
  }


  public Lifecycle desiredPhase(String desiredPhase) {
    this.desiredPhase = desiredPhase;
    return this;
  }

  /**
   * DesiredPhase used to bring the pipeline from current phase to desired phase
   * @return desiredPhase
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDesiredPhase() {
    return desiredPhase;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredPhase(String desiredPhase) {
    this.desiredPhase = desiredPhase;
  }


  public Lifecycle pauseGracePeriodSeconds(Integer pauseGracePeriodSeconds) {
    this.pauseGracePeriodSeconds = pauseGracePeriodSeconds;
    return this;
  }

  /**
   * PauseGracePeriodSeconds used to pause pipeline gracefully
   * @return pauseGracePeriodSeconds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAUSE_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPauseGracePeriodSeconds() {
    return pauseGracePeriodSeconds;
  }


  @JsonProperty(JSON_PROPERTY_PAUSE_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPauseGracePeriodSeconds(Integer pauseGracePeriodSeconds) {
    this.pauseGracePeriodSeconds = pauseGracePeriodSeconds;
  }


  /**
   * Return true if this Lifecycle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lifecycle lifecycle = (Lifecycle) o;
    return Objects.equals(this.deleteGracePeriodSeconds, lifecycle.deleteGracePeriodSeconds) &&
        Objects.equals(this.desiredPhase, lifecycle.desiredPhase) &&
        Objects.equals(this.pauseGracePeriodSeconds, lifecycle.pauseGracePeriodSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteGracePeriodSeconds, desiredPhase, pauseGracePeriodSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lifecycle {\n");
    sb.append("    deleteGracePeriodSeconds: ").append(toIndentedString(deleteGracePeriodSeconds)).append("\n");
    sb.append("    desiredPhase: ").append(toIndentedString(desiredPhase)).append("\n");
    sb.append("    pauseGracePeriodSeconds: ").append(toIndentedString(pauseGracePeriodSeconds)).append("\n");
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

    // add `deleteGracePeriodSeconds` to the URL query string
    if (getDeleteGracePeriodSeconds() != null) {
      joiner.add(String.format("%sdeleteGracePeriodSeconds%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDeleteGracePeriodSeconds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `desiredPhase` to the URL query string
    if (getDesiredPhase() != null) {
      joiner.add(String.format("%sdesiredPhase%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDesiredPhase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pauseGracePeriodSeconds` to the URL query string
    if (getPauseGracePeriodSeconds() != null) {
      joiner.add(String.format("%spauseGracePeriodSeconds%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPauseGracePeriodSeconds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

