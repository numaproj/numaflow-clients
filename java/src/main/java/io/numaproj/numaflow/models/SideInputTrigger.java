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
 * SideInputTrigger
 */
@JsonPropertyOrder({
  SideInputTrigger.JSON_PROPERTY_SCHEDULE,
  SideInputTrigger.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SideInputTrigger {
  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private String schedule;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;


  public SideInputTrigger schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The schedule to trigger the retrievement of the side input data. It supports cron format, for example, \&quot;0 30 * * * *\&quot;. Or interval based format, such as \&quot;@hourly\&quot;, \&quot;@every 1h30m\&quot;, etc.
   * @return schedule
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The schedule to trigger the retrievement of the side input data. It supports cron format, for example, \"0 30 * * * *\". Or interval based format, such as \"@hourly\", \"@every 1h30m\", etc.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public SideInputTrigger timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this SideInputTrigger object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SideInputTrigger sideInputTrigger = (SideInputTrigger) o;
    return Objects.equals(this.schedule, sideInputTrigger.schedule) &&
        Objects.equals(this.timezone, sideInputTrigger.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SideInputTrigger {\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

