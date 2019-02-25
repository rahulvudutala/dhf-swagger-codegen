# qs-datahub-codegen-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.marklogic</groupId>
    <artifactId>qs-datahub-codegen-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.marklogic:qs-datahub-codegen-api:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/qs-datahub-codegen-api-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.marklogic.hub.client.invoker.*;
import com.marklogic.hub.client.invoker.auth.*;
import com.marklogic.hub.client.model.*;
import com.marklogic.hub.client.api.FlowsApi;

import java.io.File;
import java.util.*;

public class FlowsApiExample {

    public static void main(String[] args) {
        

        FlowsApi apiInstance = new FlowsApi();
        
        try {
            apiInstance.createFlow();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlowsApi#createFlow");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:4200/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FlowsApi* | [**createFlow**](docs/FlowsApi.md#createFlow) | **POST** /flows | Create flow
*FlowsApi* | [**createFlowStep**](docs/FlowsApi.md#createFlowStep) | **POST** /flows/{flowId}/steps | Create Step for a Flow
*FlowsApi* | [**deleteFlow**](docs/FlowsApi.md#deleteFlow) | **DELETE** /flows/{flowId} | Delete flow by Id
*FlowsApi* | [**deleteFlowStep**](docs/FlowsApi.md#deleteFlowStep) | **DELETE** /flows/{flowId}/steps/{stepId} | Delete a Flow&#x27;s step by Id
*FlowsApi* | [**getFlow**](docs/FlowsApi.md#getFlow) | **GET** /flows/{flowId} | Find flow by Id
*FlowsApi* | [**getFlowSteps**](docs/FlowsApi.md#getFlowSteps) | **GET** /flows/{flowId}/steps | Find all Steps accociated with a Flow
*FlowsApi* | [**getFlows**](docs/FlowsApi.md#getFlows) | **GET** /flows | Returns all flows
*FlowsApi* | [**updateFlow**](docs/FlowsApi.md#updateFlow) | **PUT** /flows/{flowId} | Update flow by Id
*FlowsApi* | [**updateFlowStep**](docs/FlowsApi.md#updateFlowStep) | **PUT** /flows/{flowId}/steps/{stepId} | Update a Flow&#x27;s step by Id


## Documentation for Models

 - [CustomHook](docs/CustomHook.md)
 - [Flow](docs/Flow.md)
 - [Job](docs/Job.md)
 - [Step](docs/Step.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



