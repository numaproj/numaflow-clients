

# PipelineLimits


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bufferMaxLength** | **Long** | BufferMaxLength is used to define the max length of a buffer. Only applies to UDF and Source vertices as only they do buffer write. It can be overridden by the settings in vertex limits. |  [optional] |
|**bufferUsageLimit** | **Long** | BufferUsageLimit is used to define the percentage of the buffer usage limit, a valid value should be less than 100, for example, 85. Only applies to UDF and Source vertices as only they do buffer write. It will be overridden by the settings in vertex limits. |  [optional] |
|**readBatchSize** | **Long** | Read batch size for all the vertices in the pipeline, can be overridden by the vertex&#39;s limit settings. |  [optional] |
|**readTimeout** | **String** |  |  [optional] |



