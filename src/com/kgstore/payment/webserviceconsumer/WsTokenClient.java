package com.kgstore.payment.webserviceconsumer;

import javax.xml.ws.WebServiceRef;

import com.kgstore.payment.webservice.WsTokenProxy;
import com.kgstore.payment.webservice.WsTokenService;

public class WsTokenClient {
	@WebServiceRef(wsdlLocation="http://localhost:8080/Payment/services/WsToken?wsdl")
    static WsTokenService service ;
	public static void main(String[] args) {

		   

		        try {
		        	WsTokenClient client = new WsTokenClient();
		            client.doTest(args);
		        } catch(Exception e) {
		            e.printStackTrace();
		        }
	

		    
		
		
		
	}
	public void doTest(String[] args) {
        try {
            System.out.println("Retrieving the port from the following service: " + service);
            WsTokenProxy proxy = new WsTokenProxy();
            System.out.println("Invoking the sayHello operation the port.");

            String name;
            if (args.length > 0) {
                name = args[0];
            } else {
                name = "No Name";
            }

            String response = proxy.getToken(name);
            System.out.println(response);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
