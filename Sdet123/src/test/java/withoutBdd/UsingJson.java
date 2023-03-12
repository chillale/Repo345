package withoutBdd;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class UsingJson {
	@Test
	public void addProject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("createdBy", "AutoRamPrasad");
		jsonObject.put("projectName", "jabardasth");
		jsonObject.put("status", "going");
		jsonObject.put("teamSize", 4);
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.body(jsonObject);
		Response response = requestSpecification.post("http://localhost:8084/addProject");
		response.prettyPrint();
		int code = response.getStatusCode();
		Assert.assertEquals(201, code);
		
		
	}

}
