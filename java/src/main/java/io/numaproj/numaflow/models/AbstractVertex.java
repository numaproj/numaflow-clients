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
import io.kubernetes.client.openapi.models.V1Affinity;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.kubernetes.client.openapi.models.V1Volume;
import io.numaproj.numaflow.models.ContainerTemplate;
import io.numaproj.numaflow.models.Metadata;
import io.numaproj.numaflow.models.Scale;
import io.numaproj.numaflow.models.Sink;
import io.numaproj.numaflow.models.Source;
import io.numaproj.numaflow.models.UDF;
import io.numaproj.numaflow.models.VertexLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AbstractVertex
 */
@JsonPropertyOrder({
  AbstractVertex.JSON_PROPERTY_AFFINITY,
  AbstractVertex.JSON_PROPERTY_CONTAINER_TEMPLATE,
  AbstractVertex.JSON_PROPERTY_IMAGE_PULL_SECRETS,
  AbstractVertex.JSON_PROPERTY_INIT_CONTAINER_TEMPLATE,
  AbstractVertex.JSON_PROPERTY_INIT_CONTAINERS,
  AbstractVertex.JSON_PROPERTY_LIMITS,
  AbstractVertex.JSON_PROPERTY_METADATA,
  AbstractVertex.JSON_PROPERTY_NAME,
  AbstractVertex.JSON_PROPERTY_NODE_SELECTOR,
  AbstractVertex.JSON_PROPERTY_PRIORITY,
  AbstractVertex.JSON_PROPERTY_PRIORITY_CLASS_NAME,
  AbstractVertex.JSON_PROPERTY_SCALE,
  AbstractVertex.JSON_PROPERTY_SECURITY_CONTEXT,
  AbstractVertex.JSON_PROPERTY_SERVICE_ACCOUNT_NAME,
  AbstractVertex.JSON_PROPERTY_SIDECARS,
  AbstractVertex.JSON_PROPERTY_SINK,
  AbstractVertex.JSON_PROPERTY_SOURCE,
  AbstractVertex.JSON_PROPERTY_TOLERATIONS,
  AbstractVertex.JSON_PROPERTY_UDF,
  AbstractVertex.JSON_PROPERTY_VOLUMES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AbstractVertex {
  public static final String JSON_PROPERTY_AFFINITY = "affinity";
  private V1Affinity affinity = null;

  public static final String JSON_PROPERTY_CONTAINER_TEMPLATE = "containerTemplate";
  private ContainerTemplate containerTemplate;

  public static final String JSON_PROPERTY_IMAGE_PULL_SECRETS = "imagePullSecrets";
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String JSON_PROPERTY_INIT_CONTAINER_TEMPLATE = "initContainerTemplate";
  private ContainerTemplate initContainerTemplate;

  public static final String JSON_PROPERTY_INIT_CONTAINERS = "initContainers";
  private List<V1Container> initContainers = null;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private VertexLimits limits;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE_SELECTOR = "nodeSelector";
  private Map<String, String> nodeSelector = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_PRIORITY_CLASS_NAME = "priorityClassName";
  private String priorityClassName;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private Scale scale;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT = "securityContext";
  private V1PodSecurityContext securityContext = null;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  private String serviceAccountName;

  public static final String JSON_PROPERTY_SIDECARS = "sidecars";
  private List<V1Container> sidecars = null;

  public static final String JSON_PROPERTY_SINK = "sink";
  private Sink sink;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Source source;

  public static final String JSON_PROPERTY_TOLERATIONS = "tolerations";
  private List<V1Toleration> tolerations = null;

  public static final String JSON_PROPERTY_UDF = "udf";
  private UDF udf;

  public static final String JSON_PROPERTY_VOLUMES = "volumes";
  private List<V1Volume> volumes = null;


  public AbstractVertex affinity(V1Affinity affinity) {
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


  public AbstractVertex containerTemplate(ContainerTemplate containerTemplate) {
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


  public AbstractVertex imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public AbstractVertex addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
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


  public AbstractVertex initContainerTemplate(ContainerTemplate initContainerTemplate) {
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


  public AbstractVertex initContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public AbstractVertex addInitContainersItem(V1Container initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * List of init containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of init containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  @JsonProperty(JSON_PROPERTY_INIT_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1Container> getInitContainers() {
    return initContainers;
  }


  @JsonProperty(JSON_PROPERTY_INIT_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
  }


  public AbstractVertex limits(VertexLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VertexLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(VertexLimits limits) {
    this.limits = limits;
  }


  public AbstractVertex metadata(Metadata metadata) {
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


  public AbstractVertex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AbstractVertex nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public AbstractVertex putNodeSelectorItem(String key, String nodeSelectorItem) {
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


  public AbstractVertex priority(Integer priority) {
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


  public AbstractVertex priorityClassName(String priorityClassName) {
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


  public AbstractVertex scale(Scale scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scale getScale() {
    return scale;
  }


  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScale(Scale scale) {
    this.scale = scale;
  }


  public AbstractVertex securityContext(V1PodSecurityContext securityContext) {
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


  public AbstractVertex serviceAccountName(String serviceAccountName) {
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


  public AbstractVertex sidecars(List<V1Container> sidecars) {
    this.sidecars = sidecars;
    return this;
  }

  public AbstractVertex addSidecarsItem(V1Container sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * List of sidecar containers belonging to the pod.
   * @return sidecars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sidecar containers belonging to the pod.")
  @JsonProperty(JSON_PROPERTY_SIDECARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1Container> getSidecars() {
    return sidecars;
  }


  @JsonProperty(JSON_PROPERTY_SIDECARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidecars(List<V1Container> sidecars) {
    this.sidecars = sidecars;
  }


  public AbstractVertex sink(Sink sink) {
    this.sink = sink;
    return this;
  }

   /**
   * Get sink
   * @return sink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Sink getSink() {
    return sink;
  }


  @JsonProperty(JSON_PROPERTY_SINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSink(Sink sink) {
    this.sink = sink;
  }


  public AbstractVertex source(Source source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Source getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(Source source) {
    this.source = source;
  }


  public AbstractVertex tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public AbstractVertex addTolerationsItem(V1Toleration tolerationsItem) {
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


  public AbstractVertex udf(UDF udf) {
    this.udf = udf;
    return this;
  }

   /**
   * Get udf
   * @return udf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UDF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UDF getUdf() {
    return udf;
  }


  @JsonProperty(JSON_PROPERTY_UDF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUdf(UDF udf) {
    this.udf = udf;
  }


  public AbstractVertex volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public AbstractVertex addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  @JsonProperty(JSON_PROPERTY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  /**
   * Return true if this AbstractVertex object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractVertex abstractVertex = (AbstractVertex) o;
    return Objects.equals(this.affinity, abstractVertex.affinity) &&
        Objects.equals(this.containerTemplate, abstractVertex.containerTemplate) &&
        Objects.equals(this.imagePullSecrets, abstractVertex.imagePullSecrets) &&
        Objects.equals(this.initContainerTemplate, abstractVertex.initContainerTemplate) &&
        Objects.equals(this.initContainers, abstractVertex.initContainers) &&
        Objects.equals(this.limits, abstractVertex.limits) &&
        Objects.equals(this.metadata, abstractVertex.metadata) &&
        Objects.equals(this.name, abstractVertex.name) &&
        Objects.equals(this.nodeSelector, abstractVertex.nodeSelector) &&
        Objects.equals(this.priority, abstractVertex.priority) &&
        Objects.equals(this.priorityClassName, abstractVertex.priorityClassName) &&
        Objects.equals(this.scale, abstractVertex.scale) &&
        Objects.equals(this.securityContext, abstractVertex.securityContext) &&
        Objects.equals(this.serviceAccountName, abstractVertex.serviceAccountName) &&
        Objects.equals(this.sidecars, abstractVertex.sidecars) &&
        Objects.equals(this.sink, abstractVertex.sink) &&
        Objects.equals(this.source, abstractVertex.source) &&
        Objects.equals(this.tolerations, abstractVertex.tolerations) &&
        Objects.equals(this.udf, abstractVertex.udf) &&
        Objects.equals(this.volumes, abstractVertex.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, containerTemplate, imagePullSecrets, initContainerTemplate, initContainers, limits, metadata, name, nodeSelector, priority, priorityClassName, scale, securityContext, serviceAccountName, sidecars, sink, source, tolerations, udf, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractVertex {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    containerTemplate: ").append(toIndentedString(containerTemplate)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainerTemplate: ").append(toIndentedString(initContainerTemplate)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    udf: ").append(toIndentedString(udf)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

