package restassured.restassure;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class Test_new {

	@Test
	void test_01(){
		Response response = get("https://reqres.in/api/users?page=2");
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

	@Test
	void  test_02() {

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7));

	}
}
