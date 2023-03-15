/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.numaproj.numaflow.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Watermark
 */
@JsonPropertyOrder({
  Watermark.JSON_PROPERTY_DISABLED,
  Watermark.JSON_PROPERTY_MAX_DELAY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Watermark {
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_MAX_DELAY = "maxDelay";
  private String maxDelay = null;


  public Watermark disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Disabled toggles the watermark propagation, defaults to false.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disabled toggles the watermark propagation, defaults to false.")
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


  public Watermark maxDelay(String maxDelay) {
    this.maxDelay = maxDelay;
    return this;
  }

   /**
   * Get maxDelay
   * @return maxDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
        Objects.equals(this.maxDelay, watermark.maxDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, maxDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watermark {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

}

