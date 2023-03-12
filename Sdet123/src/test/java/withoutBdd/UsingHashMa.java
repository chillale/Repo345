package withoutBdd;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsingHashMa {
	public static HashMap hashMap=new HashMap();
	@BeforeClass
	public void before()
	{
		hashMap.put("createdBy", "rohini");
		hashMap.put("projectName", "dividi");
		hashMap.put("status", "created");
		hashMap.put("teamSize", 8);
		
		baseURI="http://localhost:8084";
	    basePath="/addProject";
	    
		
	}
	@Test
	public void hash() 
	{
		given()
		.contentType("application/json")
		.body(hashMap)
		.when().post().then().statusCode(201).log().all();
	}

}
