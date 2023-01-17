# VertexSpec


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**pipeline_name** | **str** |  | 
**affinity** | [**V1Affinity**](V1Affinity.md) |  | [optional] 
**container_template** | [**ContainerTemplate**](ContainerTemplate.md) |  | [optional] 
**from_edges** | [**[Edge]**](Edge.md) |  | [optional] 
**image_pull_secrets** | [**[V1LocalObjectReference]**](V1LocalObjectReference.md) | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod | [optional] 
**init_container_template** | [**ContainerTemplate**](ContainerTemplate.md) |  | [optional] 
**init_containers** | [**[V1Container]**](V1Container.md) | List of init containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/ | [optional] 
**inter_step_buffer_service_name** | **str** |  | [optional] 
**limits** | [**VertexLimits**](VertexLimits.md) |  | [optional] 
**metadata** | [**Metadata**](Metadata.md) |  | [optional] 
**node_selector** | **{str: (str,)}** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ | [optional] 
**priority** | **int** | The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ | [optional] 
**priority_class_name** | **str** | If specified, indicates the Redis pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ | [optional] 
**replicas** | **int** |  | [optional] 
**scale** | [**Scale**](Scale.md) |  | [optional] 
**security_context** | [**V1PodSecurityContext**](V1PodSecurityContext.md) |  | [optional] 
**service_account_name** | **str** | ServiceAccountName applied to the pod | [optional] 
**sidecars** | [**[V1Container]**](V1Container.md) | List of sidecar containers belonging to the pod. | [optional] 
**sink** | [**Sink**](Sink.md) |  | [optional] 
**source** | [**Source**](Source.md) |  | [optional] 
**to_edges** | [**[Edge]**](Edge.md) |  | [optional] 
**tolerations** | [**[V1Toleration]**](V1Toleration.md) | If specified, the pod&#39;s tolerations. | [optional] 
**udf** | [**UDF**](UDF.md) |  | [optional] 
**volumes** | [**[V1Volume]**](V1Volume.md) |  | [optional] 
**watermark** | [**Watermark**](Watermark.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

