package restassured.restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_get {

	@Test
		void test_01(){
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getContentType());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getTime());
		
		int sta = response.getStatusCode();
		Assert.assertEquals(sta, 200);
	}
	
	 
}

