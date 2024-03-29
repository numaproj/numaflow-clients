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
import io.numaproj.numaflow.models.TLS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * KafkaSink
 */
@JsonPropertyOrder({
  KafkaSink.JSON_PROPERTY_BROKERS,
  KafkaSink.JSON_PROPERTY_CONFIG,
  KafkaSink.JSON_PROPERTY_TLS,
  KafkaSink.JSON_PROPERTY_TOPIC
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaSink {
  public static final String JSON_PROPERTY_BROKERS = "brokers";
  private List<String> brokers = null;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private String config;

  public static final String JSON_PROPERTY_TLS = "tls";
  private TLS tls;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;


  public KafkaSink brokers(List<String> brokers) {
    this.brokers = brokers;
    return this;
  }

  public KafkaSink addBrokersItem(String brokersItem) {
    if (this.brokers == null) {
      this.brokers = new ArrayList<>();
    }
    this.brokers.add(brokersItem);
    return this;
  }

   /**
   * Get brokers
   * @return brokers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBrokers() {
    return brokers;
  }


  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrokers(List<String> brokers) {
    this.brokers = brokers;
  }


  public KafkaSink config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(String config) {
    this.config = config;
  }


  public KafkaSink tls(TLS tls) {
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TLS getTls() {
    return tls;
  }


  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTls(TLS tls) {
    this.tls = tls;
  }


  public KafkaSink topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  /**
   * Return true if this KafkaSink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaSink kafkaSink = (KafkaSink) o;
    return Objects.equals(this.brokers, kafkaSink.brokers) &&
        Objects.equals(this.config, kafkaSink.config) &&
        Objects.equals(this.tls, kafkaSink.tls) &&
        Objects.equals(this.topic, kafkaSink.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokers, config, tls, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaSink {\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

