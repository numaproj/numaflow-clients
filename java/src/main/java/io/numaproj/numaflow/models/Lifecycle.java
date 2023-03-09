/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.1
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
 * Lifecycle
 */
@JsonPropertyOrder({
  Lifecycle.JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS,
  Lifecycle.JSON_PROPERTY_DESIRED_PHASE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Lifecycle {
  public static final String JSON_PROPERTY_DELETE_GRACE_PERIOD_SECONDS = "deleteGracePeriodSeconds";
  private Integer deleteGracePeriodSeconds;

  public static final String JSON_PROPERTY_DESIRED_PHASE = "desiredPhase";
  private String desiredPhase;


  public Lifecycle deleteGracePeriodSeconds(Integer deleteGracePeriodSeconds) {
    this.deleteGracePeriodSeconds = deleteGracePeriodSeconds;
    return this;
  }

   /**
   * DeleteGracePeriodSeconds used to delete pipeline gracefully
   * @return deleteGracePeriodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeleteGracePeriodSeconds used to delete pipeline gracefully")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DesiredPhase used to bring the pipeline from current phase to desired phase")
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
        Objects.equals(this.desiredPhase, lifecycle.desiredPhase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteGracePeriodSeconds, desiredPhase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lifecycle {\n");
    sb.append("    deleteGracePeriodSeconds: ").append(toIndentedString(deleteGracePeriodSeconds)).append("\n");
    sb.append("    desiredPhase: ").append(toIndentedString(desiredPhase)).append("\n");
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

