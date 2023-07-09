# GetRedisStatefulSetSpecReq


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conf_config_map_name** | **str** |  | 
**credential_secret_name** | **str** |  | 
**health_config_map_name** | **str** |  | 
**init_container_image** | **str** |  | 
**labels** | **{str: (str,)}** |  | 
**metrics_exporter_image** | **str** |  | 
**pvc_name_if_needed** | **str** |  | 
**redis_container_port** | **int** |  | 
**redis_image** | **str** |  | 
**redis_metrics_container_port** | **int** |  | 
**scripts_config_map_name** | **str** |  | 
**sentinel_container_port** | **int** |  | 
**sentinel_image** | **str** |  | 
**service_name** | **str** |  | 
**tls_enabled** | **bool** |  | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


