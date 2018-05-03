package io.rokka.examples;

import io.rokka.client.codegen.ApiClient;
import io.rokka.client.codegen.Configuration;
import io.rokka.client.codegen.auth.ApiKeyAuth;

public class Config {

    private String basePath = "https://api.rokka.io/";
    private String apiKey = "YOUR_API_KEY";
    private String organization ="YOUR_ORGANIZATION";

    ApiClient getDefaultClient() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(basePath);

        // Configure API key authorization: ApiKeyAuth
        io.rokka.client.codegen.auth.ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(apiKey);
        return defaultClient;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
