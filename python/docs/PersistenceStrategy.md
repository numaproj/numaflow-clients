# PersistenceStrategy

PersistenceStrategy defines the strategy of persistence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_mode** | **str** | Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes | [optional] 
**storage_class_name** | **str** | Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 | [optional] 
**volume_size** | [**ResourceQuantity**](ResourceQuantity.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


