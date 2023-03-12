package withoutBdd;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UsingJsonTest {
     @Test
     public void json() {
    	 JSONObject jsonObject =new JSONObject();
    	 jsonObject.put("createdBy", "Harika");
    	 jsonObject.put("projectName", "peechee");
    	 jsonObject.put("status", "ongoing");
    	 jsonObject.put("teamSize", 4);
    	 
    	 RequestSpecification requestSpecification = RestAssured.given();
    	 requestSpecification.contentType(ContentType.JSON);
    	 requestSpecification.body(jsonObject);
    	 Response resp = requestSpecification.post("http://localhost:8084/addProject");
    	  int sCode = resp.statusCode();
    	String proName = resp.jsonPath().get("projectName");
    	Assert.assertEquals(201, sCode);
    	Assert.assertEquals("peechee", proName);
    	
    	 
     }

}
