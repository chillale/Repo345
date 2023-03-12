package com.authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class BasicAuth {
	//@Test
	public void basic() {
		given()
		.auth().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then().body("authenticated", equalTo(true)).log().all();
		}
	
	//@Test
	public void digest() {
		given()
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	//@Test
	public void preemptive() {
		given()
		.auth().preemptive().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	//@Test
	public void bearer() {
		String token="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";
		given()
		.headers("Authorization","Bearer "+token)
		.when()
		.get("https://api.github.com/user/repos")
		.then().statusCode(200).log().all();
	}
	
	@Test
	public void oauth() {
		given()		
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/users/repos")
		.then()
		.statusCode(200)
		.log().all();
		}
	}


