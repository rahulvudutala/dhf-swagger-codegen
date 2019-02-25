# FlowsApi

All URIs are relative to *http://localhost:4200/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFlow**](FlowsApi.md#createFlow) | **POST** /flows | Create flow
[**createFlowStep**](FlowsApi.md#createFlowStep) | **POST** /flows/{flowId}/steps | Create Step for a Flow
[**deleteFlow**](FlowsApi.md#deleteFlow) | **DELETE** /flows/{flowId} | Delete flow by Id
[**deleteFlowStep**](FlowsApi.md#deleteFlowStep) | **DELETE** /flows/{flowId}/steps/{stepId} | Delete a Flow&#x27;s step by Id
[**getFlow**](FlowsApi.md#getFlow) | **GET** /flows/{flowId} | Find flow by Id
[**getFlowSteps**](FlowsApi.md#getFlowSteps) | **GET** /flows/{flowId}/steps | Find all Steps accociated with a Flow
[**getFlows**](FlowsApi.md#getFlows) | **GET** /flows | Returns all flows
[**updateFlow**](FlowsApi.md#updateFlow) | **PUT** /flows/{flowId} | Update flow by Id
[**updateFlowStep**](FlowsApi.md#updateFlowStep) | **PUT** /flows/{flowId}/steps/{stepId} | Update a Flow&#x27;s step by Id




<a name="createFlow"></a>
# **createFlow**
> createFlow()

Create flow

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

try {
    apiInstance.createFlow();
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#createFlow");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="createFlowStep"></a>
# **createFlowStep**
> createFlowStep(flowId)

Create Step for a Flow

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of flow that the step is associated with

try {
    apiInstance.createFlowStep(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#createFlowStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of flow that the step is associated with |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="deleteFlow"></a>
# **deleteFlow**
> deleteFlow(flowId)

Delete flow by Id

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of the flow that needs to be deleted

try {
    apiInstance.deleteFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of the flow that needs to be deleted |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="deleteFlowStep"></a>
# **deleteFlowStep**
> deleteFlowStep(flowId, stepId)

Delete a Flow&#x27;s step by Id

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of flow that the step is associated with

String stepId = Arrays.asList("stepId_example"); // String | Id of step that needs to be deleted

try {
    apiInstance.deleteFlowStep(flowId, stepId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#deleteFlowStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of flow that the step is associated with |
 **stepId** | **String**| Id of step that needs to be deleted |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="getFlow"></a>
# **getFlow**
> getFlow(flowId)

Find flow by Id

....

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of flow to be fetched

try {
    apiInstance.getFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of flow to be fetched |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="getFlowSteps"></a>
# **getFlowSteps**
> getFlowSteps(flowId)

Find all Steps accociated with a Flow

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of flow that the step is associated with

try {
    apiInstance.getFlowSteps(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowSteps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of flow that the step is associated with |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="getFlows"></a>
# **getFlows**
> getFlows()

Returns all flows

Returns all flows

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

try {
    apiInstance.getFlows();
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlows");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="updateFlow"></a>
# **updateFlow**
> updateFlow(flowId)

Update flow by Id

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of the flow that needs to be updated

try {
    apiInstance.updateFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#updateFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of the flow that needs to be updated |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="updateFlowStep"></a>
# **updateFlowStep**
> updateFlowStep(flowId, stepId)

Update a Flow&#x27;s step by Id

### Example
```java
// Import classes:
//import com.marklogic.hub.client.invoker.ApiException;
//import com.marklogic.hub.client.api.FlowsApi;



FlowsApi apiInstance = new FlowsApi();

String flowId = Arrays.asList("flowId_example"); // String | Id of flow that the step is associated with

String stepId = Arrays.asList("stepId_example"); // String | Id of step that needs to be updated

try {
    apiInstance.updateFlowStep(flowId, stepId);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#updateFlowStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| Id of flow that the step is associated with |
 **stepId** | **String**| Id of step that needs to be updated |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



