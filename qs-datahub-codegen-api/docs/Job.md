
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of the job | 
**flowId** | **String** | Id of the flow associated with this job | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp job started |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp job started |  [optional]
**output** | [**List**](List.md) | Array of strings relating to output (TODO) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of a job |  [optional]
**successfulEvents** | **Long** |  |  [optional]
**failedEvents** | **Long** |  |  [optional]



<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
CANCELED | &quot;canceled&quot;
FAILED | &quot;failed&quot;
COMPLETED | &quot;completed&quot;



