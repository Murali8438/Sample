package com.Rest_Assure;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import junit.framework.Assert;

public class Get_Method {
	
	@Test
	public  void getrequest() {
		
		RestAssured.baseURI = "https://reques.in/";
		
		RequestSpecification given = RestAssured.given();
		
		Response response = given.get("/api/users/2");
		
		String asString = response.asString();
		
		System.out.println(asString);
		
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		
		//Assert.assertEquals(200, statusCode);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
