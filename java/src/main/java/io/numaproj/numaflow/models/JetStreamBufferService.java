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
import io.kubernetes.client.openapi.models.V1Affinity;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1PodDNSConfig;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.numaproj.numaflow.models.ContainerTemplate;
import io.numaproj.numaflow.models.Metadata;
import io.numaproj.numaflow.models.PersistenceStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JetStreamBufferService
 */
@JsonPropertyOrder({
  JetStreamBufferService.JSON_PROPERTY_AFFINITY,
  JetStreamBufferService.JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN,
  JetStreamBufferService.JSON_PROPERTY_BUFFER_CONFIG,
  JetStreamBufferService.JSON_PROPERTY_CONTAINER_TEMPLATE,
  JetStreamBufferService.JSON_PROPERTY_DNS_CONFIG,
  JetStreamBufferService.JSON_PROPERTY_DNS_POLICY,
  JetStreamBufferService.JSON_PROPERTY_ENCRYPTION,
  JetStreamBufferService.JSON_PROPERTY_IMAGE_PULL_SECRETS,
  JetStreamBufferService.JSON_PROPERTY_METADATA,
  JetStreamBufferService.JSON_PROPERTY_METRICS_CONTAINER_TEMPLATE,
  JetStreamBufferService.JSON_PROPERTY_NODE_SELECTOR,
  JetStreamBufferService.JSON_PROPERTY_PERSISTENCE,
  JetStreamBufferService.JSON_PROPERTY_PRIORITY,
  JetStreamBufferService.JSON_PROPERTY_PRIORITY_CLASS_NAME,
  JetStreamBufferService.JSON_PROPERTY_RELOADER_CONTAINER_TEMPLATE,
  JetStreamBufferService.JSON_PROPERTY_REPLICAS,
  JetStreamBufferService.JSON_PROPERTY_RUNTIME_CLASS_NAME,
  JetStreamBufferService.JSON_PROPERTY_SECURITY_CONTEXT,
  JetStreamBufferService.JSON_PROPERTY_SERVICE_ACCOUNT_NAME,
  JetStreamBufferService.JSON_PROPERTY_SETTINGS,
  JetStreamBufferService.JSON_PROPERTY_START_ARGS,
  JetStreamBufferService.JSON_PROPERTY_TLS,
  JetStreamBufferService.JSON_PROPERTY_TOLERATIONS,
  JetStreamBufferService.JSON_PROPERTY_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JetStreamBufferService {
  public static final String JSON_PROPERTY_AFFINITY = "affinity";
  private V1Affinity affinity = null;

  public static final String JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  private Boolean automountServiceAccountToken;

  public static final String JSON_PROPERTY_BUFFER_CONFIG = "bufferConfig";
  private String bufferConfig;

  public static final String JSON_PROPERTY_CONTAINER_TEMPLATE = "containerTemplate";
  private ContainerTemplate containerTemplate;

  public static final String JSON_PROPERTY_DNS_CONFIG = "dnsConfig";
  private V1PodDNSConfig dnsConfig = null;

  public static final String JSON_PROPERTY_DNS_POLICY = "dnsPolicy";
  private String dnsPolicy;

  public static final String JSON_PROPERTY_ENCRYPTION = "encryption";
  private Boolean encryption;

  public static final String JSON_PROPERTY_IMAGE_PULL_SECRETS = "imagePullSecrets";
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public static final String JSON_PROPERTY_METRICS_CONTAINER_TEMPLATE = "metricsContainerTemplate";
  private ContainerTemplate metricsContainerTemplate;

  public static final String JSON_PROPERTY_NODE_SELECTOR = "nodeSelector";
  private Map<String, String> nodeSelector = null;

  public static final String JSON_PROPERTY_PERSISTENCE = "persistence";
  private PersistenceStrategy persistence;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_PRIORITY_CLASS_NAME = "priorityClassName";
  private String priorityClassName;

  public static final String JSON_PROPERTY_RELOADER_CONTAINER_TEMPLATE = "reloaderContainerTemplate";
  private ContainerTemplate reloaderContainerTemplate;

  public static final String JSON_PROPERTY_REPLICAS = "replicas";
  private Integer replicas;

  public static final String JSON_PROPERTY_RUNTIME_CLASS_NAME = "runtimeClassName";
  private String runtimeClassName;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1PodSecurityContext securityContext = null;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  private String serviceAccountName;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private String settings;

  public static final String JSON_PROPERTY_START_ARGS = "startArgs";
  private List<String> startArgs = null;

  public static final String JSON_PROPERTY_TLS = "tls";
  private Boolean tls;

  public static final String JSON_PROPERTY_TOLERATIONS = "tolerations";
  private List<V1Toleration> tolerations = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public JetStreamBufferService affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AFFINITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1Affinity getAffinity() {
    return affinity;
  }


  @JsonProperty(JSON_PROPERTY_AFFINITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }


  public JetStreamBufferService automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  @JsonProperty(JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public JetStreamBufferService bufferConfig(String bufferConfig) {
    this.bufferConfig = bufferConfig;
    return this;
  }

   /**
   * Optional configuration for the streams, consumers and buckets to be created in this JetStream service, if specified, it will be merged with the default configuration in numaflow-controller-config. It accepts a YAML format configuration, it may include 4 sections, \&quot;stream\&quot;, \&quot;consumer\&quot;, \&quot;otBucket\&quot; and \&quot;procBucket\&quot;. Available fields under \&quot;stream\&quot; include \&quot;retention\&quot; (e.g. interest, limits, workerQueue), \&quot;maxMsgs\&quot;, \&quot;maxAge\&quot; (e.g. 72h), \&quot;replicas\&quot; (1, 3, 5), \&quot;duplicates\&quot; (e.g. 5m). Available fields under \&quot;consumer\&quot; include \&quot;ackWait\&quot; (e.g. 60s) Available fields under \&quot;otBucket\&quot; include \&quot;maxValueSize\&quot;, \&quot;history\&quot;, \&quot;ttl\&quot; (e.g. 72h), \&quot;maxBytes\&quot;, \&quot;replicas\&quot; (1, 3, 5). Available fields under \&quot;procBucket\&quot; include \&quot;maxValueSize\&quot;, \&quot;history\&quot;, \&quot;ttl\&quot; (e.g. 72h), \&quot;maxBytes\&quot;, \&quot;replicas\&quot; (1, 3, 5).
   * @return bufferConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional configuration for the streams, consumers and buckets to be created in this JetStream service, if specified, it will be merged with the default configuration in numaflow-controller-config. It accepts a YAML format configuration, it may include 4 sections, \"stream\", \"consumer\", \"otBucket\" and \"procBucket\". Available fields under \"stream\" include \"retention\" (e.g. interest, limits, workerQueue), \"maxMsgs\", \"maxAge\" (e.g. 72h), \"replicas\" (1, 3, 5), \"duplicates\" (e.g. 5m). Available fields under \"consumer\" include \"ackWait\" (e.g. 60s) Available fields under \"otBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5). Available fields under \"procBucket\" include \"maxValueSize\", \"history\", \"ttl\" (e.g. 72h), \"maxBytes\", \"replicas\" (1, 3, 5).")
  @JsonProperty(JSON_PROPERTY_BUFFER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBufferConfig() {
    return bufferConfig;
  }


  @JsonProperty(JSON_PROPERTY_BUFFER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBufferConfig(String bufferConfig) {
    this.bufferConfig = bufferConfig;
  }


  public JetStreamBufferService containerTemplate(ContainerTemplate containerTemplate) {
    this.containerTemplate = containerTemplate;
    return this;
  }

   /**
   * Get containerTemplate
   * @return containerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContainerTemplate getContainerTemplate() {
    return containerTemplate;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerTemplate(ContainerTemplate containerTemplate) {
    this.containerTemplate = containerTemplate;
  }


  public JetStreamBufferService dnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

   /**
   * Get dnsConfig
   * @return dnsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DNS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }


  @JsonProperty(JSON_PROPERTY_DNS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }


  public JetStreamBufferService dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

   /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
  @JsonProperty(JSON_PROPERTY_DNS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDnsPolicy() {
    return dnsPolicy;
  }


  @JsonProperty(JSON_PROPERTY_DNS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }


  public JetStreamBufferService encryption(Boolean encryption) {
    this.encryption = encryption;
    return this;
  }

   /**
   * Whether encrypt the data at rest, defaults to false Enabling encryption might impact the performance, see https://docs.nats.io/running-a-nats-service/nats_admin/jetstream_admin/encryption_at_rest for the detail Toggling the value will impact encypting/decrypting existing messages.
   * @return encryption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether encrypt the data at rest, defaults to false Enabling encryption might impact the performance, see https://docs.nats.io/running-a-nats-service/nats_admin/jetstream_admin/encryption_at_rest for the detail Toggling the value will impact encypting/decrypting existing messages.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncryption() {
    return encryption;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryption(Boolean encryption) {
    this.encryption = encryption;
  }


  public JetStreamBufferService imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public JetStreamBufferService addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_PULL_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public JetStreamBufferService metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Metadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public JetStreamBufferService metricsContainerTemplate(ContainerTemplate metricsContainerTemplate) {
    this.metricsContainerTemplate = metricsContainerTemplate;
    return this;
  }

   /**
   * Get metricsContainerTemplate
   * @return metricsContainerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContainerTemplate getMetricsContainerTemplate() {
    return metricsContainerTemplate;
  }


  @JsonProperty(JSON_PROPERTY_METRICS_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricsContainerTemplate(ContainerTemplate metricsContainerTemplate) {
    this.metricsContainerTemplate = metricsContainerTemplate;
  }


  public JetStreamBufferService nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public JetStreamBufferService putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  @JsonProperty(JSON_PROPERTY_NODE_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  @JsonProperty(JSON_PROPERTY_NODE_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public JetStreamBufferService persistence(PersistenceStrategy persistence) {
    this.persistence = persistence;
    return this;
  }

   /**
   * Get persistence
   * @return persistence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSISTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersistenceStrategy getPersistence() {
    return persistence;
  }


  @JsonProperty(JSON_PROPERTY_PERSISTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersistence(PersistenceStrategy persistence) {
    this.persistence = persistence;
  }


  public JetStreamBufferService priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public JetStreamBufferService priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * If specified, indicates the Redis pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, indicates the Redis pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/")
  @JsonProperty(JSON_PROPERTY_PRIORITY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPriorityClassName() {
    return priorityClassName;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public JetStreamBufferService reloaderContainerTemplate(ContainerTemplate reloaderContainerTemplate) {
    this.reloaderContainerTemplate = reloaderContainerTemplate;
    return this;
  }

   /**
   * Get reloaderContainerTemplate
   * @return reloaderContainerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELOADER_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContainerTemplate getReloaderContainerTemplate() {
    return reloaderContainerTemplate;
  }


  @JsonProperty(JSON_PROPERTY_RELOADER_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReloaderContainerTemplate(ContainerTemplate reloaderContainerTemplate) {
    this.reloaderContainerTemplate = reloaderContainerTemplate;
  }


  public JetStreamBufferService replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Redis StatefulSet size
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redis StatefulSet size")
  @JsonProperty(JSON_PROPERTY_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReplicas() {
    return replicas;
  }


  @JsonProperty(JSON_PROPERTY_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public JetStreamBufferService runtimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return this;
  }

   /**
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
   * @return runtimeClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class")
  @JsonProperty(JSON_PROPERTY_RUNTIME_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuntimeClassName() {
    return runtimeClassName;
  }


  @JsonProperty(JSON_PROPERTY_RUNTIME_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
  }


  public JetStreamBufferService securityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public JetStreamBufferService serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName applied to the pod
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName applied to the pod")
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public JetStreamBufferService settings(String settings) {
    this.settings = settings;
    return this;
  }

   /**
   * JetStream configuration, if not specified, global settings in numaflow-controller-config will be used. See https://docs.nats.io/running-a-nats-service/configuration#jetstream. Only configure \&quot;max_memory_store\&quot; or \&quot;max_file_store\&quot;, do not set \&quot;store_dir\&quot; as it has been hardcoded.
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JetStream configuration, if not specified, global settings in numaflow-controller-config will be used. See https://docs.nats.io/running-a-nats-service/configuration#jetstream. Only configure \"max_memory_store\" or \"max_file_store\", do not set \"store_dir\" as it has been hardcoded.")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(String settings) {
    this.settings = settings;
  }


  public JetStreamBufferService startArgs(List<String> startArgs) {
    this.startArgs = startArgs;
    return this;
  }

  public JetStreamBufferService addStartArgsItem(String startArgsItem) {
    if (this.startArgs == null) {
      this.startArgs = new ArrayList<>();
    }
    this.startArgs.add(startArgsItem);
    return this;
  }

   /**
   * Optional arguments to start nats-server. For example, \&quot;-D\&quot; to enable debugging output, \&quot;-DV\&quot; to enable debugging and tracing. Check https://docs.nats.io/ for all the available arguments.
   * @return startArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional arguments to start nats-server. For example, \"-D\" to enable debugging output, \"-DV\" to enable debugging and tracing. Check https://docs.nats.io/ for all the available arguments.")
  @JsonProperty(JSON_PROPERTY_START_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStartArgs() {
    return startArgs;
  }


  @JsonProperty(JSON_PROPERTY_START_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartArgs(List<String> startArgs) {
    this.startArgs = startArgs;
  }


  public JetStreamBufferService tls(Boolean tls) {
    this.tls = tls;
    return this;
  }

   /**
   * Whether enable TLS, defaults to false Enabling TLS might impact the performance
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether enable TLS, defaults to false Enabling TLS might impact the performance")
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTls() {
    return tls;
  }


  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTls(Boolean tls) {
    this.tls = tls;
  }


  public JetStreamBufferService tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public JetStreamBufferService addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  @JsonProperty(JSON_PROPERTY_TOLERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  @JsonProperty(JSON_PROPERTY_TOLERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public JetStreamBufferService version(String version) {
    this.version = version;
    return this;
  }

   /**
   * JetStream version, such as \&quot;2.7.1\&quot;
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JetStream version, such as \"2.7.1\"")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this JetStreamBufferService object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JetStreamBufferService jetStreamBufferService = (JetStreamBufferService) o;
    return Objects.equals(this.affinity, jetStreamBufferService.affinity) &&
        Objects.equals(this.automountServiceAccountToken, jetStreamBufferService.automountServiceAccountToken) &&
        Objects.equals(this.bufferConfig, jetStreamBufferService.bufferConfig) &&
        Objects.equals(this.containerTemplate, jetStreamBufferService.containerTemplate) &&
        Objects.equals(this.dnsConfig, jetStreamBufferService.dnsConfig) &&
        Objects.equals(this.dnsPolicy, jetStreamBufferService.dnsPolicy) &&
        Objects.equals(this.encryption, jetStreamBufferService.encryption) &&
        Objects.equals(this.imagePullSecrets, jetStreamBufferService.imagePullSecrets) &&
        Objects.equals(this.metadata, jetStreamBufferService.metadata) &&
        Objects.equals(this.metricsContainerTemplate, jetStreamBufferService.metricsContainerTemplate) &&
        Objects.equals(this.nodeSelector, jetStreamBufferService.nodeSelector) &&
        Objects.equals(this.persistence, jetStreamBufferService.persistence) &&
        Objects.equals(this.priority, jetStreamBufferService.priority) &&
        Objects.equals(this.priorityClassName, jetStreamBufferService.priorityClassName) &&
        Objects.equals(this.reloaderContainerTemplate, jetStreamBufferService.reloaderContainerTemplate) &&
        Objects.equals(this.replicas, jetStreamBufferService.replicas) &&
        Objects.equals(this.runtimeClassName, jetStreamBufferService.runtimeClassName) &&
        Objects.equals(this.securityContext, jetStreamBufferService.securityContext) &&
        Objects.equals(this.serviceAccountName, jetStreamBufferService.serviceAccountName) &&
        Objects.equals(this.settings, jetStreamBufferService.settings) &&
        Objects.equals(this.startArgs, jetStreamBufferService.startArgs) &&
        Objects.equals(this.tls, jetStreamBufferService.tls) &&
        Objects.equals(this.tolerations, jetStreamBufferService.tolerations) &&
        Objects.equals(this.version, jetStreamBufferService.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, automountServiceAccountToken, bufferConfig, containerTemplate, dnsConfig, dnsPolicy, encryption, imagePullSecrets, metadata, metricsContainerTemplate, nodeSelector, persistence, priority, priorityClassName, reloaderContainerTemplate, replicas, runtimeClassName, securityContext, serviceAccountName, settings, startArgs, tls, tolerations, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JetStreamBufferService {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    bufferConfig: ").append(toIndentedString(bufferConfig)).append("\n");
    sb.append("    containerTemplate: ").append(toIndentedString(containerTemplate)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metricsContainerTemplate: ").append(toIndentedString(metricsContainerTemplate)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    reloaderContainerTemplate: ").append(toIndentedString(reloaderContainerTemplate)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    startArgs: ").append(toIndentedString(startArgs)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

