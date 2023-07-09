# RedisConfig


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**master_name** | **str** | Only required when Sentinel is used | [optional] 
**password** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | [optional] 
**sentinel_password** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | [optional] 
**sentinel_url** | **str** | Sentinel URL, will be ignored if Redis URL is provided | [optional] 
**url** | **str** | Redis URL | [optional] 
**user** | **str** | Redis user | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


