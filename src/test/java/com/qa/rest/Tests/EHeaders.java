package com.qa.rest.Tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EHeaders {
	@Test
	public void GetWeatherHeaders()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.get("/78789798798");
		System.out.println(res.getHeaders());
		String contentType= res.getHeader("Content-Type");
		System.out.println("Content-Type value:-------> " + contentType);
		System.out.println("Content-Type value:-------> " + res.header("Content-Type"));
		
		Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
		Headers h=res.getHeaders();
		HashMap<String, String> hm=new HashMap<String, String>();
		for (Header h2 : h) {
			System.out.println(h2.getName()+"**********"+h2.getValue());
			hm.put(h2.getName(), h2.getValue());
			
		}
		
		hm.forEach((K,V)->System.out.println(K+"===="+V));
		
		
	}

}
