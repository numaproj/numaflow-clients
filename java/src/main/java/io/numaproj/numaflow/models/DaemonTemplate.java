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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DaemonTemplate
 */
@JsonPropertyOrder({
  DaemonTemplate.JSON_PROPERTY_AFFINITY,
  DaemonTemplate.JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN,
  DaemonTemplate.JSON_PROPERTY_CONTAINER_TEMPLATE,
  DaemonTemplate.JSON_PROPERTY_DNS_CONFIG,
  DaemonTemplate.JSON_PROPERTY_DNS_POLICY,
  DaemonTemplate.JSON_PROPERTY_IMAGE_PULL_SECRETS,
  DaemonTemplate.JSON_PROPERTY_INIT_CONTAINER_TEMPLATE,
  DaemonTemplate.JSON_PROPERTY_METADATA,
  DaemonTemplate.JSON_PROPERTY_NODE_SELECTOR,
  DaemonTemplate.JSON_PROPERTY_PRIORITY,
  DaemonTemplate.JSON_PROPERTY_PRIORITY_CLASS_NAME,
  DaemonTemplate.JSON_PROPERTY_REPLICAS,
  DaemonTemplate.JSON_PROPERTY_RUNTIME_CLASS_NAME,
  DaemonTemplate.JSON_PROPERTY_SECURITY_CONTEXT,
  DaemonTemplate.JSON_PROPERTY_SERVICE_ACCOUNT_NAME,
  DaemonTemplate.JSON_PROPERTY_TOLERATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DaemonTemplate {
  public static final String JSON_PROPERTY_AFFINITY = "affinity";
  private V1Affinity affinity = null;

  public static final String JSON_PROPERTY_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  private Boolean automountServiceAccountToken;

  public static final String JSON_PROPERTY_CONTAINER_TEMPLATE = "containerTemplate";
  private ContainerTemplate containerTemplate;

  public static final String JSON_PROPERTY_DNS_CONFIG = "dnsConfig";
  private V1PodDNSConfig dnsConfig = null;

  public static final String JSON_PROPERTY_DNS_POLICY = "dnsPolicy";
  private String dnsPolicy;

  public static final String JSON_PROPERTY_IMAGE_PULL_SECRETS = "imagePullSecrets";
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String JSON_PROPERTY_INIT_CONTAINER_TEMPLATE = "initContainerTemplate";
  private ContainerTemplate initContainerTemplate;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public static final String JSON_PROPERTY_NODE_SELECTOR = "nodeSelector";
  private Map<String, String> nodeSelector = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_PRIORITY_CLASS_NAME = "priorityClassName";
  private String priorityClassName;

  public static final String JSON_PROPERTY_REPLICAS = "replicas";
  private Integer replicas;

  public static final String JSON_PROPERTY_RUNTIME_CLASS_NAME = "runtimeClassName";
  private String runtimeClassName;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1PodSecurityContext securityContext = null;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  private String serviceAccountName;

  public static final String JSON_PROPERTY_TOLERATIONS = "tolerations";
  private List<V1Toleration> tolerations = null;


  public DaemonTemplate affinity(V1Affinity affinity) {
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


  public DaemonTemplate automountServiceAccountToken(Boolean automountServiceAccountToken) {
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


  public DaemonTemplate containerTemplate(ContainerTemplate containerTemplate) {
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


  public DaemonTemplate dnsConfig(V1PodDNSConfig dnsConfig) {
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


  public DaemonTemplate dnsPolicy(String dnsPolicy) {
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


  public DaemonTemplate imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public DaemonTemplate addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
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


  public DaemonTemplate initContainerTemplate(ContainerTemplate initContainerTemplate) {
    this.initContainerTemplate = initContainerTemplate;
    return this;
  }

   /**
   * Get initContainerTemplate
   * @return initContainerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INIT_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContainerTemplate getInitContainerTemplate() {
    return initContainerTemplate;
  }


  @JsonProperty(JSON_PROPERTY_INIT_CONTAINER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitContainerTemplate(ContainerTemplate initContainerTemplate) {
    this.initContainerTemplate = initContainerTemplate;
  }


  public DaemonTemplate metadata(Metadata metadata) {
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


  public DaemonTemplate nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public DaemonTemplate putNodeSelectorItem(String key, String nodeSelectorItem) {
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


  public DaemonTemplate priority(Integer priority) {
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


  public DaemonTemplate priorityClassName(String priorityClassName) {
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


  public DaemonTemplate replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the number of desired replicas of the Deployment. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replicas is the number of desired replicas of the Deployment. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller")
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


  public DaemonTemplate runtimeClassName(String runtimeClassName) {
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


  public DaemonTemplate securityContext(V1PodSecurityContext securityContext) {
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


  public DaemonTemplate serviceAccountName(String serviceAccountName) {
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


  public DaemonTemplate tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public DaemonTemplate addTolerationsItem(V1Toleration tolerationsItem) {
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


  /**
   * Return true if this DaemonTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DaemonTemplate daemonTemplate = (DaemonTemplate) o;
    return Objects.equals(this.affinity, daemonTemplate.affinity) &&
        Objects.equals(this.automountServiceAccountToken, daemonTemplate.automountServiceAccountToken) &&
        Objects.equals(this.containerTemplate, daemonTemplate.containerTemplate) &&
        Objects.equals(this.dnsConfig, daemonTemplate.dnsConfig) &&
        Objects.equals(this.dnsPolicy, daemonTemplate.dnsPolicy) &&
        Objects.equals(this.imagePullSecrets, daemonTemplate.imagePullSecrets) &&
        Objects.equals(this.initContainerTemplate, daemonTemplate.initContainerTemplate) &&
        Objects.equals(this.metadata, daemonTemplate.metadata) &&
        Objects.equals(this.nodeSelector, daemonTemplate.nodeSelector) &&
        Objects.equals(this.priority, daemonTemplate.priority) &&
        Objects.equals(this.priorityClassName, daemonTemplate.priorityClassName) &&
        Objects.equals(this.replicas, daemonTemplate.replicas) &&
        Objects.equals(this.runtimeClassName, daemonTemplate.runtimeClassName) &&
        Objects.equals(this.securityContext, daemonTemplate.securityContext) &&
        Objects.equals(this.serviceAccountName, daemonTemplate.serviceAccountName) &&
        Objects.equals(this.tolerations, daemonTemplate.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, automountServiceAccountToken, containerTemplate, dnsConfig, dnsPolicy, imagePullSecrets, initContainerTemplate, metadata, nodeSelector, priority, priorityClassName, replicas, runtimeClassName, securityContext, serviceAccountName, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DaemonTemplate {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containerTemplate: ").append(toIndentedString(containerTemplate)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainerTemplate: ").append(toIndentedString(initContainerTemplate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

