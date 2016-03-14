package com.training;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;



public class MyClient {
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:4040/REST_Example/");
		
		
		System.out.println(target.path("jaxrs").path("simple/name").
				request().get(String.class).toString());
	
		System.out.println(target.path("jaxrs").path("simple/delete/101").request().delete(String.class).toString());
		
	}

}
