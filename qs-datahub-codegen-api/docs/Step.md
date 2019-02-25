
# Step

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of a step |  [optional]
**name** | **String** | Name of a step | 
**description** | **String** | Description of a step |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of a step | 
**sourceDatabase** | **String** |  |  [optional]
**targetDatabase** | **String** |  |  [optional]
**isValid** | **Boolean** | Boolean flag to tell whether a Step is valid |  [optional]
**isRunning** | **Boolean** | Boolean flag to tell whether a Step is running |  [optional]
**config** | **Object** |  |  [optional]
**language** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**customHook** | [**CustomHook**](CustomHook.md) |  |  [optional]



<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INGESTION | &quot;ingestion&quot;
MAPPING | &quot;mapping&quot;
MASTERING | &quot;mastering&quot;
CUSTOM | &quot;custom&quot;



