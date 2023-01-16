/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
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
 * EdgeLimits
 */
@JsonPropertyOrder({
  EdgeLimits.JSON_PROPERTY_BUFFER_MAX_LENGTH,
  EdgeLimits.JSON_PROPERTY_BUFFER_USAGE_LIMIT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EdgeLimits {
  public static final String JSON_PROPERTY_BUFFER_MAX_LENGTH = "bufferMaxLength";
  private Long bufferMaxLength;

  public static final String JSON_PROPERTY_BUFFER_USAGE_LIMIT = "bufferUsageLimit";
  private Long bufferUsageLimit;


  public EdgeLimits bufferMaxLength(Long bufferMaxLength) {
    this.bufferMaxLength = bufferMaxLength;
    return this;
  }

   /**
   * BufferMaxLength is used to define the max length of a buffer. It overrides the settings from pipeline limits.
   * @return bufferMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BufferMaxLength is used to define the max length of a buffer. It overrides the settings from pipeline limits.")
  @JsonProperty(JSON_PROPERTY_BUFFER_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBufferMaxLength() {
    return bufferMaxLength;
  }


  @JsonProperty(JSON_PROPERTY_BUFFER_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBufferMaxLength(Long bufferMaxLength) {
    this.bufferMaxLength = bufferMaxLength;
  }


  public EdgeLimits bufferUsageLimit(Long bufferUsageLimit) {
    this.bufferUsageLimit = bufferUsageLimit;
    return this;
  }

   /**
   * BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. It overrides the settings from pipeline limits.
   * @return bufferUsageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. It overrides the settings from pipeline limits.")
  @JsonProperty(JSON_PROPERTY_BUFFER_USAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBufferUsageLimit() {
    return bufferUsageLimit;
  }


  @JsonProperty(JSON_PROPERTY_BUFFER_USAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBufferUsageLimit(Long bufferUsageLimit) {
    this.bufferUsageLimit = bufferUsageLimit;
  }


  /**
   * Return true if this EdgeLimits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeLimits edgeLimits = (EdgeLimits) o;
    return Objects.equals(this.bufferMaxLength, edgeLimits.bufferMaxLength) &&
        Objects.equals(this.bufferUsageLimit, edgeLimits.bufferUsageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferMaxLength, bufferUsageLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLimits {\n");
    sb.append("    bufferMaxLength: ").append(toIndentedString(bufferMaxLength)).append("\n");
    sb.append("    bufferUsageLimit: ").append(toIndentedString(bufferUsageLimit)).append("\n");
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

