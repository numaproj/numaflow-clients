/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.2
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
 * VertexLimits
 */
@JsonPropertyOrder({
  VertexLimits.JSON_PROPERTY_READ_BATCH_SIZE,
  VertexLimits.JSON_PROPERTY_READ_TIMEOUT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VertexLimits {
  public static final String JSON_PROPERTY_READ_BATCH_SIZE = "readBatchSize";
  private Long readBatchSize;

  public static final String JSON_PROPERTY_READ_TIMEOUT = "readTimeout";
  private String readTimeout = null;


  public VertexLimits readBatchSize(Long readBatchSize) {
    this.readBatchSize = readBatchSize;
    return this;
  }

   /**
   * Read batch size from the source or buffer. It overrides the settings from pipeline limits.
   * @return readBatchSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read batch size from the source or buffer. It overrides the settings from pipeline limits.")
  @JsonProperty(JSON_PROPERTY_READ_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReadBatchSize() {
    return readBatchSize;
  }


  @JsonProperty(JSON_PROPERTY_READ_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadBatchSize(Long readBatchSize) {
    this.readBatchSize = readBatchSize;
  }


  public VertexLimits readTimeout(String readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

   /**
   * Get readTimeout
   * @return readTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_READ_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReadTimeout() {
    return readTimeout;
  }


  @JsonProperty(JSON_PROPERTY_READ_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadTimeout(String readTimeout) {
    this.readTimeout = readTimeout;
  }


  /**
   * Return true if this VertexLimits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VertexLimits vertexLimits = (VertexLimits) o;
    return Objects.equals(this.readBatchSize, vertexLimits.readBatchSize) &&
        Objects.equals(this.readTimeout, vertexLimits.readTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readBatchSize, readTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VertexLimits {\n");
    sb.append("    readBatchSize: ").append(toIndentedString(readBatchSize)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
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

