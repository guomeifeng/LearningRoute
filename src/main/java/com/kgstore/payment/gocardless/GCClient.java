package com.kgstore.payment.gocardless;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.gocardless.GoCardlessClient;
import com.gocardless.resources.Customer;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;

import controller.ConfigController;
import controller.ConfigDTO;


public class GCClient {
	
	
	public static void main(String[] args) {
		GCClient gcClient = new GCClient();
		GoCardlessClient client = gcClient.get("GLOWPOWERUAT");

		System.out.println( "get connection successfully.");
		List<Customer> customers = client.customers().list().execute().getItems();
		System.out.println(Arrays.toString(customers.toArray()));
	}
    public GoCardlessClient get(String environment) {
    	try {

    		 List<ConfigDTO> configs = ConfigController.getConfigByEnvironment(environment);
    		 Optional<ConfigDTO> optConfig1 = configs.stream().filter(s->s.getItemkey().equalsIgnoreCase("GC_ACCESS_KEY")).findFirst();
    		 Optional<ConfigDTO> optConfig2 = configs.stream().filter(s->s.getItemkey().equalsIgnoreCase("GC_ENVIRONMENT")).findFirst();
//    		 optConfig1.ifPresent(thisConfig->gcClient = getGCClient(thisConfig.getItemvalue()));
    		 if (optConfig1.isPresent()&&optConfig2.isPresent()) {

    			 System.out.println("access token used is: " + optConfig1.get().getItemvalue());
    			 System.out.println("GoCardless environment is: " + optConfig2.get().getItemvalue());
    			 GoCardlessClient client = GoCardlessClient
    		                .newBuilder(optConfig1.get().getItemvalue())
    		                .withEnvironment(GoCardlessClient.Environment.valueOf(optConfig2.get().getItemvalue()))
    		                .build();
    			 return client;
    		 } else {
    			 System.out.println("Connection Info missed."  );
    			 return null;
    		 }
    		 

    	}catch (Exception ex) {
    		System.out.println("Error Happen"  );
    		ex.printStackTrace();
    		return null;
    	}
        
    }
//    public GoCardlessClient get(String environment) {
//    	try {
//
//    		 List<ConfigDTO> configs = ConfigController.getConfigByEnvironment(environment);
//    		 Optional<ConfigDTO> optConfig1 = configs.stream().filter(s->s.getItemkey().equalsIgnoreCase("GC_ACCESS_KEY")).findFirst();
//    		 Optional<ConfigDTO> optConfig2 = configs.stream().filter(s->s.getItemkey().equalsIgnoreCase("GC_ENVIRONMENT")).findFirst();
////    		 optConfig1.ifPresent(thisConfig->gcClient = getGCClient(thisConfig.getItemvalue()));
//    		 if (optConfig1.isPresent()&&optConfig2.isPresent()) {
//
//    			 System.out.println("access token used is: " + optConfig1.get().getItemvalue());
//    			 System.out.println("GoCardless environment is: " + optConfig2.get().getItemvalue());
//    			 GoCardlessClient client = GoCardlessClient
//    		                .newBuilder(optConfig1.get().getItemvalue())
//    		                .withEnvironment(GoCardlessClient.Environment.valueOf(optConfig2.get().getItemvalue()))
//    		                .build();
//    			 return client;
//    		 } else {
//    			 System.out.println("Connection Info missed."  );
//    			 return null;
//    		 }
//    		 
//
//    	}catch (Exception ex) {
//    		System.out.println("Error Happen"  );
//    		ex.printStackTrace();
//    		return null;
//    	}
//        
//    }
}