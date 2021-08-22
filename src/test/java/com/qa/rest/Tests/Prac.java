package com.qa.rest.Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Prac {
	@Test
	public void getDet()
	{
		RestAssured.baseURI="";
		RequestSpecification httpReq=RestAssured.given();
		Response res=httpReq.request(Method.GET,"");
		String body=res.asString();
		res.
		
	}

}
