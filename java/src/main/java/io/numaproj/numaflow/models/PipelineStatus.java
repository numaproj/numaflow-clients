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
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PipelineStatus
 */
@JsonPropertyOrder({
  PipelineStatus.JSON_PROPERTY_CONDITIONS,
  PipelineStatus.JSON_PROPERTY_LAST_UPDATED,
  PipelineStatus.JSON_PROPERTY_MESSAGE,
  PipelineStatus.JSON_PROPERTY_PHASE,
  PipelineStatus.JSON_PROPERTY_SINK_COUNT,
  PipelineStatus.JSON_PROPERTY_SOURCE_COUNT,
  PipelineStatus.JSON_PROPERTY_UDF_COUNT,
  PipelineStatus.JSON_PROPERTY_VERTEX_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PipelineStatus {
  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<V1Condition> conditions = null;

  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private java.time.Instant lastUpdated = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PHASE = "phase";
  private String phase;

  public static final String JSON_PROPERTY_SINK_COUNT = "sinkCount";
  private Long sinkCount;

  public static final String JSON_PROPERTY_SOURCE_COUNT = "sourceCount";
  private Long sourceCount;

  public static final String JSON_PROPERTY_UDF_COUNT = "udfCount";
  private Long udfCount;

  public static final String JSON_PROPERTY_VERTEX_COUNT = "vertexCount";
  private Long vertexCount;


  public PipelineStatus conditions(List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public PipelineStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions are the latest available observations of a resource&#39;s current state.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions are the latest available observations of a resource's current state.")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1Condition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public PipelineStatus lastUpdated(java.time.Instant lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.Instant getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(java.time.Instant lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public PipelineStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public PipelineStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhase() {
    return phase;
  }


  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhase(String phase) {
    this.phase = phase;
  }


  public PipelineStatus sinkCount(Long sinkCount) {
    this.sinkCount = sinkCount;
    return this;
  }

   /**
   * Get sinkCount
   * @return sinkCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSinkCount() {
    return sinkCount;
  }


  @JsonProperty(JSON_PROPERTY_SINK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSinkCount(Long sinkCount) {
    this.sinkCount = sinkCount;
  }


  public PipelineStatus sourceCount(Long sourceCount) {
    this.sourceCount = sourceCount;
    return this;
  }

   /**
   * Get sourceCount
   * @return sourceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSourceCount() {
    return sourceCount;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceCount(Long sourceCount) {
    this.sourceCount = sourceCount;
  }


  public PipelineStatus udfCount(Long udfCount) {
    this.udfCount = udfCount;
    return this;
  }

   /**
   * Get udfCount
   * @return udfCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UDF_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUdfCount() {
    return udfCount;
  }


  @JsonProperty(JSON_PROPERTY_UDF_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdfCount(Long udfCount) {
    this.udfCount = udfCount;
  }


  public PipelineStatus vertexCount(Long vertexCount) {
    this.vertexCount = vertexCount;
    return this;
  }

   /**
   * Get vertexCount
   * @return vertexCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERTEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVertexCount() {
    return vertexCount;
  }


  @JsonProperty(JSON_PROPERTY_VERTEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVertexCount(Long vertexCount) {
    this.vertexCount = vertexCount;
  }


  /**
   * Return true if this PipelineStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStatus pipelineStatus = (PipelineStatus) o;
    return Objects.equals(this.conditions, pipelineStatus.conditions) &&
        Objects.equals(this.lastUpdated, pipelineStatus.lastUpdated) &&
        Objects.equals(this.message, pipelineStatus.message) &&
        Objects.equals(this.phase, pipelineStatus.phase) &&
        Objects.equals(this.sinkCount, pipelineStatus.sinkCount) &&
        Objects.equals(this.sourceCount, pipelineStatus.sourceCount) &&
        Objects.equals(this.udfCount, pipelineStatus.udfCount) &&
        Objects.equals(this.vertexCount, pipelineStatus.vertexCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, lastUpdated, message, phase, sinkCount, sourceCount, udfCount, vertexCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    sinkCount: ").append(toIndentedString(sinkCount)).append("\n");
    sb.append("    sourceCount: ").append(toIndentedString(sourceCount)).append("\n");
    sb.append("    udfCount: ").append(toIndentedString(udfCount)).append("\n");
    sb.append("    vertexCount: ").append(toIndentedString(vertexCount)).append("\n");
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

