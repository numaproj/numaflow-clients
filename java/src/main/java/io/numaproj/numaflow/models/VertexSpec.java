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
import io.kubernetes.client.openapi.models.V1Affinity;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.kubernetes.client.openapi.models.V1Volume;
import io.numaproj.numaflow.models.ContainerTemplate;
import io.numaproj.numaflow.models.Edge;
import io.numaproj.numaflow.models.Metadata;
import io.numaproj.numaflow.models.Scale;
import io.numaproj.numaflow.models.Sink;
import io.numaproj.numaflow.models.Source;
import io.numaproj.numaflow.models.UDF;
import io.numaproj.numaflow.models.VertexLimits;
import io.numaproj.numaflow.models.Watermark;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VertexSpec
 */
@JsonPropertyOrder({
  VertexSpec.JSON_PROPERTY_AFFINITY,
  VertexSpec.JSON_PROPERTY_CONTAINER_TEMPLATE,
  VertexSpec.JSON_PROPERTY_FROM_EDGES,
  VertexSpec.JSON_PROPERTY_IMAGE_PULL_SECRETS,
  VertexSpec.JSON_PROPERTY_INIT_CONTAINER_TEMPLATE,
  VertexSpec.JSON_PROPERTY_INIT_CONTAINERS,
  VertexSpec.JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME,
  VertexSpec.JSON_PROPERTY_LIMITS,
  VertexSpec.JSON_PROPERTY_METADATA,
  VertexSpec.JSON_PROPERTY_NAME,
  VertexSpec.JSON_PROPERTY_NODE_SELECTOR,
  VertexSpec.JSON_PROPERTY_PIPELINE_NAME,
  VertexSpec.JSON_PROPERTY_PRIORITY,
  VertexSpec.JSON_PROPERTY_PRIORITY_CLASS_NAME,
  VertexSpec.JSON_PROPERTY_REPLICAS,
  VertexSpec.JSON_PROPERTY_SCALE,
  VertexSpec.JSON_PROPERTY_SECURITY_CONTEXT,
  VertexSpec.JSON_PROPERTY_SERVICE_ACCOUNT_NAME,
  VertexSpec.JSON_PROPERTY_SIDECARS,
  VertexSpec.JSON_PROPERTY_SINK,
  VertexSpec.JSON_PROPERTY_SOURCE,
  VertexSpec.JSON_PROPERTY_TO_EDGES,
  VertexSpec.JSON_PROPERTY_TOLERATIONS,
  VertexSpec.JSON_PROPERTY_UDF,
  VertexSpec.JSON_PROPERTY_VOLUMES,
  VertexSpec.JSON_PROPERTY_WATERMARK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VertexSpec {
  public static final String JSON_PROPERTY_AFFINITY = "affinity";
  private V1Affinity affinity = null;

  public static final String JSON_PROPERTY_CONTAINER_TEMPLATE = "containerTemplate";
  private ContainerTemplate containerTemplate;

  public static final String JSON_PROPERTY_FROM_EDGES = "fromEdges";
  private List<Edge> fromEdges = null;

  public static final String JSON_PROPERTY_IMAGE_PULL_SECRETS = "imagePullSecrets";
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String JSON_PROPERTY_INIT_CONTAINER_TEMPLATE = "initContainerTemplate";
  private ContainerTemplate initContainerTemplate;

  public static final String JSON_PROPERTY_INIT_CONTAINERS = "initContainers";
  private List<V1Container> initContainers = null;

  public static final String JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME = "interStepBufferServiceName";
  private String interStepBufferServiceName;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private VertexLimits limits;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE_SELECTOR = "nodeSelector";
  private Map<String, String> nodeSelector = null;

  public static final String JSON_PROPERTY_PIPELINE_NAME = "pipelineName";
  private String pipelineName;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_PRIORITY_CLASS_NAME = "priorityClassName";
  private String priorityClassName;

  public static final String JSON_PROPERTY_REPLICAS = "replicas";
  private Integer replicas;

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

  public static final String JSON_PROPERTY_TO_EDGES = "toEdges";
  private List<Edge> toEdges = null;

  public static final String JSON_PROPERTY_TOLERATIONS = "tolerations";
  private List<V1Toleration> tolerations = null;

  public static final String JSON_PROPERTY_UDF = "udf";
  private UDF udf;

  public static final String JSON_PROPERTY_VOLUMES = "volumes";
  private List<V1Volume> volumes = null;

  public static final String JSON_PROPERTY_WATERMARK = "watermark";
  private Watermark watermark;


  public VertexSpec affinity(V1Affinity affinity) {
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


  public VertexSpec containerTemplate(ContainerTemplate containerTemplate) {
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


  public VertexSpec fromEdges(List<Edge> fromEdges) {
    this.fromEdges = fromEdges;
    return this;
  }

  public VertexSpec addFromEdgesItem(Edge fromEdgesItem) {
    if (this.fromEdges == null) {
      this.fromEdges = new ArrayList<>();
    }
    this.fromEdges.add(fromEdgesItem);
    return this;
  }

   /**
   * Get fromEdges
   * @return fromEdges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Edge> getFromEdges() {
    return fromEdges;
  }


  @JsonProperty(JSON_PROPERTY_FROM_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromEdges(List<Edge> fromEdges) {
    this.fromEdges = fromEdges;
  }


  public VertexSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public VertexSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
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


  public VertexSpec initContainerTemplate(ContainerTemplate initContainerTemplate) {
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


  public VertexSpec initContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public VertexSpec addInitContainersItem(V1Container initContainersItem) {
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


  public VertexSpec interStepBufferServiceName(String interStepBufferServiceName) {
    this.interStepBufferServiceName = interStepBufferServiceName;
    return this;
  }

   /**
   * Get interStepBufferServiceName
   * @return interStepBufferServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterStepBufferServiceName() {
    return interStepBufferServiceName;
  }


  @JsonProperty(JSON_PROPERTY_INTER_STEP_BUFFER_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterStepBufferServiceName(String interStepBufferServiceName) {
    this.interStepBufferServiceName = interStepBufferServiceName;
  }


  public VertexSpec limits(VertexLimits limits) {
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


  public VertexSpec metadata(Metadata metadata) {
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


  public VertexSpec name(String name) {
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


  public VertexSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public VertexSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
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


  public VertexSpec pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

   /**
   * Get pipelineName
   * @return pipelineName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPipelineName() {
    return pipelineName;
  }


  @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }


  public VertexSpec priority(Integer priority) {
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


  public VertexSpec priorityClassName(String priorityClassName) {
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


  public VertexSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public VertexSpec scale(Scale scale) {
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


  public VertexSpec securityContext(V1PodSecurityContext securityContext) {
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


  public VertexSpec serviceAccountName(String serviceAccountName) {
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


  public VertexSpec sidecars(List<V1Container> sidecars) {
    this.sidecars = sidecars;
    return this;
  }

  public VertexSpec addSidecarsItem(V1Container sidecarsItem) {
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


  public VertexSpec sink(Sink sink) {
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


  public VertexSpec source(Source source) {
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


  public VertexSpec toEdges(List<Edge> toEdges) {
    this.toEdges = toEdges;
    return this;
  }

  public VertexSpec addToEdgesItem(Edge toEdgesItem) {
    if (this.toEdges == null) {
      this.toEdges = new ArrayList<>();
    }
    this.toEdges.add(toEdgesItem);
    return this;
  }

   /**
   * Get toEdges
   * @return toEdges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Edge> getToEdges() {
    return toEdges;
  }


  @JsonProperty(JSON_PROPERTY_TO_EDGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToEdges(List<Edge> toEdges) {
    this.toEdges = toEdges;
  }


  public VertexSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public VertexSpec addTolerationsItem(V1Toleration tolerationsItem) {
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


  public VertexSpec udf(UDF udf) {
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


  public VertexSpec volumes(List<V1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public VertexSpec addVolumesItem(V1Volume volumesItem) {
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


  public VertexSpec watermark(Watermark watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Get watermark
   * @return watermark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Watermark getWatermark() {
    return watermark;
  }


  @JsonProperty(JSON_PROPERTY_WATERMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatermark(Watermark watermark) {
    this.watermark = watermark;
  }


  /**
   * Return true if this VertexSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VertexSpec vertexSpec = (VertexSpec) o;
    return Objects.equals(this.affinity, vertexSpec.affinity) &&
        Objects.equals(this.containerTemplate, vertexSpec.containerTemplate) &&
        Objects.equals(this.fromEdges, vertexSpec.fromEdges) &&
        Objects.equals(this.imagePullSecrets, vertexSpec.imagePullSecrets) &&
        Objects.equals(this.initContainerTemplate, vertexSpec.initContainerTemplate) &&
        Objects.equals(this.initContainers, vertexSpec.initContainers) &&
        Objects.equals(this.interStepBufferServiceName, vertexSpec.interStepBufferServiceName) &&
        Objects.equals(this.limits, vertexSpec.limits) &&
        Objects.equals(this.metadata, vertexSpec.metadata) &&
        Objects.equals(this.name, vertexSpec.name) &&
        Objects.equals(this.nodeSelector, vertexSpec.nodeSelector) &&
        Objects.equals(this.pipelineName, vertexSpec.pipelineName) &&
        Objects.equals(this.priority, vertexSpec.priority) &&
        Objects.equals(this.priorityClassName, vertexSpec.priorityClassName) &&
        Objects.equals(this.replicas, vertexSpec.replicas) &&
        Objects.equals(this.scale, vertexSpec.scale) &&
        Objects.equals(this.securityContext, vertexSpec.securityContext) &&
        Objects.equals(this.serviceAccountName, vertexSpec.serviceAccountName) &&
        Objects.equals(this.sidecars, vertexSpec.sidecars) &&
        Objects.equals(this.sink, vertexSpec.sink) &&
        Objects.equals(this.source, vertexSpec.source) &&
        Objects.equals(this.toEdges, vertexSpec.toEdges) &&
        Objects.equals(this.tolerations, vertexSpec.tolerations) &&
        Objects.equals(this.udf, vertexSpec.udf) &&
        Objects.equals(this.volumes, vertexSpec.volumes) &&
        Objects.equals(this.watermark, vertexSpec.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, containerTemplate, fromEdges, imagePullSecrets, initContainerTemplate, initContainers, interStepBufferServiceName, limits, metadata, name, nodeSelector, pipelineName, priority, priorityClassName, replicas, scale, securityContext, serviceAccountName, sidecars, sink, source, toEdges, tolerations, udf, volumes, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VertexSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    containerTemplate: ").append(toIndentedString(containerTemplate)).append("\n");
    sb.append("    fromEdges: ").append(toIndentedString(fromEdges)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainerTemplate: ").append(toIndentedString(initContainerTemplate)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    interStepBufferServiceName: ").append(toIndentedString(interStepBufferServiceName)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    toEdges: ").append(toIndentedString(toEdges)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    udf: ").append(toIndentedString(udf)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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

