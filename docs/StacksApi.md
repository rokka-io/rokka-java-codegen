# StacksApi

All URIs are relative to *https://api.rokka.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStack**](StacksApi.md#createStack) | **PUT** /stacks/{organization}/{name} | Create a new stack.
[**deleteStack**](StacksApi.md#deleteStack) | **DELETE** /stacks/{organization}/{name} | Delete a stack.
[**getStack**](StacksApi.md#getStack) | **GET** /stacks/{organization}/{name} | Get a single stack.
[**listOperations**](StacksApi.md#listOperations) | **GET** /operations | Listing all available operations that can be used in stacks.
[**listStackOptions**](StacksApi.md#listStackOptions) | **GET** /stackoptions | List all available options that can be set on stacks.
[**listStacks**](StacksApi.md#listStacks) | **GET** /stacks/{organization} | Get all stacks of an organization.


<a name="createStack"></a>
# **createStack**
> Stack createStack(stackDefinition, organization, name, overwrite)

Create a new stack.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
StackDefinition stackDefinition = new StackDefinition(); // StackDefinition | Stack operations and options definition. See https://rokka.io/documentation/references/stacks.html for explanations how to define stacks.
String organization = "organization_example"; // String | 
String name = "name_example"; // String | 
Boolean overwrite = false; // Boolean | Whether to overwrite the stack if it already exists
try {
    Stack result = apiInstance.createStack(stackDefinition, organization, name, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#createStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stackDefinition** | [**StackDefinition**](StackDefinition.md)| Stack operations and options definition. See https://rokka.io/documentation/references/stacks.html for explanations how to define stacks. |
 **organization** | **String**|  |
 **name** | **String**|  |
 **overwrite** | **Boolean**| Whether to overwrite the stack if it already exists | [optional] [default to false]

### Return type

[**Stack**](Stack.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteStack"></a>
# **deleteStack**
> deleteStack(organization, name)

Delete a stack.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
String organization = "organization_example"; // String | 
String name = "name_example"; // String | 
try {
    apiInstance.deleteStack(organization, name);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#deleteStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStack"></a>
# **getStack**
> Stack getStack(organization, name)

Get a single stack.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
String organization = "organization_example"; // String | 
String name = "name_example"; // String | 
try {
    Stack result = apiInstance.getStack(organization, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#getStack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **name** | **String**|  |

### Return type

[**Stack**](Stack.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listOperations"></a>
# **listOperations**
> Map&lt;String, StackOperationDescription&gt; listOperations()

Listing all available operations that can be used in stacks.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
try {
    Map<String, StackOperationDescription> result = apiInstance.listOperations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#listOperations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, StackOperationDescription&gt;**](StackOperationDescription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listStackOptions"></a>
# **listStackOptions**
> StackOptions listStackOptions()

List all available options that can be set on stacks.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
try {
    StackOptions result = apiInstance.listStackOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#listStackOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StackOptions**](StackOptions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listStacks"></a>
# **listStacks**
> ListStacksResponse listStacks(organization)

Get all stacks of an organization.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.StacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StacksApi apiInstance = new StacksApi();
String organization = "organization_example"; // String | 
try {
    ListStacksResponse result = apiInstance.listStacks(organization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#listStacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |

### Return type

[**ListStacksResponse**](ListStacksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

