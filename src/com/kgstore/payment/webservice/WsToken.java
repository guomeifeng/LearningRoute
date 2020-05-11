package com.kgstore.payment.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

//MD0008PEAKZNNZ
@WebService
public class WsToken {
	@WebMethod
    public String getToken(String name) {
		String token = "MD0008PEAKZNNZ";
        return name + ", Token is: " + token;
    }
	
	public static void main(String[] args) {
	
		Endpoint.publish("http://localhost:8080/getToken",new WsToken());
		 
		}

}
