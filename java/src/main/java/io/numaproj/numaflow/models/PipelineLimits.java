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
 * PipelineLimits
 */
@JsonPropertyOrder({
  PipelineLimits.JSON_PROPERTY_BUFFER_MAX_LENGTH,
  PipelineLimits.JSON_PROPERTY_BUFFER_USAGE_LIMIT,
  PipelineLimits.JSON_PROPERTY_READ_BATCH_SIZE,
  PipelineLimits.JSON_PROPERTY_READ_TIMEOUT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PipelineLimits {
  public static final String JSON_PROPERTY_BUFFER_MAX_LENGTH = "bufferMaxLength";
  private Long bufferMaxLength;

  public static final String JSON_PROPERTY_BUFFER_USAGE_LIMIT = "bufferUsageLimit";
  private Long bufferUsageLimit;

  public static final String JSON_PROPERTY_READ_BATCH_SIZE = "readBatchSize";
  private Long readBatchSize;

  public static final String JSON_PROPERTY_READ_TIMEOUT = "readTimeout";
  private String readTimeout = null;


  public PipelineLimits bufferMaxLength(Long bufferMaxLength) {
    this.bufferMaxLength = bufferMaxLength;
    return this;
  }

   /**
   * BufferMaxLength is used to define the max length of a buffer Only applies to UDF and Source vertice as only they do buffer write. It can be overridden by the settings in vertex limits.
   * @return bufferMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BufferMaxLength is used to define the max length of a buffer Only applies to UDF and Source vertice as only they do buffer write. It can be overridden by the settings in vertex limits.")
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


  public PipelineLimits bufferUsageLimit(Long bufferUsageLimit) {
    this.bufferUsageLimit = bufferUsageLimit;
    return this;
  }

   /**
   * BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. Only applies to UDF and Source vertice as only they do buffer write. It will be overridden by the settings in vertex limits.
   * @return bufferUsageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. Only applies to UDF and Source vertice as only they do buffer write. It will be overridden by the settings in vertex limits.")
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


  public PipelineLimits readBatchSize(Long readBatchSize) {
    this.readBatchSize = readBatchSize;
    return this;
  }

   /**
   * Read batch size for all the vertices in the pipeline, can be overridden by the vertex&#39;s limit settings
   * @return readBatchSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read batch size for all the vertices in the pipeline, can be overridden by the vertex's limit settings")
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


  public PipelineLimits readTimeout(String readTimeout) {
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
   * Return true if this PipelineLimits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineLimits pipelineLimits = (PipelineLimits) o;
    return Objects.equals(this.bufferMaxLength, pipelineLimits.bufferMaxLength) &&
        Objects.equals(this.bufferUsageLimit, pipelineLimits.bufferUsageLimit) &&
        Objects.equals(this.readBatchSize, pipelineLimits.readBatchSize) &&
        Objects.equals(this.readTimeout, pipelineLimits.readTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferMaxLength, bufferUsageLimit, readBatchSize, readTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineLimits {\n");
    sb.append("    bufferMaxLength: ").append(toIndentedString(bufferMaxLength)).append("\n");
    sb.append("    bufferUsageLimit: ").append(toIndentedString(bufferUsageLimit)).append("\n");
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

