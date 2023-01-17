# PipelineLimits


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buffer_max_length** | **int** | BufferMaxLength is used to define the max length of a buffer Only applies to UDF and Source vertice as only they do buffer write. It can be overridden by the settings in vertex limits. | [optional] 
**buffer_usage_limit** | **int** | BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. Only applies to UDF and Source vertice as only they do buffer write. It will be overridden by the settings in vertex limits. | [optional] 
**read_batch_size** | **int** | Read batch size for all the vertices in the pipeline, can be overridden by the vertex&#39;s limit settings | [optional] 
**read_timeout** | [**V1Duration**](V1Duration.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


