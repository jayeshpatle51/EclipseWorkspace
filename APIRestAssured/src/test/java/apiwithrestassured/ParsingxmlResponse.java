package apiwithrestassured;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParsingxmlResponse {

	@Test(enabled = false)
	public void getResponse() {
		Response res = given().get("http://restapi.adequateshop.com/api/Traveler?page=1");

		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");

		String pageno = res.xmlPath().get("TravelerinformationResponse.page").toString();

		Assert.assertEquals(pageno, 1);

	}

	@Test
	public void getXmlPath() {

		Response res = given().get("http://restapi.adequateshop.com/api/Traveler?page=1");

		XmlPath xml = new XmlPath(res.asPrettyString());

		List<String> travellers = xml.getList("TravelerinformationResponse.travelers.Travelerinformation.name");

		Assert.assertEquals(travellers.size(), 10);
		boolean b = false;
		for (String str : travellers) {
			if (str.equals("Developer")) {
				b = true;
				break;
			}
		}

		Assert.assertEquals(b, true);
	}

}
