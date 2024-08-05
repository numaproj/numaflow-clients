

# PBQStorage

PBQStorage defines the persistence configuration for a vertex.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emptyDir** | **V1EmptyDirVolumeSource** |  |  [optional] |
|**noStore** | **Object** | NoStore means there will be no persistence storage and there will be data loss during pod restarts. Use this option only if you do not care about correctness (e.g., approx statistics pipeline like sampling rate, etc.). |  [optional] |
|**persistentVolumeClaim** | [**PersistenceStrategy**](PersistenceStrategy.md) |  |  [optional] |



