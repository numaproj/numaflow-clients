

# JetStreamBufferService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affinity** | **V1Affinity** |  |  [optional] |
|**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted. |  [optional] |
|**bufferConfig** | **String** | Optional configuration for the streams, consumers and buckets to be created in this JetStream service, if specified, it will be merged with the default configuration in numaflow-controller-config. It accepts a YAML format configuration, it may include 4 sections, \&quot;stream\&quot;, \&quot;consumer\&quot;, \&quot;otBucket\&quot; and \&quot;procBucket\&quot;. Available fields under \&quot;stream\&quot; include \&quot;retention\&quot; (e.g. interest, limits, workerQueue), \&quot;maxMsgs\&quot;, \&quot;maxAge\&quot; (e.g. 72h), \&quot;replicas\&quot; (1, 3, 5), \&quot;duplicates\&quot; (e.g. 5m). Available fields under \&quot;consumer\&quot; include \&quot;ackWait\&quot; (e.g. 60s) Available fields under \&quot;otBucket\&quot; include \&quot;maxValueSize\&quot;, \&quot;history\&quot;, \&quot;ttl\&quot; (e.g. 72h), \&quot;maxBytes\&quot;, \&quot;replicas\&quot; (1, 3, 5). Available fields under \&quot;procBucket\&quot; include \&quot;maxValueSize\&quot;, \&quot;history\&quot;, \&quot;ttl\&quot; (e.g. 72h), \&quot;maxBytes\&quot;, \&quot;replicas\&quot; (1, 3, 5). |  [optional] |
|**containerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**dnsConfig** | **V1PodDNSConfig** |  |  [optional] |
|**dnsPolicy** | **String** | Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;. |  [optional] |
|**encryption** | **Boolean** | Whether encrypt the data at rest, defaults to false Enabling encryption might impact the performance, see https://docs.nats.io/running-a-nats-service/nats_admin/jetstream_admin/encryption_at_rest for the detail Toggling the value will impact encrypting/decrypting existing messages. |  [optional] |
|**imagePullSecrets** | **List&lt;V1LocalObjectReference&gt;** | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod |  [optional] |
|**metadata** | [**Metadata**](Metadata.md) |  |  [optional] |
|**metricsContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional] |
|**persistence** | [**PersistenceStrategy**](PersistenceStrategy.md) |  |  [optional] |
|**priority** | **Integer** | The priority value. Various system components use this field to find the priority of the Redis pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional] |
|**priorityClassName** | **String** | If specified, indicates the Redis pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional] |
|**reloaderContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional] |
|**replicas** | **Integer** | Redis StatefulSet size |  [optional] |
|**runtimeClassName** | **String** | RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class |  [optional] |
|**securityContext** | **V1PodSecurityContext** |  |  [optional] |
|**serviceAccountName** | **String** | ServiceAccountName applied to the pod |  [optional] |
|**settings** | **String** | Nats/JetStream configuration, if not specified, global settings in numaflow-controller-config will be used. See https://docs.nats.io/running-a-nats-service/configuration#limits and https://docs.nats.io/running-a-nats-service/configuration#jetstream. For limits, only \&quot;max_payload\&quot; is supported for configuration, defaults to 1048576 (1MB), not recommended to use values over 8388608 (8MB) but max_payload can be set up to 67108864 (64MB). For jetstream, only \&quot;max_memory_store\&quot; and \&quot;max_file_store\&quot; are supported for configuration, do not set \&quot;store_dir\&quot; as it has been hardcoded. |  [optional] |
|**startArgs** | **List&lt;String&gt;** | Optional arguments to start nats-server. For example, \&quot;-D\&quot; to enable debugging output, \&quot;-DV\&quot; to enable debugging and tracing. Check https://docs.nats.io/ for all the available arguments. |  [optional] |
|**tls** | **Boolean** | Whether enable TLS, defaults to false Enabling TLS might impact the performance |  [optional] |
|**tolerations** | **List&lt;V1Toleration&gt;** | If specified, the pod&#39;s tolerations. |  [optional] |
|**version** | **String** | JetStream version, such as \&quot;2.7.1\&quot; |  [optional] |



