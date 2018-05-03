package io.rokka.examples;

import io.rokka.client.codegen.ApiException;
import io.rokka.client.codegen.api.StacksApi;
import io.rokka.client.codegen.model.Stack;
import io.rokka.client.codegen.model.StackDefinition;
import io.rokka.client.codegen.model.StackOperation;

import java.util.HashMap;


public class CreateStack {

    public static void main(String[] args) {

        Config config = new Config();

        StacksApi apiInstance = new StacksApi(config.getDefaultClient());

        try {
            StackOperation stackOperation = new StackOperation();
            stackOperation.setName("resize");
            HashMap<String, Object> options = new HashMap<String, Object>();
            options.put("width", 500);
            options.put("height", 500);
            stackOperation.setOptions(options);

            HashMap<String, Object> stackOptions = new HashMap<String, Object>();
            stackOptions.put("autoformat", true);

            StackDefinition stackDefinition = new StackDefinition();
            stackDefinition.addStackOperationsItem(stackOperation);
            stackDefinition.setStackOptions(stackOptions);

            Stack stack = apiInstance.createStack(stackDefinition, config.getOrganization(), "foo", true);

            System.out.println(stack);
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
