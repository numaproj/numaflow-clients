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
 * Scale defines the parameters for autoscaling.
 */
@ApiModel(description = "Scale defines the parameters for autoscaling.")
@JsonPropertyOrder({
  Scale.JSON_PROPERTY_COOLDOWN_SECONDS,
  Scale.JSON_PROPERTY_DISABLED,
  Scale.JSON_PROPERTY_LOOKBACK_SECONDS,
  Scale.JSON_PROPERTY_MAX,
  Scale.JSON_PROPERTY_MIN,
  Scale.JSON_PROPERTY_REPLICAS_PER_SCALE,
  Scale.JSON_PROPERTY_TARGET_BUFFER_USAGE,
  Scale.JSON_PROPERTY_TARGET_PROCESSING_SECONDS,
  Scale.JSON_PROPERTY_ZERO_REPLICA_SLEEP_SECONDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Scale {
  public static final String JSON_PROPERTY_COOLDOWN_SECONDS = "cooldownSeconds";
  private Long cooldownSeconds;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_LOOKBACK_SECONDS = "lookbackSeconds";
  private Long lookbackSeconds;

  public static final String JSON_PROPERTY_MAX = "max";
  private Integer max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_REPLICAS_PER_SCALE = "replicasPerScale";
  private Long replicasPerScale;

  public static final String JSON_PROPERTY_TARGET_BUFFER_USAGE = "targetBufferUsage";
  private Long targetBufferUsage;

  public static final String JSON_PROPERTY_TARGET_PROCESSING_SECONDS = "targetProcessingSeconds";
  private Long targetProcessingSeconds;

  public static final String JSON_PROPERTY_ZERO_REPLICA_SLEEP_SECONDS = "zeroReplicaSleepSeconds";
  private Long zeroReplicaSleepSeconds;


  public Scale cooldownSeconds(Long cooldownSeconds) {
    this.cooldownSeconds = cooldownSeconds;
    return this;
  }

   /**
   * Cooldown seconds after a scaling operation before another one.
   * @return cooldownSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cooldown seconds after a scaling operation before another one.")
  @JsonProperty(JSON_PROPERTY_COOLDOWN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCooldownSeconds() {
    return cooldownSeconds;
  }


  @JsonProperty(JSON_PROPERTY_COOLDOWN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCooldownSeconds(Long cooldownSeconds) {
    this.cooldownSeconds = cooldownSeconds;
  }


  public Scale disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether to disable autoscaling. Set to \&quot;true\&quot; when using Kubernetes HPA or any other 3rd party autoscaling strategies.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to disable autoscaling. Set to \"true\" when using Kubernetes HPA or any other 3rd party autoscaling strategies.")
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


  public Scale lookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
    return this;
  }

   /**
   * Lookback seconds to calculate the average pending messages and processing rate.
   * @return lookbackSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lookback seconds to calculate the average pending messages and processing rate.")
  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLookbackSeconds() {
    return lookbackSeconds;
  }


  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
  }


  public Scale max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum replicas.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum replicas.")
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Integer max) {
    this.max = max;
  }


  public Scale min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum replicas.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum replicas.")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Integer min) {
    this.min = min;
  }


  public Scale replicasPerScale(Long replicasPerScale) {
    this.replicasPerScale = replicasPerScale;
    return this;
  }

   /**
   * ReplicasPerScale defines maximum replicas can be scaled up or down at once. The is use to prevent too aggressive scaling operations
   * @return replicasPerScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReplicasPerScale defines maximum replicas can be scaled up or down at once. The is use to prevent too aggressive scaling operations")
  @JsonProperty(JSON_PROPERTY_REPLICAS_PER_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReplicasPerScale() {
    return replicasPerScale;
  }


  @JsonProperty(JSON_PROPERTY_REPLICAS_PER_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplicasPerScale(Long replicasPerScale) {
    this.replicasPerScale = replicasPerScale;
  }


  public Scale targetBufferUsage(Long targetBufferUsage) {
    this.targetBufferUsage = targetBufferUsage;
    return this;
  }

   /**
   * TargetBufferUsage is used to define the target percentage of usage of the buffer to be read. A valid and meaningful value should be less than the BufferUsageLimit defined in the Edge spec (or Pipeline spec), for example, 50. It only applies to UDF and Sink vertices as only they have buffers to read.
   * @return targetBufferUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TargetBufferUsage is used to define the target percentage of usage of the buffer to be read. A valid and meaningful value should be less than the BufferUsageLimit defined in the Edge spec (or Pipeline spec), for example, 50. It only applies to UDF and Sink vertices as only they have buffers to read.")
  @JsonProperty(JSON_PROPERTY_TARGET_BUFFER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetBufferUsage() {
    return targetBufferUsage;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_BUFFER_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetBufferUsage(Long targetBufferUsage) {
    this.targetBufferUsage = targetBufferUsage;
  }


  public Scale targetProcessingSeconds(Long targetProcessingSeconds) {
    this.targetProcessingSeconds = targetProcessingSeconds;
    return this;
  }

   /**
   * TargetProcessingSeconds is used to tune the aggressiveness of autoscaling for source vertices, it measures how fast you want the vertex to process all the pending messages. Typically increasing the value, which leads to lower processing rate, thus less replicas. It&#39;s only effective for source vertices.
   * @return targetProcessingSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TargetProcessingSeconds is used to tune the aggressiveness of autoscaling for source vertices, it measures how fast you want the vertex to process all the pending messages. Typically increasing the value, which leads to lower processing rate, thus less replicas. It's only effective for source vertices.")
  @JsonProperty(JSON_PROPERTY_TARGET_PROCESSING_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetProcessingSeconds() {
    return targetProcessingSeconds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PROCESSING_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetProcessingSeconds(Long targetProcessingSeconds) {
    this.targetProcessingSeconds = targetProcessingSeconds;
  }


  public Scale zeroReplicaSleepSeconds(Long zeroReplicaSleepSeconds) {
    this.zeroReplicaSleepSeconds = zeroReplicaSleepSeconds;
    return this;
  }

   /**
   * After scaling down to 0, sleep how many seconds before scaling up to peek.
   * @return zeroReplicaSleepSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "After scaling down to 0, sleep how many seconds before scaling up to peek.")
  @JsonProperty(JSON_PROPERTY_ZERO_REPLICA_SLEEP_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getZeroReplicaSleepSeconds() {
    return zeroReplicaSleepSeconds;
  }


  @JsonProperty(JSON_PROPERTY_ZERO_REPLICA_SLEEP_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZeroReplicaSleepSeconds(Long zeroReplicaSleepSeconds) {
    this.zeroReplicaSleepSeconds = zeroReplicaSleepSeconds;
  }


  /**
   * Return true if this Scale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scale scale = (Scale) o;
    return Objects.equals(this.cooldownSeconds, scale.cooldownSeconds) &&
        Objects.equals(this.disabled, scale.disabled) &&
        Objects.equals(this.lookbackSeconds, scale.lookbackSeconds) &&
        Objects.equals(this.max, scale.max) &&
        Objects.equals(this.min, scale.min) &&
        Objects.equals(this.replicasPerScale, scale.replicasPerScale) &&
        Objects.equals(this.targetBufferUsage, scale.targetBufferUsage) &&
        Objects.equals(this.targetProcessingSeconds, scale.targetProcessingSeconds) &&
        Objects.equals(this.zeroReplicaSleepSeconds, scale.zeroReplicaSleepSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cooldownSeconds, disabled, lookbackSeconds, max, min, replicasPerScale, targetBufferUsage, targetProcessingSeconds, zeroReplicaSleepSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scale {\n");
    sb.append("    cooldownSeconds: ").append(toIndentedString(cooldownSeconds)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    lookbackSeconds: ").append(toIndentedString(lookbackSeconds)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    replicasPerScale: ").append(toIndentedString(replicasPerScale)).append("\n");
    sb.append("    targetBufferUsage: ").append(toIndentedString(targetBufferUsage)).append("\n");
    sb.append("    targetProcessingSeconds: ").append(toIndentedString(targetProcessingSeconds)).append("\n");
    sb.append("    zeroReplicaSleepSeconds: ").append(toIndentedString(zeroReplicaSleepSeconds)).append("\n");
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

