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
import io.numaproj.numaflow.models.KafkaSink;
import io.numaproj.numaflow.models.UDSink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sink
 */
@JsonPropertyOrder({
  Sink.JSON_PROPERTY_BLACKHOLE,
  Sink.JSON_PROPERTY_KAFKA,
  Sink.JSON_PROPERTY_LOG,
  Sink.JSON_PROPERTY_UDSINK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Sink {
  public static final String JSON_PROPERTY_BLACKHOLE = "blackhole";
  private Object blackhole;

  public static final String JSON_PROPERTY_KAFKA = "kafka";
  private KafkaSink kafka;

  public static final String JSON_PROPERTY_LOG = "log";
  private Object log;

  public static final String JSON_PROPERTY_UDSINK = "udsink";
  private UDSink udsink;


  public Sink blackhole(Object blackhole) {
    this.blackhole = blackhole;
    return this;
  }

   /**
   * Blackhole is a sink to emulate /dev/null
   * @return blackhole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Blackhole is a sink to emulate /dev/null")
  @JsonProperty(JSON_PROPERTY_BLACKHOLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBlackhole() {
    return blackhole;
  }


  @JsonProperty(JSON_PROPERTY_BLACKHOLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackhole(Object blackhole) {
    this.blackhole = blackhole;
  }


  public Sink kafka(KafkaSink kafka) {
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KafkaSink getKafka() {
    return kafka;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafka(KafkaSink kafka) {
    this.kafka = kafka;
  }


  public Sink log(Object log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLog() {
    return log;
  }


  @JsonProperty(JSON_PROPERTY_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLog(Object log) {
    this.log = log;
  }


  public Sink udsink(UDSink udsink) {
    this.udsink = udsink;
    return this;
  }

   /**
   * Get udsink
   * @return udsink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UDSINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UDSink getUdsink() {
    return udsink;
  }


  @JsonProperty(JSON_PROPERTY_UDSINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdsink(UDSink udsink) {
    this.udsink = udsink;
  }


  /**
   * Return true if this Sink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sink sink = (Sink) o;
    return Objects.equals(this.blackhole, sink.blackhole) &&
        Objects.equals(this.kafka, sink.kafka) &&
        Objects.equals(this.log, sink.log) &&
        Objects.equals(this.udsink, sink.udsink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackhole, kafka, log, udsink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sink {\n");
    sb.append("    blackhole: ").append(toIndentedString(blackhole)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    udsink: ").append(toIndentedString(udsink)).append("\n");
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

