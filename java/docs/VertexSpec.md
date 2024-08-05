

# VertexSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affinity** | **V1Affinity** |  |  [optional] |
|**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted. |  [optional] |
|**containerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**dnsConfig** | **V1PodDNSConfig** |  |  [optional] |
|**dnsPolicy** | **String** | Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;. |  [optional] |
|**fromEdges** | [**List&lt;CombinedEdge&gt;**](CombinedEdge.md) |  |  [optional] |
|**imagePullSecrets** | **List&lt;V1LocalObjectReference&gt;** | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod |  [optional] |
|**initContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**initContainers** | **List&lt;V1Container&gt;** | List of customized init containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ |  [optional] |
|**interStepBufferServiceName** | **String** |  |  [optional] |
|**limits** | [**VertexLimits**](VertexLimits.md) |  |  [optional] |
|**metadata** | [**Metadata**](Metadata.md) |  |  [optional] |
|**name** | **String** |  |  |
|**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional] |
|**partitions** | **Integer** | Number of partitions of the vertex owned buffers. It applies to udf and sink vertices only. |  [optional] |
|**pipelineName** | **String** |  |  |
|**priority** | **Integer** | The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional] |
|**priorityClassName** | **String** | If specified, indicates the Redis pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional] |
|**replicas** | **Integer** |  |  [optional] |
|**runtimeClassName** | **String** | RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class |  [optional] |
|**scale** | [**Scale**](Scale.md) |  |  [optional] |
|**securityContext** | **V1PodSecurityContext** |  |  [optional] |
|**serviceAccountName** | **String** | ServiceAccountName applied to the pod |  [optional] |
|**sideInputs** | **List&lt;String&gt;** | Names of the side inputs used in this vertex. |  [optional] |
|**sideInputsContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**sidecars** | **List&lt;V1Container&gt;** | List of customized sidecar containers belonging to the pod. |  [optional] |
|**sink** | [**Sink**](Sink.md) |  |  [optional] |
|**source** | [**Source**](Source.md) |  |  [optional] |
|**toEdges** | [**List&lt;CombinedEdge&gt;**](CombinedEdge.md) |  |  [optional] |
|**tolerations** | **List&lt;V1Toleration&gt;** | If specified, the pod&#39;s tolerations. |  [optional] |
|**udf** | [**UDF**](UDF.md) |  |  [optional] |
|**volumes** | **List&lt;V1Volume&gt;** |  |  [optional] |
|**watermark** | [**Watermark**](Watermark.md) |  |  [optional] |



