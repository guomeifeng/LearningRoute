package com.kgstore.configuation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.web.client.RestTemplate;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import controller.ConfigController;
import controller.ConfigDTO;



public class ConfiguationClient{
	
	
	public static void main(String[] args) {
		ConfiguationClient client = new ConfiguationClient();
		String result = client.getConfigurationByJar("GLOWPOWERUAT");
		System.out.println("get Configuration By included Jar controller method:" + result);
		
		
		result = client.getConfigurationByRestTemplate("GLOWPOWERUAT");
		System.out.println("get Configuration By RestTemplate:" + result);
		
		
		result = client.getConfigurationByOKHttp("GLOWPOWERUAT");
		System.out.println("get Configuration By OKHttpClient:" + result);
	}
	
	public String getConfigurationByRestTemplate(String environment)  {
		RestTemplate restTemplate=new RestTemplate();
		String result = restTemplate.getForObject("http://localhost:8080/get?environment=GLOWPOWERUAT", String.class);
		return result;
	}
	
	public String getConfigurationByJar(String environment)  {
		List<ConfigDTO> configs = ConfigController.getConfigByEnvironment(environment);
		return configs.toString();
	}
	
	public String getConfigurationByOKHttp(String environment)  {
		OkHttpClient okHttpClient = new OkHttpClient();
		
		Request request = new Request.Builder()
				.url("http://localhost:8080/get?environment=GLOWPOWERUAT")
				.build();
		Response response = null;
		try {
			response = okHttpClient.newCall(request).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		 String result = null;
		 boolean isSuccessful = response.isSuccessful();
		 ResponseBody body = response.body();
		 if (body != null) {
		     result = body.toString();
		 }
		 System.out.println(isSuccessful );
		 System.out.println(response.message());
		 try {
			System.out.println(body.string());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			System.out.println(response.);
		return result;
	}
}
