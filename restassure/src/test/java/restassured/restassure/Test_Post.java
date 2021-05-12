package restassured.restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_Post {


	@Test
	void post_1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name","jt");
		map.put("job","leader");
		System.out.println(map);

		JSONObject jo = new JSONObject(map);
		/*.......instead of map u can directly use below */
		//jo.put("name","jt");
		//jo.put("job","leader");  
		System.out.println(jo);

		given().
		contentType(ContentType.JSON).
		body(jo.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
		


	}
	
}
