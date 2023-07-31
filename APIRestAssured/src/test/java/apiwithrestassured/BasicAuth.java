package apiwithrestassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BasicAuth {

	@Test
	public void basicAuthentication() {

		given().auth().basic("postman", "password").when().get("https://postman-echo.com/basic-auth").then()
				.statusCode(200).log()
				.all();
	}

	public void digestAuthentication() {

		given().auth().digest("postman", "password").when().get("https://postman-echo.com/digest-auth").then().log()
				.all();
	}
}
