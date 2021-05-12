package restassured.restassure;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test_delete {

	@Test
	void delete_1() {
		

		given().
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
		}
	
}
