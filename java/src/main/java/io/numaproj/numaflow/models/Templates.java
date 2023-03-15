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
import io.numaproj.numaflow.models.DaemonTemplate;
import io.numaproj.numaflow.models.JobTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Templates
 */
@JsonPropertyOrder({
  Templates.JSON_PROPERTY_DAEMON,
  Templates.JSON_PROPERTY_JOB
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Templates {
  public static final String JSON_PROPERTY_DAEMON = "daemon";
  private DaemonTemplate daemon;

  public static final String JSON_PROPERTY_JOB = "job";
  private JobTemplate job;


  public Templates daemon(DaemonTemplate daemon) {
    this.daemon = daemon;
    return this;
  }

   /**
   * Get daemon
   * @return daemon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAEMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DaemonTemplate getDaemon() {
    return daemon;
  }


  @JsonProperty(JSON_PROPERTY_DAEMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaemon(DaemonTemplate daemon) {
    this.daemon = daemon;
  }


  public Templates job(JobTemplate job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobTemplate getJob() {
    return job;
  }


  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJob(JobTemplate job) {
    this.job = job;
  }


  /**
   * Return true if this Templates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templates templates = (Templates) o;
    return Objects.equals(this.daemon, templates.daemon) &&
        Objects.equals(this.job, templates.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daemon, job);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templates {\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

