/*
 * Numaflow
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
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
 * GetRedisStatefulSetSpecReq
 */
@JsonPropertyOrder({
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_CONF_CONFIG_MAP_NAME,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_CREDENTIAL_SECRET_NAME,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_HEALTH_CONFIG_MAP_NAME,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_INIT_CONTAINER_IMAGE,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_LABELS,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_METRICS_EXPORTER_IMAGE,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_PVC_NAME_IF_NEEDED,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_REDIS_CONTAINER_PORT,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_REDIS_IMAGE,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_REDIS_METRICS_CONTAINER_PORT,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_SCRIPTS_CONFIG_MAP_NAME,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_SENTINEL_CONTAINER_PORT,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_SENTINEL_IMAGE,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_SERVICE_NAME,
  GetRedisStatefulSetSpecReq.JSON_PROPERTY_TL_S_ENABLED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetRedisStatefulSetSpecReq {
  public static final String JSON_PROPERTY_CONF_CONFIG_MAP_NAME = "ConfConfigMapName";
  private String confConfigMapName;

  public static final String JSON_PROPERTY_CREDENTIAL_SECRET_NAME = "CredentialSecretName";
  private String credentialSecretName;

  public static final String JSON_PROPERTY_HEALTH_CONFIG_MAP_NAME = "HealthConfigMapName";
  private String healthConfigMapName;

  public static final String JSON_PROPERTY_INIT_CONTAINER_IMAGE = "InitContainerImage";
  private String initContainerImage;

  public static final String JSON_PROPERTY_LABELS = "Labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_METRICS_EXPORTER_IMAGE = "MetricsExporterImage";
  private String metricsExporterImage;

  public static final String JSON_PROPERTY_PVC_NAME_IF_NEEDED = "PvcNameIfNeeded";
  private String pvcNameIfNeeded;

  public static final String JSON_PROPERTY_REDIS_CONTAINER_PORT = "RedisContainerPort";
  private Integer redisContainerPort;

  public static final String JSON_PROPERTY_REDIS_IMAGE = "RedisImage";
  private String redisImage;

  public static final String JSON_PROPERTY_REDIS_METRICS_CONTAINER_PORT = "RedisMetricsContainerPort";
  private Integer redisMetricsContainerPort;

  public static final String JSON_PROPERTY_SCRIPTS_CONFIG_MAP_NAME = "ScriptsConfigMapName";
  private String scriptsConfigMapName;

  public static final String JSON_PROPERTY_SENTINEL_CONTAINER_PORT = "SentinelContainerPort";
  private Integer sentinelContainerPort;

  public static final String JSON_PROPERTY_SENTINEL_IMAGE = "SentinelImage";
  private String sentinelImage;

  public static final String JSON_PROPERTY_SERVICE_NAME = "ServiceName";
  private String serviceName;

  public static final String JSON_PROPERTY_TL_S_ENABLED = "TLSEnabled";
  private Boolean tlSEnabled;


  public GetRedisStatefulSetSpecReq confConfigMapName(String confConfigMapName) {
    this.confConfigMapName = confConfigMapName;
    return this;
  }

   /**
   * Get confConfigMapName
   * @return confConfigMapName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONF_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfConfigMapName() {
    return confConfigMapName;
  }


  @JsonProperty(JSON_PROPERTY_CONF_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfConfigMapName(String confConfigMapName) {
    this.confConfigMapName = confConfigMapName;
  }


  public GetRedisStatefulSetSpecReq credentialSecretName(String credentialSecretName) {
    this.credentialSecretName = credentialSecretName;
    return this;
  }

   /**
   * Get credentialSecretName
   * @return credentialSecretName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCredentialSecretName() {
    return credentialSecretName;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentialSecretName(String credentialSecretName) {
    this.credentialSecretName = credentialSecretName;
  }


  public GetRedisStatefulSetSpecReq healthConfigMapName(String healthConfigMapName) {
    this.healthConfigMapName = healthConfigMapName;
    return this;
  }

   /**
   * Get healthConfigMapName
   * @return healthConfigMapName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEALTH_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHealthConfigMapName() {
    return healthConfigMapName;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHealthConfigMapName(String healthConfigMapName) {
    this.healthConfigMapName = healthConfigMapName;
  }


  public GetRedisStatefulSetSpecReq initContainerImage(String initContainerImage) {
    this.initContainerImage = initContainerImage;
    return this;
  }

   /**
   * Get initContainerImage
   * @return initContainerImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INIT_CONTAINER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInitContainerImage() {
    return initContainerImage;
  }


  @JsonProperty(JSON_PROPERTY_INIT_CONTAINER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitContainerImage(String initContainerImage) {
    this.initContainerImage = initContainerImage;
  }


  public GetRedisStatefulSetSpecReq labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public GetRedisStatefulSetSpecReq putLabelsItem(String key, String labelsItem) {
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


  public GetRedisStatefulSetSpecReq metricsExporterImage(String metricsExporterImage) {
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


  public GetRedisStatefulSetSpecReq pvcNameIfNeeded(String pvcNameIfNeeded) {
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


  public GetRedisStatefulSetSpecReq redisContainerPort(Integer redisContainerPort) {
    this.redisContainerPort = redisContainerPort;
    return this;
  }

   /**
   * Get redisContainerPort
   * @return redisContainerPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDIS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRedisContainerPort() {
    return redisContainerPort;
  }


  @JsonProperty(JSON_PROPERTY_REDIS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedisContainerPort(Integer redisContainerPort) {
    this.redisContainerPort = redisContainerPort;
  }


  public GetRedisStatefulSetSpecReq redisImage(String redisImage) {
    this.redisImage = redisImage;
    return this;
  }

   /**
   * Get redisImage
   * @return redisImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDIS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedisImage() {
    return redisImage;
  }


  @JsonProperty(JSON_PROPERTY_REDIS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedisImage(String redisImage) {
    this.redisImage = redisImage;
  }


  public GetRedisStatefulSetSpecReq redisMetricsContainerPort(Integer redisMetricsContainerPort) {
    this.redisMetricsContainerPort = redisMetricsContainerPort;
    return this;
  }

   /**
   * Get redisMetricsContainerPort
   * @return redisMetricsContainerPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDIS_METRICS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRedisMetricsContainerPort() {
    return redisMetricsContainerPort;
  }


  @JsonProperty(JSON_PROPERTY_REDIS_METRICS_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedisMetricsContainerPort(Integer redisMetricsContainerPort) {
    this.redisMetricsContainerPort = redisMetricsContainerPort;
  }


  public GetRedisStatefulSetSpecReq scriptsConfigMapName(String scriptsConfigMapName) {
    this.scriptsConfigMapName = scriptsConfigMapName;
    return this;
  }

   /**
   * Get scriptsConfigMapName
   * @return scriptsConfigMapName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SCRIPTS_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScriptsConfigMapName() {
    return scriptsConfigMapName;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPTS_CONFIG_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScriptsConfigMapName(String scriptsConfigMapName) {
    this.scriptsConfigMapName = scriptsConfigMapName;
  }


  public GetRedisStatefulSetSpecReq sentinelContainerPort(Integer sentinelContainerPort) {
    this.sentinelContainerPort = sentinelContainerPort;
    return this;
  }

   /**
   * Get sentinelContainerPort
   * @return sentinelContainerPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SENTINEL_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSentinelContainerPort() {
    return sentinelContainerPort;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL_CONTAINER_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentinelContainerPort(Integer sentinelContainerPort) {
    this.sentinelContainerPort = sentinelContainerPort;
  }


  public GetRedisStatefulSetSpecReq sentinelImage(String sentinelImage) {
    this.sentinelImage = sentinelImage;
    return this;
  }

   /**
   * Get sentinelImage
   * @return sentinelImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SENTINEL_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSentinelImage() {
    return sentinelImage;
  }


  @JsonProperty(JSON_PROPERTY_SENTINEL_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentinelImage(String sentinelImage) {
    this.sentinelImage = sentinelImage;
  }


  public GetRedisStatefulSetSpecReq serviceName(String serviceName) {
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


  public GetRedisStatefulSetSpecReq tlSEnabled(Boolean tlSEnabled) {
    this.tlSEnabled = tlSEnabled;
    return this;
  }

   /**
   * Get tlSEnabled
   * @return tlSEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TL_S_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTlSEnabled() {
    return tlSEnabled;
  }


  @JsonProperty(JSON_PROPERTY_TL_S_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTlSEnabled(Boolean tlSEnabled) {
    this.tlSEnabled = tlSEnabled;
  }


  /**
   * Return true if this GetRedisStatefulSetSpecReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRedisStatefulSetSpecReq getRedisStatefulSetSpecReq = (GetRedisStatefulSetSpecReq) o;
    return Objects.equals(this.confConfigMapName, getRedisStatefulSetSpecReq.confConfigMapName) &&
        Objects.equals(this.credentialSecretName, getRedisStatefulSetSpecReq.credentialSecretName) &&
        Objects.equals(this.healthConfigMapName, getRedisStatefulSetSpecReq.healthConfigMapName) &&
        Objects.equals(this.initContainerImage, getRedisStatefulSetSpecReq.initContainerImage) &&
        Objects.equals(this.labels, getRedisStatefulSetSpecReq.labels) &&
        Objects.equals(this.metricsExporterImage, getRedisStatefulSetSpecReq.metricsExporterImage) &&
        Objects.equals(this.pvcNameIfNeeded, getRedisStatefulSetSpecReq.pvcNameIfNeeded) &&
        Objects.equals(this.redisContainerPort, getRedisStatefulSetSpecReq.redisContainerPort) &&
        Objects.equals(this.redisImage, getRedisStatefulSetSpecReq.redisImage) &&
        Objects.equals(this.redisMetricsContainerPort, getRedisStatefulSetSpecReq.redisMetricsContainerPort) &&
        Objects.equals(this.scriptsConfigMapName, getRedisStatefulSetSpecReq.scriptsConfigMapName) &&
        Objects.equals(this.sentinelContainerPort, getRedisStatefulSetSpecReq.sentinelContainerPort) &&
        Objects.equals(this.sentinelImage, getRedisStatefulSetSpecReq.sentinelImage) &&
        Objects.equals(this.serviceName, getRedisStatefulSetSpecReq.serviceName) &&
        Objects.equals(this.tlSEnabled, getRedisStatefulSetSpecReq.tlSEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confConfigMapName, credentialSecretName, healthConfigMapName, initContainerImage, labels, metricsExporterImage, pvcNameIfNeeded, redisContainerPort, redisImage, redisMetricsContainerPort, scriptsConfigMapName, sentinelContainerPort, sentinelImage, serviceName, tlSEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRedisStatefulSetSpecReq {\n");
    sb.append("    confConfigMapName: ").append(toIndentedString(confConfigMapName)).append("\n");
    sb.append("    credentialSecretName: ").append(toIndentedString(credentialSecretName)).append("\n");
    sb.append("    healthConfigMapName: ").append(toIndentedString(healthConfigMapName)).append("\n");
    sb.append("    initContainerImage: ").append(toIndentedString(initContainerImage)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    metricsExporterImage: ").append(toIndentedString(metricsExporterImage)).append("\n");
    sb.append("    pvcNameIfNeeded: ").append(toIndentedString(pvcNameIfNeeded)).append("\n");
    sb.append("    redisContainerPort: ").append(toIndentedString(redisContainerPort)).append("\n");
    sb.append("    redisImage: ").append(toIndentedString(redisImage)).append("\n");
    sb.append("    redisMetricsContainerPort: ").append(toIndentedString(redisMetricsContainerPort)).append("\n");
    sb.append("    scriptsConfigMapName: ").append(toIndentedString(scriptsConfigMapName)).append("\n");
    sb.append("    sentinelContainerPort: ").append(toIndentedString(sentinelContainerPort)).append("\n");
    sb.append("    sentinelImage: ").append(toIndentedString(sentinelImage)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    tlSEnabled: ").append(toIndentedString(tlSEnabled)).append("\n");
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

