package withoutBdd;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UsingHashMap {
	@Test
	public void addProject() {
		HashMap hashMap = new HashMap();
		hashMap.put("createdBy", "Aadi");
		hashMap.put("projectName", "Contestant");
		hashMap.put("status", "ongoing");
		hashMap.put("teamSize", 8);
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.body(hashMap);
		Response response = requestSpecification.post("http://localhost:8084/addProject");
		response.asPrettyString();
		response.prettyPeek();
		response.prettyPrint();
		int code=response.getStatusCode();
		Assert.assertEquals(201, code);
		
	}

}
