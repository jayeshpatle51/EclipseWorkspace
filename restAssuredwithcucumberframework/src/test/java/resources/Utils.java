package resources;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils
{
	static RequestSpecification request,req2;

	public RequestSpecification reqSpec(String baseUri) throws IOException
	{
		if(request==null){
			PrintStream stream1 = new PrintStream(new File("Logger.txt"));
		
		
			request = new RequestSpecBuilder().setBaseUri(baseUri)
				.addFilter(RequestLoggingFilter.logRequestTo(stream1))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream1))
				.build();
		}
		return request;
	}

	public RequestSpecification specificreq(String userId, ContentType cont, Object obj) throws IOException
	{
		
		req2 = given().spec(reqSpec("")).contentType(cont).body(obj);
		return req2;
	}

}
