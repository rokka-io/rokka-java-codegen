package io.rokka.examples;

import com.google.gson.internal.LinkedTreeMap;
import io.rokka.client.codegen.ApiException;
import io.rokka.client.codegen.api.SourceimagesApi;
import io.rokka.client.codegen.model.ListSourceImagesResponse;
import io.rokka.client.codegen.model.SourceImage;

import java.io.File;


public class UploadImage {

    public static void main(String[] args) {

        Config config = new Config();

        SourceimagesApi apiInstance = new SourceimagesApi(config.getDefaultClient());

        try {
            File image = new File("image.png");
            ListSourceImagesResponse response = apiInstance.createSourceImage(image, config.getOrganization(), null, "{\"foo\": \"bar\"}");

            System.out.println(response);
            SourceImage firstImage = response.getItems().get(0);
            System.out.println("\n Hash of new image is: " + firstImage.getHash());
            LinkedTreeMap usermeta = (LinkedTreeMap) firstImage.getUserMetadata();
            System.out.println("\n User metadata is: " + usermeta);
            System.out.println("\n User metadata foo is: " + usermeta.get("foo"));
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
