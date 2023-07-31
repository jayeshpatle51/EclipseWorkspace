package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import resources.APIBody;
import resources.APIResources;
import resources.Body;
import resources.LoginPojo;
import resources.Utils;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;


public class Step extends Utils
{
	RequestSpecification req;
	APIBody body = new APIBody();
	Response res;
	static String token;
	static String userid;
	static String productid;
	
	public void getvalues()
	{
		LoginPojo s =  res.as(LoginPojo.class);
	    token =s.getToken() ;
	    System.out.println(token);
	    userid = s.getUserId();
	}
	
	
	@Given("user loads the API with the {string}")
	public void user_loads_the_api_with_the(String string) throws FileNotFoundException
	{
		Body b = Body.valueOf(string);
		String bod = b.getBody();
		if (bod.contains("****"))
		{
			bod = bod.replace("****", productid);
		}

		req = given().log().all().header("Content-Type","application/json").spec(reqSpec()).body(bod);
		
		if (string.equalsIgnoreCase("loginAPIBody"))
		{
			req = given().log().all().header("Content-Type","application/json").spec(reqSpec()).body(bod);
		}
		else 
		{
			req = given().log().all().header("Content-Type","application/json").spec(reqSpec()).header("Authorization", token).body(bod);
		}
		
//		if (string.equalsIgnoreCase("loginpayload"))
//		{
//			req = given().log().all().spec(reqSpec()).body(body.loginAPIBody());
//		}else if (string.equalsIgnoreCase("orderpayload")) 
//		{
//			req = given().log().all().spec(reqSpec()).header("Authorization", token).body(body.createOrderApiBody(productid));
//		}
	}
	
	@SuppressWarnings("deprecation")
	@Then("user should see the response as {int}")
	public void user_should_see_the_response_as(long int1)
	{
		
	    Assert.assertEquals(res.statusCode(), int1);
	}
	
	@Given("user loads the addproductAPI with the payload")
	public void user_loads_the_addproduct_api_with_the_payload() throws FileNotFoundException 
	{
		
		req = reqSpecforAddproduct(userid).header("Authorization", token);
	}
	
		
	@When("user calls the post http method with {string}")
	public void user_calls_the_post_http_method_with(String resource) 
	{
		APIResources resources=APIResources.valueOf(resource);

	    res =  req.when().post(resources.getResource()).then().log().all().extract().response();
		
	    
	    if (resource.equals("loginAPI"))
	    {
	    	getvalues();	
		}
	    
	    if (resource.equals("addProductAPI"))
	    {
			String s = res.asPrettyString();
			JsonPath js = new JsonPath(s);
			productid = js.getString("productId");
		}
	    
	}


	@When("user calls the delete http method with {string}")
	public void user_calls_the_delete_http_method_with(String resource) throws FileNotFoundException 

	{
		APIResources resources=APIResources.valueOf(resource);
		
		
			String api = resources.getResource().replace("yyyy", productid);
			System.out.println("Delete product aPI IS: "+api);
		    res =  given().spec(reqSpec()).header("Authorization", token)
		    	.when().delete(api).then().log().all().extract().response();
	}



}
