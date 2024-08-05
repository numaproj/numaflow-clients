

# Scale

Scale defines the parameters for autoscaling.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cooldownSeconds** | **Long** | Deprecated: Use scaleUpCooldownSeconds and scaleDownCooldownSeconds instead. Cooldown seconds after a scaling operation before another one. |  [optional] |
|**disabled** | **Boolean** | Whether to disable autoscaling. Set to \&quot;true\&quot; when using Kubernetes HPA or any other 3rd party autoscaling strategies. |  [optional] |
|**lookbackSeconds** | **Long** | Lookback seconds to calculate the average pending messages and processing rate. |  [optional] |
|**max** | **Integer** | Maximum replicas. |  [optional] |
|**min** | **Integer** | Minimum replicas. |  [optional] |
|**replicasPerScale** | **Long** | ReplicasPerScale defines maximum replicas can be scaled up or down at once. The is use to prevent too aggressive scaling operations |  [optional] |
|**scaleDownCooldownSeconds** | **Long** | ScaleDownCooldownSeconds defines the cooldown seconds after a scaling operation, before a follow-up scaling down. It defaults to the CooldownSeconds if not set. |  [optional] |
|**scaleUpCooldownSeconds** | **Long** | ScaleUpCooldownSeconds defines the cooldown seconds after a scaling operation, before a follow-up scaling up. It defaults to the CooldownSeconds if not set. |  [optional] |
|**targetBufferAvailability** | **Long** | TargetBufferAvailability is used to define the target percentage of the buffer availability. A valid and meaningful value should be less than the BufferUsageLimit defined in the Edge spec (or Pipeline spec), for example, 50. It only applies to UDF and Sink vertices because only they have buffers to read. |  [optional] |
|**targetProcessingSeconds** | **Long** | TargetProcessingSeconds is used to tune the aggressiveness of autoscaling for source vertices, it measures how fast you want the vertex to process all the pending messages. Typically increasing the value, which leads to lower processing rate, thus less replicas. It&#39;s only effective for source vertices. |  [optional] |
|**zeroReplicaSleepSeconds** | **Long** | After scaling down the source vertex to 0, sleep how many seconds before scaling the source vertex back up to peek. |  [optional] |



