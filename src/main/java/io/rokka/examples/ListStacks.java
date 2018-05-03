package io.rokka.examples;

import io.rokka.client.codegen.*;
import io.rokka.client.codegen.model.*;
import io.rokka.client.codegen.api.StacksApi;


public class ListStacks {

    public static void main(String[] args) {

        Config config = new Config();

        StacksApi apiInstance = new StacksApi(config.getDefaultClient());

        try {
            ListStacksResponse result = apiInstance.listStacks(config.getOrganization());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
