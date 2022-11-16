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
import io.numaproj.numaflow.models.TLS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * KafkaSource
 */
@JsonPropertyOrder({
  KafkaSource.JSON_PROPERTY_BROKERS,
  KafkaSource.JSON_PROPERTY_CONFIG,
  KafkaSource.JSON_PROPERTY_CONSUMER_GROUP,
  KafkaSource.JSON_PROPERTY_TLS,
  KafkaSource.JSON_PROPERTY_TOPIC
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaSource {
  public static final String JSON_PROPERTY_BROKERS = "brokers";
  private List<String> brokers = null;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private String config;

  public static final String JSON_PROPERTY_CONSUMER_GROUP = "consumerGroup";
  private String consumerGroup;

  public static final String JSON_PROPERTY_TLS = "tls";
  private TLS tls;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;


  public KafkaSource brokers(List<String> brokers) {
    this.brokers = brokers;
    return this;
  }

  public KafkaSource addBrokersItem(String brokersItem) {
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


  public KafkaSource config(String config) {
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


  public KafkaSource consumerGroup(String consumerGroup) {
    this.consumerGroup = consumerGroup;
    return this;
  }

   /**
   * Get consumerGroup
   * @return consumerGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSUMER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConsumerGroup() {
    return consumerGroup;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerGroup(String consumerGroup) {
    this.consumerGroup = consumerGroup;
  }


  public KafkaSource tls(TLS tls) {
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


  public KafkaSource topic(String topic) {
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
   * Return true if this KafkaSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaSource kafkaSource = (KafkaSource) o;
    return Objects.equals(this.brokers, kafkaSource.brokers) &&
        Objects.equals(this.config, kafkaSource.config) &&
        Objects.equals(this.consumerGroup, kafkaSource.consumerGroup) &&
        Objects.equals(this.tls, kafkaSource.tls) &&
        Objects.equals(this.topic, kafkaSource.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokers, config, consumerGroup, tls, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaSource {\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
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

