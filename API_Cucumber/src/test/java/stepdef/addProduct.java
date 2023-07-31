package stepdef;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.io.File;

public class addProduct {
	
	
	public static String userid="";
	public static String id="";	
	public static String token="";	
	
		
	static RequestSpecification reqLogin=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
			setContentType(ContentType.JSON).build();
	
	static ResponseSpecification resLogin=new ResponseSpecBuilder().expectStatusCode(200).
			expectContentType(ContentType.JSON).build();
	
	RequestSpecification reqAddP,reqPlaceOrder;
	Response response1,response2;
	
	
	
	
	public static String LoginBody()
	{
		return "{\r\n"
				+ "    \"userEmail\": \"devi@gmail.com\",\r\n"
				+ "    \"userPassword\": \"Devi@123456\"\r\n"
				+ "}" ;
	}
	
	public static String PlaceOrder()
	{
		return "{\r\n"
				+ "    \"orders\": [\r\n"
				+ "        {\r\n"
				+ "            \"country\": \"India\",\r\n"
				+ "            \"productOrderedId\": \"6454ed91568c3e9fb1648703\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
	}
	
	
	@Given("user adds the product using Payload")
	public void user_adds_the_product_using_payload() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String Login=given().log().all().spec(reqLogin).body(LoginBody()).
				when().post("/api/ecom/auth/login").
				then().spec(resLogin).extract().response().asPrettyString();
		
		
		JsonPath js=new JsonPath(Login);		
		userid=js.getString("userId");
		token=js.getString("token");
		
		
		 reqAddP=given().header("Authorization",token)
				.header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>")			
				.multiPart("productAddedBy", userid)
				.multiPart("productName", "qwerty")
				.multiPart("productCategory","fashion")
				.multiPart("productSubCategory", "shirts")
				.multiPart("productPrice", "11500")
				.multiPart("productDescription", "Addias Originals")		
				.multiPart("productFor","women")
			    .multiPart("productImage", new File("C:\\Users\\SPURGE\\Downloads\\carimg.jpg"));				
	}
	
		
	@When("user calls http request method")
	public void user_calls_http_request_method() {
			
		response1=reqAddP.when().post("/api/ecom/product/add-product").then().log().all().extract().response();
		
	}
	
	@Then("user should see response code as {int}")
	public void user_should_see_response_code_as(Integer int1) {
				
		assertEquals(response1.statusCode(), 201);
	}
	
	
	@Given("user adds the product using {string}")
	public void user_adds_the_product_using(String string) {
		
		
	}

	@When("user calls {string} http request method")
	public void user_calls_http_request_method(String string) {
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Then("delete the product") public void delete_the_product() {
	 * 
	 * }
	 */

	/*
	 * @Given("user is on HomePage") public void user_is_on_home_page() {
	 * 
	 * 
	 * RestAssured.baseURI="https://rahulshettyacademy.com";
	 * 
	 * String Login=given().log().all().spec(reqLogin).body(LoginBody()).
	 * when().post("/api/ecom/auth/login").
	 * then().spec(resLogin).extract().response().asPrettyString();
	 * 
	 * reqPlaceOrder=given().spec(reqLogin).header("Authorization",token).body(
	 * PlaceOrder());
	 * 
	 * }
	 * 
	 * @When("user calls http request method and add payload") public void
	 * user_calls_http_request_method_and_add_payload() {
	 * 
	 * response2=reqPlaceOrder.when().post("/api/ecom/order/create-order").then().
	 * spec(resLogin).extract().response();
	 * 
	 * }
	 * 
	 * 
	 * @Then("user should see msg as {string}") public void
	 * user_should_see_msg_as(String Actualstring) {
	 * 
	 * Assert.assertEquals(Actualstring, "Order Placed Successfully");
	 * 
	 * } }
	 */