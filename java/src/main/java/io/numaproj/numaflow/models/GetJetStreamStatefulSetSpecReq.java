/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.5
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
 * GetJetStreamStatefulSetSpecReq
 */
@JsonPropertyOrder({
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_CLIENT_PORT,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_CLUSTER_PORT,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_CONFIG_MAP_NAME,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_CONFIG_RELOADER_IMAGE,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_LABELS,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_METRICS_EXPORTER_IMAGE,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_METRICS_PORT,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_MONITOR_PORT,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_NATS_IMAGE,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_PVC_NAME_IF_NEEDED,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_SERVER_AUTH_SECRET_NAME,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_SERVER_ENCRYPTION_SECRET_NAME,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_SERVICE_NAME,
  GetJetStreamStatefulSetSpecReq.JSON_PROPERTY_START_COMMAND
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetJetStreamStatefulSetSpecReq {
  public static final String JSON_PROPERTY_CLIENT_PORT = "ClientPort";
  private Integer clientPort;

  public static final String JSON_PROPERTY_CLUSTER_PORT = "ClusterPort";
  private Integer clusterPort;

  public static final String JSON_PROPERTY_CONFIG_MAP_NAME = "ConfigMapName";
  private String configMapName;

  public static final String JSON_PROPERTY_CONFIG_RELOADER_IMAGE = "ConfigReloaderImage";
  private String configReloaderImage;

  public static final String JSON_PROPERTY_LABELS = "Labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_METRICS_EXPORTER_IMAGE = "MetricsExporterImage";
  private String metricsExporterImage;

  public static final String JSON_PROPERTY_METRICS_PORT = "MetricsPort";
  private Integer metricsPort;

  public static final String JSON_PROPERTY_MONITOR_PORT = "MonitorPort";
  private Integer monitorPort;

  public static final String JSON_PROPERTY_NATS_IMAGE = "NatsImage";
  private String natsImage;

  public static final String JSON_PROPERTY_PVC_NAME_IF_NEEDED = "PvcNameIfNeeded";
  private String pvcNameIfNeeded;

  public static final String JSON_PROPERTY_SERVER_AUTH_SECRET_NAME = "ServerAuthSecretName";
  private String serverAuthSecretName;

  public static final String JSON_PROPERTY_SERVER_ENCRYPTION_SECRET_NAME = "ServerEncryptionSecretName";
  private String serverEncryptionSecretName;

  public static final String JSON_PROPERTY_SERVICE_NAME = "ServiceName";
  private String serviceName;

  public static final String JSON_PROPERTY_START_COMMAND = "StartCommand";
  private String startCommand;


  public GetJetStreamStatefulSetSpecReq clientPort(Integer clientPort) {
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


  public GetJetStreamStatefulSetSpecReq clusterPort(Integer clusterPort) {
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


  public GetJetStreamStatefulSetSpecReq configMapName(String configMapName) {
    this.configMapName = configMapName;
    return this;
  }

   /**
   * Get configMapName
   * @return configMapName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfigMapName() {
    return configMapName;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigMapName(String configMapName) {
    this.configMapName = configMapName;
  }


  public GetJetStreamStatefulSetSpecReq configReloaderImage(String configReloaderImage) {
    this.configReloaderImage = configReloaderImage;
    return this;
  }

   /**
   * Get configReloaderImage
   * @return configReloaderImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_RELOADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfigReloaderImage() {
    return configReloaderImage;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_RELOADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigReloaderImage(String configReloaderImage) {
    this.configReloaderImage = configReloaderImage;
  }


  public GetJetStreamStatefulSetSpecReq labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GetJetStreamStatefulSetSpecReq putLabelsItem(String key, String labelsItem) {
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


  public GetJetStreamStatefulSetSpecReq metricsExporterImage(String metricsExporterImage) {
    this.metricsExporterImage = metricsExporterImage;
    return this;
  }

   /**
   * Get metricsExporterImage
   * @return metricsExporterImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRICS_EXPORTER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetricsExporterImage() {
    return metricsExporterImage;
  }


  @JsonProperty(JSON_PROPERTY_METRICS_EXPORTER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricsExporterImage(String metricsExporterImage) {
    this.metricsExporterImage = metricsExporterImage;
  }


  public GetJetStreamStatefulSetSpecReq metricsPort(Integer metricsPort) {
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


  public GetJetStreamStatefulSetSpecReq monitorPort(Integer monitorPort) {
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


  public GetJetStreamStatefulSetSpecReq natsImage(String natsImage) {
    this.natsImage = natsImage;
    return this;
  }

   /**
   * Get natsImage
   * @return natsImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NATS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNatsImage() {
    return natsImage;
  }


  @JsonProperty(JSON_PROPERTY_NATS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNatsImage(String natsImage) {
    this.natsImage = natsImage;
  }


  public GetJetStreamStatefulSetSpecReq pvcNameIfNeeded(String pvcNameIfNeeded) {
    this.pvcNameIfNeeded = pvcNameIfNeeded;
    return this;
  }

   /**
   * Get pvcNameIfNeeded
   * @return pvcNameIfNeeded
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PVC_NAME_IF_NEEDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPvcNameIfNeeded() {
    return pvcNameIfNeeded;
  }


  @JsonProperty(JSON_PROPERTY_PVC_NAME_IF_NEEDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPvcNameIfNeeded(String pvcNameIfNeeded) {
    this.pvcNameIfNeeded = pvcNameIfNeeded;
  }


  public GetJetStreamStatefulSetSpecReq serverAuthSecretName(String serverAuthSecretName) {
    this.serverAuthSecretName = serverAuthSecretName;
    return this;
  }

   /**
   * Get serverAuthSecretName
   * @return serverAuthSecretName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_AUTH_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerAuthSecretName() {
    return serverAuthSecretName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_AUTH_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerAuthSecretName(String serverAuthSecretName) {
    this.serverAuthSecretName = serverAuthSecretName;
  }


  public GetJetStreamStatefulSetSpecReq serverEncryptionSecretName(String serverEncryptionSecretName) {
    this.serverEncryptionSecretName = serverEncryptionSecretName;
    return this;
  }

   /**
   * Get serverEncryptionSecretName
   * @return serverEncryptionSecretName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_ENCRYPTION_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerEncryptionSecretName() {
    return serverEncryptionSecretName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_ENCRYPTION_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerEncryptionSecretName(String serverEncryptionSecretName) {
    this.serverEncryptionSecretName = serverEncryptionSecretName;
  }


  public GetJetStreamStatefulSetSpecReq serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public GetJetStreamStatefulSetSpecReq startCommand(String startCommand) {
    this.startCommand = startCommand;
    return this;
  }

   /**
   * Get startCommand
   * @return startCommand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_START_COMMAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartCommand() {
    return startCommand;
  }


  @JsonProperty(JSON_PROPERTY_START_COMMAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartCommand(String startCommand) {
    this.startCommand = startCommand;
  }


  /**
   * Return true if this GetJetStreamStatefulSetSpecReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJetStreamStatefulSetSpecReq getJetStreamStatefulSetSpecReq = (GetJetStreamStatefulSetSpecReq) o;
    return Objects.equals(this.clientPort, getJetStreamStatefulSetSpecReq.clientPort) &&
        Objects.equals(this.clusterPort, getJetStreamStatefulSetSpecReq.clusterPort) &&
        Objects.equals(this.configMapName, getJetStreamStatefulSetSpecReq.configMapName) &&
        Objects.equals(this.configReloaderImage, getJetStreamStatefulSetSpecReq.configReloaderImage) &&
        Objects.equals(this.labels, getJetStreamStatefulSetSpecReq.labels) &&
        Objects.equals(this.metricsExporterImage, getJetStreamStatefulSetSpecReq.metricsExporterImage) &&
        Objects.equals(this.metricsPort, getJetStreamStatefulSetSpecReq.metricsPort) &&
        Objects.equals(this.monitorPort, getJetStreamStatefulSetSpecReq.monitorPort) &&
        Objects.equals(this.natsImage, getJetStreamStatefulSetSpecReq.natsImage) &&
        Objects.equals(this.pvcNameIfNeeded, getJetStreamStatefulSetSpecReq.pvcNameIfNeeded) &&
        Objects.equals(this.serverAuthSecretName, getJetStreamStatefulSetSpecReq.serverAuthSecretName) &&
        Objects.equals(this.serverEncryptionSecretName, getJetStreamStatefulSetSpecReq.serverEncryptionSecretName) &&
        Objects.equals(this.serviceName, getJetStreamStatefulSetSpecReq.serviceName) &&
        Objects.equals(this.startCommand, getJetStreamStatefulSetSpecReq.startCommand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientPort, clusterPort, configMapName, configReloaderImage, labels, metricsExporterImage, metricsPort, monitorPort, natsImage, pvcNameIfNeeded, serverAuthSecretName, serverEncryptionSecretName, serviceName, startCommand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJetStreamStatefulSetSpecReq {\n");
    sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
    sb.append("    clusterPort: ").append(toIndentedString(clusterPort)).append("\n");
    sb.append("    configMapName: ").append(toIndentedString(configMapName)).append("\n");
    sb.append("    configReloaderImage: ").append(toIndentedString(configReloaderImage)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    metricsExporterImage: ").append(toIndentedString(metricsExporterImage)).append("\n");
    sb.append("    metricsPort: ").append(toIndentedString(metricsPort)).append("\n");
    sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
    sb.append("    natsImage: ").append(toIndentedString(natsImage)).append("\n");
    sb.append("    pvcNameIfNeeded: ").append(toIndentedString(pvcNameIfNeeded)).append("\n");
    sb.append("    serverAuthSecretName: ").append(toIndentedString(serverAuthSecretName)).append("\n");
    sb.append("    serverEncryptionSecretName: ").append(toIndentedString(serverEncryptionSecretName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    startCommand: ").append(toIndentedString(startCommand)).append("\n");
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

