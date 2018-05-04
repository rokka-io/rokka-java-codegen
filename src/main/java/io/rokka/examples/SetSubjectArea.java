package io.rokka.examples;

import com.google.gson.internal.LinkedTreeMap;
import io.rokka.client.codegen.ApiException;
import io.rokka.client.codegen.api.SourceimagesApi;
import io.rokka.client.codegen.model.SourceImage;

import java.util.HashMap;


public class SetSubjectArea {

    public static void main(String[] args) {

        Config config = new Config();

        SourceimagesApi apiInstance = new SourceimagesApi(config.getDefaultClient());

        try {

            String organization = config.getOrganization(); // String |
            String hash = "cf5c133959e8ae77d9e5c50583c6c30dcf645109"; // String |
            String metaName = "subject_area"; // String |
            Boolean deletePrevious = false; // Boolean | If the image with the original hash should be deleted

            HashMap<String, Object> metaDynamicDefinition = new HashMap<String, Object>();
            metaDynamicDefinition.put("width", 1);
            metaDynamicDefinition.put("height", 1);
            metaDynamicDefinition.put("x", 20);
            metaDynamicDefinition.put("y", 30);
            SourceImage image = apiInstance.createSourceImageMetaDynamicWithName(metaDynamicDefinition, organization, hash, metaName, deletePrevious);

            System.out.println(image);

            System.out.println("\n New hash of new image is: " + image.getHash());
            LinkedTreeMap meta = (LinkedTreeMap) image.getDynamicMetadata();
            System.out.println("\n Dynamic metadata is: " + meta);
            LinkedTreeMap subject_area = (LinkedTreeMap) meta.get("subject_area");
            System.out.println("\n Dynamic metadata subject_area is: " + subject_area);
            System.out.println("\n Dynamic metadata subject_area.x is: " + subject_area.get("x"));

        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
