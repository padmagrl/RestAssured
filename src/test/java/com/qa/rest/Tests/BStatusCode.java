package com.qa.rest.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BStatusCode {
	@Test
	public void GetWeatherDetails()
	{   
	
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/Budapest");

			String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("code-> "+response.getStatusCode());
		int code=response.getStatusCode();
		System.out.println("line-> "+response.getStatusLine());
		System.out.println("header-> "+response.getHeaders());
		System.out.println("getBody-> "+response.getBody().prettyPrint());
		Assert.assertEquals(code /*actual */, 200/*exp*/,"Correct status code returned");
	}

}
