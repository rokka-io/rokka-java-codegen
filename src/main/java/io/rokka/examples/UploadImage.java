package io.rokka.examples;

import io.rokka.client.codegen.ApiException;
import io.rokka.client.codegen.api.SourceimagesApi;
import io.rokka.client.codegen.model.ListSourceImagesResponse;
import java.io.File;


public class UploadImage {

    public static void main(String[] args) {

        Config config = new Config();

        SourceimagesApi apiInstance = new SourceimagesApi(config.getDefaultClient());

        try {
            File image = new File("image.png");
            ListSourceImagesResponse response = apiInstance.createSourceImage(image, config.getOrganization(), null, null);

            System.out.println(response);
            System.out.println("\n Hash of new image is: " + response.getItems().get(0).getHash());
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
