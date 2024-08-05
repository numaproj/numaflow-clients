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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetJetStreamServiceSpecReq
 */
@JsonPropertyOrder({
  GetJetStreamServiceSpecReq.JSON_PROPERTY_CLIENT_PORT,
  GetJetStreamServiceSpecReq.JSON_PROPERTY_CLUSTER_PORT,
  GetJetStreamServiceSpecReq.JSON_PROPERTY_LABELS,
  GetJetStreamServiceSpecReq.JSON_PROPERTY_METRICS_PORT,
  GetJetStreamServiceSpecReq.JSON_PROPERTY_MONITOR_PORT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetJetStreamServiceSpecReq {
  public static final String JSON_PROPERTY_CLIENT_PORT = "ClientPort";
  private Integer clientPort;

  public static final String JSON_PROPERTY_CLUSTER_PORT = "ClusterPort";
  private Integer clusterPort;

  public static final String JSON_PROPERTY_LABELS = "Labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_METRICS_PORT = "MetricsPort";
  private Integer metricsPort;

  public static final String JSON_PROPERTY_MONITOR_PORT = "MonitorPort";
  private Integer monitorPort;


  public GetJetStreamServiceSpecReq clientPort(Integer clientPort) {
    this.clientPort = clientPort;
    return this;
  }

   /**
   * Get clientPort
   * @return clientPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getClientPort() {
    return clientPort;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientPort(Integer clientPort) {
    this.clientPort = clientPort;
  }


  public GetJetStreamServiceSpecReq clusterPort(Integer clusterPort) {
    this.clusterPort = clusterPort;
    return this;
  }

   /**
   * Get clusterPort
   * @return clusterPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getClusterPort() {
    return clusterPort;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterPort(Integer clusterPort) {
    this.clusterPort = clusterPort;
  }


  public GetJetStreamServiceSpecReq labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GetJetStreamServiceSpecReq putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public GetJetStreamServiceSpecReq metricsPort(Integer metricsPort) {
    this.metricsPort = metricsPort;
    return this;
  }

   /**
   * Get metricsPort
   * @return metricsPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRICS_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMetricsPort() {
    return metricsPort;
  }


  @JsonProperty(JSON_PROPERTY_METRICS_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricsPort(Integer metricsPort) {
    this.metricsPort = metricsPort;
  }


  public GetJetStreamServiceSpecReq monitorPort(Integer monitorPort) {
    this.monitorPort = monitorPort;
    return this;
  }

   /**
   * Get monitorPort
   * @return monitorPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMonitorPort() {
    return monitorPort;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitorPort(Integer monitorPort) {
    this.monitorPort = monitorPort;
  }


  /**
   * Return true if this GetJetStreamServiceSpecReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJetStreamServiceSpecReq getJetStreamServiceSpecReq = (GetJetStreamServiceSpecReq) o;
    return Objects.equals(this.clientPort, getJetStreamServiceSpecReq.clientPort) &&
        Objects.equals(this.clusterPort, getJetStreamServiceSpecReq.clusterPort) &&
        Objects.equals(this.labels, getJetStreamServiceSpecReq.labels) &&
        Objects.equals(this.metricsPort, getJetStreamServiceSpecReq.metricsPort) &&
        Objects.equals(this.monitorPort, getJetStreamServiceSpecReq.monitorPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientPort, clusterPort, labels, metricsPort, monitorPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJetStreamServiceSpecReq {\n");
    sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
    sb.append("    clusterPort: ").append(toIndentedString(clusterPort)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    metricsPort: ").append(toIndentedString(metricsPort)).append("\n");
    sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
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

