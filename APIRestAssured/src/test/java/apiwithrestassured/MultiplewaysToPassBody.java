package apiwithrestassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.RestAssured;

public class MultiplewaysToPassBody {

	public static void passDataUsingMap(String uri, Map map) {

		RestAssured.baseURI = uri;

		String str = given().header("Content-Type", "application/json").body(map).when().post().then()
				.header("Content-Type", "application/json; charset=utf-8").log().all()
				.extract().response().asPrettyString();

		System.out.println(str);

	}

	public static void passDataUsingJsonObject(String uri, JSONObject jsonobj) {

		RestAssured.baseURI = uri;

		String str = given().log().all().header("Content-Type", "application/json").body(jsonobj.toString()).when()
				.post().then()
				.body("FirstName", equalTo("Gopi")).header("Content-Type", "application/json; charset=utf-8")
				.log().all()
				.extract().response().asPrettyString();
		System.out.println(str);
	}

	public static void passDataUsingexternalJSONfile(String url, File fi) throws FileNotFoundException {

		RestAssured.baseURI = url;

		FileReader fr = new FileReader(fi);

		JSONTokener jt = new JSONTokener(fr);

		JSONObject jo = new JSONObject(jt);

		String str = given().log().all().header("Content-Type", "application/json").body(jo.toString()).when().post()
				.then()
				.body("FirstName", equalTo("YashMant")).header("Content-Type", "application/json; charset=utf-8").log()
				.all()
				.extract().response().asPrettyString();
//		String str = jo.getString("name");
		System.out.println(str);
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.baseURI = "https://www.google.com";

		given().log().all().when().get().then().log().cookies();

//		System.out.println(map);
//		for (String str : map.keySet()) {
//
//			System.out.println(str + " : " + map.get(str));
//		}
		// File fi = new File("D:\\eclipse-workspace\\APIRestAssured\\students.json");

//		PersonPOJO p = new PersonPOJO();
//
//		p.setFirstName("kusumanchi");
//		p.setLastName("venkatesh");
//		p.setPhone("4569259");
//
//		p.setEmail("venktesh123@gmail.com");

//		String str = given().log().all().header("Content-Type", "application/json").body(p).when().post().then().log()
//				.all().body("firstName", equalTo("kusumanchi"))
//				.header("Content-Type", "application/json; charset=utf-8").log()
//				.all().extract().response().asPrettyString();
//
//		System.out.println(str);
		
		// passDataUsingMap(url, studentdata);
//		studentdata.put("name","Ramesh");
//		String str =
//		given().header("Content-Type","application/json")
//		.body(studentdata)
//		.when()
//		.post()
//		.then()
//		.body("name",equalTo("Ramesh"))
//						.header("Content-Type", "application/json; charset=utf-8").log().all().extract().response().asPrettyString();
//
//		JsonPath js = new JsonPath(str);
//		int id = js.get("id");
//		System.out.println(id);
	}

}
