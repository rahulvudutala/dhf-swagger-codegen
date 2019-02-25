package com.marklogic.hub.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.marklogic.hub.client.invoker.ApiClient;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2019-02-22T15:51:23.383-08:00[America/Los_Angeles]")
@Component("com.marklogic.hub.client.api.FlowsApi")

public class FlowsApi {
    private ApiClient apiClient;

    public FlowsApi() {
        this(new ApiClient());
    }

    @Autowired
    public FlowsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Create flow
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void createFlow() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/flows").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Create Step for a Flow
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - Step not found
     * @param flowId Id of flow that the step is associated with
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void createFlowStep(String flowId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling createFlowStep");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}/steps").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete flow by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - Flow not found
     * @param flowId Id of the flow that needs to be deleted
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void deleteFlow(String flowId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling deleteFlow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Delete a Flow&#x27;s step by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - Step not found
     * @param flowId Id of flow that the step is associated with
     * @param stepId Id of step that needs to be deleted
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void deleteFlowStep(String flowId, String stepId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling deleteFlowStep");
        }
        
        // verify the required parameter 'stepId' is set
        if (stepId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stepId' when calling deleteFlowStep");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        uriVariables.put("stepId", stepId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}/steps/{stepId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Find flow by Id
     * ....
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - flow not found
     * @param flowId Id of flow to be fetched
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public String getFlow(String flowId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling getFlow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Find all Steps accociated with a Flow
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - flow not found
     * @param flowId Id of flow that the step is associated with
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void getFlowSteps(String flowId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling getFlowSteps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}/steps").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Returns all flows
     * Returns all flows
     * <p><b>200</b> - successful operation
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void getFlows() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/flows").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update flow by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - flow not found
     * @param flowId Id of the flow that needs to be updated
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void updateFlow(String flowId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling updateFlow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    /**
     * Update a Flow&#x27;s step by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter supplied
     * <p><b>404</b> - Step not found
     * @param flowId Id of flow that the step is associated with
     * @param stepId Id of step that needs to be updated
     * @throws RestClientException if an error occurs while attempting to invoke the API

     */
    public void updateFlowStep(String flowId, String stepId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'flowId' when calling updateFlowStep");
        }
        
        // verify the required parameter 'stepId' is set
        if (stepId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stepId' when calling updateFlowStep");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("flowId", flowId);
        uriVariables.put("stepId", stepId);
        String path = UriComponentsBuilder.fromPath("/flows/{flowId}/steps/{stepId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
}

