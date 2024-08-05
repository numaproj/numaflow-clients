

# CombinedEdge

CombinedEdge is a combination of Edge and some other properties such as vertex type, partitions, limits. It's used to decorate the fromEdges and toEdges of the generated Vertex objects, so that in the vertex pod, it knows the properties of the connected vertices, for example, how many partitioned buffers I should write to, what is the write buffer length, etc.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**ForwardConditions**](ForwardConditions.md) |  |  [optional] |
|**from** | **String** |  |  |
|**fromVertexLimits** | [**VertexLimits**](VertexLimits.md) |  |  [optional] |
|**fromVertexPartitionCount** | **Integer** | The number of partitions of the from vertex, if not provided, the default value is set to \&quot;1\&quot;. |  [optional] |
|**fromVertexType** | **String** | From vertex type. |  |
|**onFull** | **String** | OnFull specifies the behaviour for the write actions when the inter step buffer is full. There are currently two options, retryUntilSuccess and discardLatest. if not provided, the default value is set to \&quot;retryUntilSuccess\&quot; |  [optional] |
|**to** | **String** |  |  |
|**toVertexLimits** | [**VertexLimits**](VertexLimits.md) |  |  [optional] |
|**toVertexPartitionCount** | **Integer** | The number of partitions of the to vertex, if not provided, the default value is set to \&quot;1\&quot;. |  [optional] |
|**toVertexType** | **String** | To vertex type. |  |



