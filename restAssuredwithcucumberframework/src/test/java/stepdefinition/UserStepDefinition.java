package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import resources.Utils;

public class UserStepDefinition extends Utils {

	RequestSpecification req;

	@Given("user Provide the userdetails using {string}")
	public void user_provide_the_userdetails_using(String string) {
		// req=reqSpec("url");
		System.out.println(string);
	}

	@When("user calls {string} http request method")
	public void user_calls_http_request_method(String string) {
		System.out.println(string);
	}

	@Then("user should see response code as {int}")
	public void user_should_see_response_code_as(Integer int1) {
		System.out.println(int1);
	}
}
