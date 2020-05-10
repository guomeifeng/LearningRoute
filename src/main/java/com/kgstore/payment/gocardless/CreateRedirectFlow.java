package com.kgstore.payment.gocardless;

import com.gocardless.GoCardlessClient;
import com.gocardless.resources.RedirectFlow;

public class CreateRedirectFlow {
	
	private GCClient gcClient;
	
    public static void main(String[] args) {
    	CreateRedirectFlow instance = new CreateRedirectFlow(new GCClient());
    	instance.create("GLOWPOWERUAT");
    }
    
    public CreateRedirectFlow(GCClient gcClient) {
    	this.gcClient = gcClient;    	
    }
    
    public String create(String environment) {

		GoCardlessClient client = gcClient.get(environment);

        RedirectFlow redirectFlow = client.redirectFlows().create()
            .withDescription("Cider Barrels") // This will be shown on the payment pages.
            .withSessionToken("dummy_session_token") // Not the access token
            .withSuccessRedirectUrl("https://developer.gocardless.com/example-redirect-uri/")
            // Optionally, prefill customer details on the payment page
            .withPrefilledCustomerGivenName("Tim")
            .withPrefilledCustomerFamilyName("Rogers")
            .withPrefilledCustomerEmail("tim@gocardless.com")
            .withPrefilledCustomerAddressLine1("338-346 Goswell Road")
            .withPrefilledCustomerCity("London")
            .withPrefilledCustomerPostalCode("EC1V 7LQ")
            .execute();
        // Hold on to this ID - you'll need it when you
        // "confirm" the redirect flow later
        System.out.println(redirectFlow.getId());
        System.out.println(redirectFlow.getRedirectUrl());
        return redirectFlow.getId();
    }
}