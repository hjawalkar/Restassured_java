package restassured.restassure;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_put {
	
	@Test
	void put_1() {
		

		JSONObject jo = new JSONObject();
		
		jo.put("name","jt");
		jo.put("job","Automationleader");  
		System.out.println(jo);

		given().
		contentType(ContentType.JSON).
		body(jo.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		}
	
	@Test
	void patch_1() {
		

		JSONObject jo = new JSONObject();
		
		jo.put("name","jt");
		jo.put("job","Automationleader");  
		System.out.println(jo);

		given().
		contentType(ContentType.JSON).
		body(jo.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		}
	
	
}