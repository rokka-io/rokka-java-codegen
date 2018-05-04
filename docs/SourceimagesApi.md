# SourceimagesApi

All URIs are relative to *https://api.rokka.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copySourceImage**](SourceimagesApi.md#copySourceImage) | **POST** /sourceimages/{organization}/{hash}/copy | Copy a single source image to another org.
[**createSourceImage**](SourceimagesApi.md#createSourceImage) | **POST** /sourceimages/{organization} | Upload new source images.
[**createSourceImageMetaDynamicWithName**](SourceimagesApi.md#createSourceImageMetaDynamicWithName) | **PUT** /sourceimages/{organization}/{hash}/meta/dynamic/{metaName} | Adds or updates a specific dynamic meta data for an image.
[**createSourceImageMetaUser**](SourceimagesApi.md#createSourceImageMetaUser) | **PUT** /sourceimages/{organization}/{hash}/meta/user | Replace the image meta data with new information.
[**createSourceImageMetaUserWthName**](SourceimagesApi.md#createSourceImageMetaUserWthName) | **PUT** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Adds or updates one user meta data field for an image.
[**deleteSourceImage**](SourceimagesApi.md#deleteSourceImage) | **DELETE** /sourceimages/{organization}/{hash} | Delete a single source image.
[**deleteSourceImageMetaDynamicWithName**](SourceimagesApi.md#deleteSourceImageMetaDynamicWithName) | **DELETE** /sourceimages/{organization}/{hash}/meta/dynamic/{metaName} | Deletes a specific dynamic meta data.
[**deleteSourceImageMetaUser**](SourceimagesApi.md#deleteSourceImageMetaUser) | **DELETE** /sourceimages/{organization}/{hash}/meta/user | Deletes all user meta data.
[**deleteSourceImageMetaUserWithName**](SourceimagesApi.md#deleteSourceImageMetaUserWithName) | **DELETE** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Deletes user meta data for a specified field.
[**downloadSourceImage**](SourceimagesApi.md#downloadSourceImage) | **GET** /sourceimages/{organization}/{hash}/download | Download original source image binary.
[**getSourceImage**](SourceimagesApi.md#getSourceImage) | **GET** /sourceimages/{organization}/{hash} | Get information about a source image.
[**getSourceImageMetaUser**](SourceimagesApi.md#getSourceImageMetaUser) | **GET** /sourceimages/{organization}/{hash}/meta/user | Get all user meta data.
[**getSourceImageMetaUserWithName**](SourceimagesApi.md#getSourceImageMetaUserWithName) | **GET** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Get user meta for a specific field.
[**listSourceImages**](SourceimagesApi.md#listSourceImages) | **GET** /sourceimages/{organization} | Get all images of an organization, with paging.
[**listSourceImagesByBinaryHash**](SourceimagesApi.md#listSourceImagesByBinaryHash) | **GET** /sourceimages/{organization}/binaryhash/{binaryHash} | Get all images in this organization that match a binaryhash.
[**patchSourceImageMetaUser**](SourceimagesApi.md#patchSourceImageMetaUser) | **PATCH** /sourceimages/{organization}/{hash}/meta/user | Update the specified meta data fields for an image.
[**restoreSourceImage**](SourceimagesApi.md#restoreSourceImage) | **POST** /sourceimages/{organization}/{hash}/restore | Restore source image including previously set metadata.


<a name="copySourceImage"></a>
# **copySourceImage**
> copySourceImage(destination, organization, hash, overwrite)

Copy a single source image to another org.

The metadata is copied as well. After copying, changes to either image metadata are not reflected in the other image metadata.  This is a proxy method for COPY on /sourceimages/{organization}/{hash}. It allows to copy images with a POST request, to work around restrictive firewalls and allows to produce a swagger specification for this operation.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String destination = "destination_example"; // String | The destination organization
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String overwrite = "overwrite_example"; // String | If set to 'F', existing images won't be overwritten.
try {
    apiInstance.copySourceImage(destination, organization, hash, overwrite);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#copySourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destination** | **String**| The destination organization |
 **organization** | **String**|  |
 **hash** | **String**|  |
 **overwrite** | **String**| If set to &#39;F&#39;, existing images won&#39;t be overwritten. | [optional] [enum: ,  F]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createSourceImage"></a>
# **createSourceImage**
> ListSourceImagesResponse createSourceImage(filedata, organization, metaDynamic, metaUser)

Upload new source images.

The request is form data for the uploaded files and arrays of metadata. Files and metadata are matched based on their order in the request.  Note that this call allows to upload multiple images, but the swagger UI does not support this.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
File filedata = new File("/path/to/file.txt"); // File | The binary images
String organization = "organization_example"; // String | 
String metaDynamic = "metaDynamic_example"; // String | JSON metadata about the image, e.g. subject area. See https://rokka.io/documentation/references/dynamic-metadata.html
String metaUser = "metaUser_example"; // String | User specific JSON metadata that can be used when searching source images. See https://rokka.io/documentation/references/user-metadata.html
try {
    ListSourceImagesResponse result = apiInstance.createSourceImage(filedata, organization, metaDynamic, metaUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#createSourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filedata** | **File**| The binary images |
 **organization** | **String**|  |
 **metaDynamic** | **String**| JSON metadata about the image, e.g. subject area. See https://rokka.io/documentation/references/dynamic-metadata.html | [optional]
 **metaUser** | **String**| User specific JSON metadata that can be used when searching source images. See https://rokka.io/documentation/references/user-metadata.html | [optional]

### Return type

[**ListSourceImagesResponse**](ListSourceImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createSourceImageMetaDynamicWithName"></a>
# **createSourceImageMetaDynamicWithName**
> SourceImage createSourceImageMetaDynamicWithName(metaDynamicDefinition, organization, hash, metaName, deletePrevious)

Adds or updates a specific dynamic meta data for an image.

This changes the hash of the image. The response provides the new location of the image in the Location header.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
Object metaDynamicDefinition = null; // Object | Dynamic Meta Data definition
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String metaName = "metaName_example"; // String | 
Boolean deletePrevious = false; // Boolean | If the image with the original hash should be deleted
try {
    SourceImage result = apiInstance.createSourceImageMetaDynamicWithName(metaDynamicDefinition, organization, hash, metaName, deletePrevious);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#createSourceImageMetaDynamicWithName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metaDynamicDefinition** | **Object**| Dynamic Meta Data definition |
 **organization** | **String**|  |
 **hash** | **String**|  |
 **metaName** | **String**|  |
 **deletePrevious** | **Boolean**| If the image with the original hash should be deleted | [optional] [default to false]

### Return type

[**SourceImage**](SourceImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createSourceImageMetaUser"></a>
# **createSourceImageMetaUser**
> createSourceImageMetaUser(userMetaData, organization, hash)

Replace the image meta data with new information.

All existing meta data for the image is removed and then the new meta data is added.  User metadata is used for searching images that have been stored in rokka. It will never lead to differences in the output image and thus changing it never leads to a new hash.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
Object userMetaData = null; // Object | User Meta Data as a json hashmap
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    apiInstance.createSourceImageMetaUser(userMetaData, organization, hash);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#createSourceImageMetaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userMetaData** | **Object**| User Meta Data as a json hashmap |
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createSourceImageMetaUserWthName"></a>
# **createSourceImageMetaUserWthName**
> createSourceImageMetaUserWthName(userMetaDataSingleField, organization, hash, metaName)

Adds or updates one user meta data field for an image.

User metadata is used for searching images that have been stored in rokka. It will never lead to differences in the output image and thus changing it never leads to a new hash.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String userMetaDataSingleField = "userMetaDataSingleField_example"; // String | User Meta Data for a single field in json format
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String metaName = "metaName_example"; // String | 
try {
    apiInstance.createSourceImageMetaUserWthName(userMetaDataSingleField, organization, hash, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#createSourceImageMetaUserWthName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userMetaDataSingleField** | **String**| User Meta Data for a single field in json format |
 **organization** | **String**|  |
 **hash** | **String**|  |
 **metaName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSourceImage"></a>
# **deleteSourceImage**
> deleteSourceImage(organization, hash)

Delete a single source image.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    apiInstance.deleteSourceImage(organization, hash);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#deleteSourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSourceImageMetaDynamicWithName"></a>
# **deleteSourceImageMetaDynamicWithName**
> SourceImage deleteSourceImageMetaDynamicWithName(organization, hash, metaName, deletePrevious)

Deletes a specific dynamic meta data.

This changes the hash of the image. The response provides the new location of the image in the Location header.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String metaName = "metaName_example"; // String | 
Boolean deletePrevious = false; // Boolean | If the image with the original hash should be deleted
try {
    SourceImage result = apiInstance.deleteSourceImageMetaDynamicWithName(organization, hash, metaName, deletePrevious);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#deleteSourceImageMetaDynamicWithName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |
 **metaName** | **String**|  |
 **deletePrevious** | **Boolean**| If the image with the original hash should be deleted | [optional] [default to false]

### Return type

[**SourceImage**](SourceImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSourceImageMetaUser"></a>
# **deleteSourceImageMetaUser**
> deleteSourceImageMetaUser(organization, hash)

Deletes all user meta data.

User metadata is used for searching images that have been stored in rokka. It will never lead to differences in the output image and thus changing it never leads to a new hash.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    apiInstance.deleteSourceImageMetaUser(organization, hash);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#deleteSourceImageMetaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSourceImageMetaUserWithName"></a>
# **deleteSourceImageMetaUserWithName**
> deleteSourceImageMetaUserWithName(organization, hash, metaName)

Deletes user meta data for a specified field.

User metadata is used for searching images that have been stored in rokka. It will never lead to differences in the output image and thus changing it never leads to a new hash.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String metaName = "metaName_example"; // String | 
try {
    apiInstance.deleteSourceImageMetaUserWithName(organization, hash, metaName);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#deleteSourceImageMetaUserWithName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |
 **metaName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadSourceImage"></a>
# **downloadSourceImage**
> File downloadSourceImage(organization, hash)

Download original source image binary.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    File result = apiInstance.downloadSourceImage(organization, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#downloadSourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSourceImage"></a>
# **getSourceImage**
> SourceImage getSourceImage(organization, hash)

Get information about a source image.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    SourceImage result = apiInstance.getSourceImage(organization, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#getSourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

[**SourceImage**](SourceImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSourceImageMetaUser"></a>
# **getSourceImageMetaUser**
> Object getSourceImageMetaUser(organization, hash)

Get all user meta data.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    Object result = apiInstance.getSourceImageMetaUser(organization, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#getSourceImageMetaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSourceImageMetaUserWithName"></a>
# **getSourceImageMetaUserWithName**
> String getSourceImageMetaUserWithName(organization, hash, metaName)

Get user meta for a specific field.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
String metaName = "metaName_example"; // String | 
try {
    String result = apiInstance.getSourceImageMetaUserWithName(organization, hash, metaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#getSourceImageMetaUserWithName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |
 **metaName** | **String**|  |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listSourceImages"></a>
# **listSourceImages**
> ListSourceImagesResponse listSourceImages(organization, offset, limit, sort, deleted)

Get all images of an organization, with paging.

You can also filter and sort by their metadata. See the API reference for more in depth documentation about this.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String offset = "0"; // String | When paging results, where to start or a cursor
Integer limit = 100; // Integer | How many images should be returned
String sort = "created desc"; // String | The field to be used for sorting
Boolean deleted = false; // Boolean | Search for deleted images
try {
    ListSourceImagesResponse result = apiInstance.listSourceImages(organization, offset, limit, sort, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#listSourceImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **offset** | **String**| When paging results, where to start or a cursor | [optional] [default to 0]
 **limit** | **Integer**| How many images should be returned | [optional] [default to 100]
 **sort** | **String**| The field to be used for sorting | [optional] [default to created desc]
 **deleted** | **Boolean**| Search for deleted images | [optional] [default to false]

### Return type

[**ListSourceImagesResponse**](ListSourceImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listSourceImagesByBinaryHash"></a>
# **listSourceImagesByBinaryHash**
> ListSourceImagesResponse listSourceImagesByBinaryHash(organization, binaryHash)

Get all images in this organization that match a binaryhash.

The binary hash is the sha1 of the image binary. This may yield several results if the same image has been uploaded with varying dynamic metadata.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String binaryHash = "binaryHash_example"; // String | 
try {
    ListSourceImagesResponse result = apiInstance.listSourceImagesByBinaryHash(organization, binaryHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#listSourceImagesByBinaryHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **binaryHash** | **String**|  |

### Return type

[**ListSourceImagesResponse**](ListSourceImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchSourceImageMetaUser"></a>
# **patchSourceImageMetaUser**
> patchSourceImageMetaUser(userMetaData, organization, hash)

Update the specified meta data fields for an image.

This only overwrites the fields specified in the request, but leaves existing meta data with different names unchanged.  User metadata is used for searching images that have been stored in rokka. It will never lead to differences in the output image and thus changing it never leads to a new hash.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
Object userMetaData = null; // Object | User Meta Data as a json hashmap
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    apiInstance.patchSourceImageMetaUser(userMetaData, organization, hash);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#patchSourceImageMetaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userMetaData** | **Object**| User Meta Data as a json hashmap |
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="restoreSourceImage"></a>
# **restoreSourceImage**
> SourceImage restoreSourceImage(organization, hash)

Restore source image including previously set metadata.

If the image has been deleted but not yet purged from the system, it is restored. If an image with this hash already exists and is not deleted, information about that image is returned.

### Example
```java
// Import classes:
//import io.rokka.client.codegen.ApiClient;
//import io.rokka.client.codegen.ApiException;
//import io.rokka.client.codegen.Configuration;
//import io.rokka.client.codegen.auth.*;
//import io.rokka.client.codegen.api.SourceimagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SourceimagesApi apiInstance = new SourceimagesApi();
String organization = "organization_example"; // String | 
String hash = "hash_example"; // String | 
try {
    SourceImage result = apiInstance.restoreSourceImage(organization, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceimagesApi#restoreSourceImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **hash** | **String**|  |

### Return type

[**SourceImage**](SourceImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

