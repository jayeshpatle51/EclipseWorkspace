package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Utils
{
	static RequestSpecification request,request2;
	public RequestSpecification reqSpec() throws FileNotFoundException
	{
		if (request==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logger.txt"));
		request = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/").
				addFilter(RequestLoggingFilter.logRequestTo(log)).
				addFilter(ResponseLoggingFilter.logResponseTo(log)).
			build();
		return request;
		}
		return request;
	}
	public RequestSpecification reqSpecforAddproduct(String userId) throws FileNotFoundException
	{
				
		request2 = given().spec(reqSpec()).param("productName","Elephant").
		param("productAddedBy",userId).param("productCategory","Kids").
		param("productSubCategory","Toy").param("productPrice","30000").
		param("productDescription","Toys").param("productFor","Kids").
		multiPart("productImage",new File("C:\\Users\\SPURGE\\Desktop\\Toy.jpeg"));
		return request2;
	}
}
