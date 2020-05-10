package com.kgstore.payment.gocardless;

import com.gocardless.GoCardlessClient;
import com.gocardless.resources.RedirectFlow;

public class CompleteRedirectFlow {
	
	private GCClient gcClient;
	
    public static void main(String[] args) {
    	CompleteRedirectFlow instance = new CompleteRedirectFlow(new GCClient());
    	instance.complete("GLOWPOWERUAT");
    }
    
    public CompleteRedirectFlow(GCClient gcClient) {
    	this.gcClient = gcClient;    	
    }
    
    public String complete(String environment) {
    	GCClient gcClient = new GCClient();
		GoCardlessClient client = gcClient.get(environment);

        RedirectFlow redirectFlow = client.redirectFlows()
            // The redirect flow ID from above
            .complete("RE0002HR081NP41F3M23KTDQD71NBX6N")
            .withSessionToken("dummy_session_token")
            .execute();

        System.out.println(redirectFlow.getLinks().getMandate());
        // Save this mandate ID for the next section.
        System.out.println(redirectFlow.getLinks().getCustomer());

        // Display a confirmation page to your customer, telling them their Direct Debit
        // has been set up. You could build your own, or use ours, which shows all the
        // relevant information and is translated into all the languages we support.
        System.out.println(redirectFlow.getConfirmationUrl());
        return redirectFlow.getLinks().getMandate();
    }
}