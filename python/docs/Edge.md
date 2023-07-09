# Edge


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_from** | **str** |  | 
**to** | **str** |  | 
**conditions** | [**ForwardConditions**](ForwardConditions.md) |  | [optional] 
**limits** | [**EdgeLimits**](EdgeLimits.md) |  | [optional] 
**parallelism** | **int** | Parallelism is only effective when the \&quot;to\&quot; vertex is a reduce vertex, if it&#39;s provided, the default value is set to \&quot;1\&quot;. Parallelism is ignored when the \&quot;to\&quot; vertex is not a reduce vertex. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


