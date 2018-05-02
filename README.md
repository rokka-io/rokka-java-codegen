# rokka-client-codegen

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
    <groupId>io.rokka.client.codegen</groupId>
    <artifactId>rokka-client-codegen</artifactId>
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.rokka.client.codegen:rokka-client-codegen:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rokka-client-codegen-0.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.rokka.client.codegen.*;
import io.rokka.client.codegen.auth.*;
import io.rokka.client.codegen.model.*;
import io.rokka.client.codegen.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.rokka.io/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**createMembership**](docs/AdminApi.md#createMembership) | **PUT** /organizations/{organization}/memberships/{email} | Add a rokka user into an organization.
*AdminApi* | [**createOrganization**](docs/AdminApi.md#createOrganization) | **PUT** /organizations/{organization} | Register a new Organization.
*AdminApi* | [**createOrganizationOptions**](docs/AdminApi.md#createOrganizationOptions) | **PUT** /organizations/{organization}/options | Update options for an organization.
*AdminApi* | [**createUser**](docs/AdminApi.md#createUser) | **POST** /users | Register new user.
*AdminApi* | [**deleteMembership**](docs/AdminApi.md#deleteMembership) | **DELETE** /organizations/{organization}/memberships/{email} | Remove a user from an organization.
*AdminApi* | [**getMembership**](docs/AdminApi.md#getMembership) | **GET** /organizations/{organization}/memberships/{email} | Get information about organization membership of a rokka user.
*AdminApi* | [**getOrganization**](docs/AdminApi.md#getOrganization) | **GET** /organizations/{organization} | Get information about an organization.
*SourceimagesApi* | [**createSourceImage**](docs/SourceimagesApi.md#createSourceImage) | **POST** /sourceimages/{organization} | Upload new source images.
*SourceimagesApi* | [**createSourceImageMetaDynamicWithName**](docs/SourceimagesApi.md#createSourceImageMetaDynamicWithName) | **PUT** /sourceimages/{organization}/{hash}/meta/dynamic/{metaName} | Adds or updates a specific dynamic meta data for an image.
*SourceimagesApi* | [**createSourceImageMetaUser**](docs/SourceimagesApi.md#createSourceImageMetaUser) | **PUT** /sourceimages/{organization}/{hash}/meta/user | Replace the image meta data with new information.
*SourceimagesApi* | [**createSourceImageMetaUserWthName**](docs/SourceimagesApi.md#createSourceImageMetaUserWthName) | **PUT** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Adds or updates one user meta data field for an image.
*SourceimagesApi* | [**deleteSourceImage**](docs/SourceimagesApi.md#deleteSourceImage) | **DELETE** /sourceimages/{organization}/{hash} | Delete a single source image.
*SourceimagesApi* | [**deleteSourceImageMetaDynamicWithName**](docs/SourceimagesApi.md#deleteSourceImageMetaDynamicWithName) | **DELETE** /sourceimages/{organization}/{hash}/meta/dynamic/{metaName} | Deletes a specific dynamic meta data.
*SourceimagesApi* | [**deleteSourceImageMetaUser**](docs/SourceimagesApi.md#deleteSourceImageMetaUser) | **DELETE** /sourceimages/{organization}/{hash}/meta/user | Deletes all user meta data.
*SourceimagesApi* | [**deleteSourceImageMetaUserWithName**](docs/SourceimagesApi.md#deleteSourceImageMetaUserWithName) | **DELETE** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Deletes user meta data for a specified field.
*SourceimagesApi* | [**downloadSourceImage**](docs/SourceimagesApi.md#downloadSourceImage) | **GET** /sourceimages/{organization}/{hash}/download | Download original source image binary.
*SourceimagesApi* | [**getSourceImage**](docs/SourceimagesApi.md#getSourceImage) | **GET** /sourceimages/{organization}/{hash} | Get information about a source image.
*SourceimagesApi* | [**getSourceImageMetaUser**](docs/SourceimagesApi.md#getSourceImageMetaUser) | **GET** /sourceimages/{organization}/{hash}/meta/user | Get all user meta data.
*SourceimagesApi* | [**getSourceImageMetaUserWithName**](docs/SourceimagesApi.md#getSourceImageMetaUserWithName) | **GET** /sourceimages/{organization}/{hash}/meta/user/{metaName} | Get user meta for a specific field.
*SourceimagesApi* | [**listSourceImages**](docs/SourceimagesApi.md#listSourceImages) | **GET** /sourceimages/{organization} | Get all images of an organization, with paging.
*SourceimagesApi* | [**listSourceImagesByBinaryHash**](docs/SourceimagesApi.md#listSourceImagesByBinaryHash) | **GET** /sourceimages/{organization}/binaryhash/{binaryHash} | Get all images in this organization that match a binaryhash.
*SourceimagesApi* | [**patchSourceImageMetaUser**](docs/SourceimagesApi.md#patchSourceImageMetaUser) | **PATCH** /sourceimages/{organization}/{hash}/meta/user | Update the specified meta data fields for an image.
*SourceimagesApi* | [**restoreSourceImage**](docs/SourceimagesApi.md#restoreSourceImage) | **POST** /sourceimages/{organization}/{hash}/restore | Restore source image including previously set metadata.
*SourceimagesApi* | [**sourceimagesOrganizationHashCopyPost**](docs/SourceimagesApi.md#sourceimagesOrganizationHashCopyPost) | **POST** /sourceimages/{organization}/{hash}/copy | Copy a single source image to another org.
*StacksApi* | [**createStack**](docs/StacksApi.md#createStack) | **PUT** /stacks/{organization}/{name} | Create a new stack.
*StacksApi* | [**deleteStack**](docs/StacksApi.md#deleteStack) | **DELETE** /stacks/{organization}/{name} | Delete a stack.
*StacksApi* | [**getStack**](docs/StacksApi.md#getStack) | **GET** /stacks/{organization}/{name} | Get a single stack.
*StacksApi* | [**listOperations**](docs/StacksApi.md#listOperations) | **GET** /operations | Listing all available operations that can be used in stacks.
*StacksApi* | [**listStackOptions**](docs/StacksApi.md#listStackOptions) | **GET** /stackoptions | List all available options that can be set on stacks.
*StacksApi* | [**listStacks**](docs/StacksApi.md#listStacks) | **GET** /stacks/{organization} | Get all stacks of an organization.


## Documentation for Models

 - [ListSourceImagesResponse](docs/ListSourceImagesResponse.md)
 - [ListStacksResponse](docs/ListStacksResponse.md)
 - [Membership](docs/Membership.md)
 - [Organization](docs/Organization.md)
 - [OrganizationDefinition](docs/OrganizationDefinition.md)
 - [OrganizationOptions](docs/OrganizationOptions.md)
 - [Role](docs/Role.md)
 - [SourceImage](docs/SourceImage.md)
 - [Stack](docs/Stack.md)
 - [StackDefinition](docs/StackDefinition.md)
 - [StackExpression](docs/StackExpression.md)
 - [StackExpressionOverrides](docs/StackExpressionOverrides.md)
 - [StackOperation](docs/StackOperation.md)
 - [StackOperationDescription](docs/StackOperationDescription.md)
 - [StackOptions](docs/StackOptions.md)
 - [User](docs/User.md)
 - [UserDefinition](docs/UserDefinition.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



