# Scale

Scale defines the parameters for autoscaling.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cooldown_seconds** | **int** | Cooldown seconds after a scaling operation before another one. | [optional] 
**disabled** | **bool** | Whether to disable autoscaling. Set to \&quot;true\&quot; when using Kubernetes HPA or any other 3rd party autoscaling strategies. | [optional] 
**lookback_seconds** | **int** | Lookback seconds to calculate the average pending messages and processing rate. | [optional] 
**max** | **int** | Maximum replicas. | [optional] 
**min** | **int** | Minimum replicas. | [optional] 
**replicas_per_scale** | **int** | ReplicasPerScale defines maximum replicas can be scaled up or down at once. The is use to prevent too aggressive scaling operations | [optional] 
**target_buffer_usage** | **int** | TargetBufferUsage is used to define the target percentage of usage of the buffer to be read. A valid and meaningful value should be less than the BufferUsageLimit defined in the Edge spec (or Pipeline spec), for example, 50. It only applies to UDF and Sink vertices as only they have buffers to read. | [optional] 
**target_processing_seconds** | **int** | TargetProcessingSeconds is used to tune the aggressiveness of autoscaling for source vertices, it measures how fast you want the vertex to process all the pending messages. Typically increasing the value, which leads to lower processing rate, thus less replicas. It&#39;s only effective for source vertices. | [optional] 
**zero_replica_sleep_seconds** | **int** | After scaling down to 0, sleep how many seconds before scaling up to peek. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


