# AdminApi

All URIs are relative to *https://api.rokka.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMembership**](AdminApi.md#createMembership) | **PUT** /organizations/{organization}/memberships/{email} | Add a rokka user into an organization.
[**createOrganization**](AdminApi.md#createOrganization) | **PUT** /organizations/{organization} | Register a new Organization.
[**createOrganizationOptions**](AdminApi.md#createOrganizationOptions) | **PUT** /organizations/{organization}/options | Update options for an organization.
[**createUser**](AdminApi.md#createUser) | **POST** /users | Register new user.
[**deleteMembership**](AdminApi.md#deleteMembership) | **DELETE** /organizations/{organization}/memberships/{email} | Remove a user from an organization.
[**getMembership**](AdminApi.md#getMembership) | **GET** /organizations/{organization}/memberships/{email} | Get information about organization membership of a rokka user.
[**getOrganization**](AdminApi.md#getOrganization) | **GET** /organizations/{organization} | Get information about an organization.


<a name="createMembership"></a>
# **createMembership**
> Membership createMembership(role, organization, email)

Add a rokka user into an organization.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
Role role = new Role(); // Role | Role specification
String organization = "organization_example"; // String | 
String email = "email_example"; // String | 
try {
    Membership result = apiInstance.createMembership(role, organization, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | [**Role**](Role.md)| Role specification |
 **organization** | **String**|  |
 **email** | **String**|  |

### Return type

[**Membership**](Membership.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createOrganization"></a>
# **createOrganization**
> Organization createOrganization(organization, organizationDefinition)

Register a new Organization.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String organization = "organization_example"; // String | Name of the organization to create (must be a web safe string)
OrganizationDefinition organizationDefinition = new OrganizationDefinition(); // OrganizationDefinition | Organization information
try {
    Organization result = apiInstance.createOrganization(organization, organizationDefinition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Name of the organization to create (must be a web safe string) |
 **organizationDefinition** | [**OrganizationDefinition**](OrganizationDefinition.md)| Organization information |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createOrganizationOptions"></a>
# **createOrganizationOptions**
> Organization createOrganizationOptions(organization, organizationOptions)

Update options for an organization.

This is currently used for the remote_* options.  See https://rokka.io/documentation/references/stacks.html#loading-images-from-a-remote-url for details.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String organization = "organization_example"; // String | Organization name
OrganizationOptions organizationOptions = new OrganizationOptions(); // OrganizationOptions | Organization options
try {
    Organization result = apiInstance.createOrganizationOptions(organization, organizationOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createOrganizationOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Organization name |
 **organizationOptions** | [**OrganizationOptions**](OrganizationOptions.md)| Organization options |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createUser"></a>
# **createUser**
> User createUser(userDefinition)

Register new user.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
UserDefinition userDefinition = new UserDefinition(); // UserDefinition | User information
try {
    User result = apiInstance.createUser(userDefinition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDefinition** | [**UserDefinition**](UserDefinition.md)| User information |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMembership"></a>
# **deleteMembership**
> deleteMembership(organization, email)

Remove a user from an organization.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String organization = "organization_example"; // String | 
String email = "email_example"; // String | 
try {
    apiInstance.deleteMembership(organization, email);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#deleteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **email** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMembership"></a>
# **getMembership**
> Membership getMembership(organization, email)

Get information about organization membership of a rokka user.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String organization = "organization_example"; // String | 
String email = "email_example"; // String | 
try {
    Membership result = apiInstance.getMembership(organization, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **email** | **String**|  |

### Return type

[**Membership**](Membership.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrganization"></a>
# **getOrganization**
> Organization getOrganization(organization)

Get information about an organization.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String organization = "organization_example"; // String | Organization name
try {
    Organization result = apiInstance.getOrganization(organization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Organization name |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

