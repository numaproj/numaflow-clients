# RedisSettings


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**master** | **str** | Special settings for Redis master node, will override the global settings from controller config | [optional] 
**redis** | **str** | Redis settings shared by both master and slaves, will override the global settings from controller config | [optional] 
**replica** | **str** | Special settings for Redis replica nodes, will override the global settings from controller config | [optional] 
**sentinel** | **str** | Sentinel settings, will override the global settings from controller config | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


