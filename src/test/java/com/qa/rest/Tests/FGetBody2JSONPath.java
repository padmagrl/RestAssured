package com.qa.rest.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FGetBody2JSONPath {
	@Test
	public void VerifyCityInJsonResponse()
	{
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response res= httpRequest.get("/Hyderabad");
		JsonPath  jp=res.jsonPath();
		
		String city = jp.get("City");

		// Let us print the city variable to see what we got
		System.out.println("City received from Response " + city);

		// Validate the response
		Assert.assertEquals(city, "Hyderabad", "Correct city name received in the Response");
		
	}

}
