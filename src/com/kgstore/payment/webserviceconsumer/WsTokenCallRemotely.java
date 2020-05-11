package com.kgstore.payment.webserviceconsumer;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class WsTokenCallRemotely {
	public static void main(String[] args) {
		try {  
            String endpoint = "http://localhost:8080/Payment/services/WsToken?wsdl";  

            Service service = new Service();  
            Call call = (Call) service.createCall();  
            call.setTargetEndpointAddress(endpoint);  
            call.setOperationName("getToken");
            call.addParameter("name", org.apache.axis.encoding.XMLType.XSD_DATE,  
                          javax.xml.rpc.ParameterMode.IN);
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
            String temp = "Tester";  
            String result = (String)call.invoke(new Object[]{temp});  

            System.out.println("result is "+result);  
     }  
catch (Exception e) {  
            System.err.println(e.toString());  
     }
	}
}
