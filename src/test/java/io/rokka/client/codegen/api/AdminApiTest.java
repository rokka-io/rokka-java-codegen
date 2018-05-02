/*
 * rokka.io
 * digital image processing done right. [Documentation](https://rokka.io/documentation). [Changelog](https://api.rokka.io/changelog.md).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.rokka.client.codegen.api;

import io.rokka.client.codegen.ApiException;
import io.rokka.client.codegen.model.Membership;
import io.rokka.client.codegen.model.Organization;
import io.rokka.client.codegen.model.OrganizationDefinition;
import io.rokka.client.codegen.model.OrganizationOptions;
import io.rokka.client.codegen.model.Role;
import io.rokka.client.codegen.model.User;
import io.rokka.client.codegen.model.UserDefinition;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    
    /**
     * Add a rokka user into an organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMembershipTest() throws ApiException {
        Role role = null;
        String organization = null;
        String email = null;
        Membership response = api.createMembership(role, organization, email);

        // TODO: test validations
    }
    
    /**
     * Register a new Organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationTest() throws ApiException {
        String organization = null;
        OrganizationDefinition organizationDefinition = null;
        Organization response = api.createOrganization(organization, organizationDefinition);

        // TODO: test validations
    }
    
    /**
     * Update options for an organization.
     *
     * This is currently used for the remote_* options.  See https://rokka.io/documentation/references/stacks.html#loading-images-from-a-remote-url for details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationOptionsTest() throws ApiException {
        String organization = null;
        OrganizationOptions organizationOptions = null;
        Organization response = api.createOrganizationOptions(organization, organizationOptions);

        // TODO: test validations
    }
    
    /**
     * Register new user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserDefinition userDefinition = null;
        User response = api.createUser(userDefinition);

        // TODO: test validations
    }
    
    /**
     * Remove a user from an organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMembershipTest() throws ApiException {
        String organization = null;
        String email = null;
        api.deleteMembership(organization, email);

        // TODO: test validations
    }
    
    /**
     * Get information about organization membership of a rokka user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMembershipTest() throws ApiException {
        String organization = null;
        String email = null;
        Membership response = api.getMembership(organization, email);

        // TODO: test validations
    }
    
    /**
     * Get information about an organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationTest() throws ApiException {
        String organization = null;
        Organization response = api.getOrganization(organization);

        // TODO: test validations
    }
    
}
