package apiwithrestassured;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.path.json.JsonPath;

public class AddPlace {

	// RestAssured.baseURI = "https://rahulshettyacademy.com";
	static String placeid = "";
	public static void main(String[] args) {

		given().when().get(
				"https://rahulshettyacademy.com/maps/api/place/get/json?place_id=4559ac93805c4a29935dc5972cd155c1&key=qaclick123")
				.

				then().statusCode(200).body("name", equalTo("Jayesh house")).log().all();

//		RestAssured.baseURI = "https://rahulshettyacademy.com";
//		addPlace();
//		System.out.println("*****************************************");
//		getPlace();

//		System.out.println("*****************************************");
//		putPlace();
//		System.out.println("*****************************************");
//
//		getPlace();
//		System.out.println("*****************************************");
//		deletePlace();
//		System.out.println("*****************************************");
//		getPlace();
	}

	public static void addPlace() {

		String str = given().header("Content-Type", "application/json").queryParam("key", "qaclick123")
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Jayesh house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}\r\n"
						+ "")
				.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().response()
				.asPrettyString();

		System.out.println(str);

		JsonPath js = new JsonPath(str);
		placeid = js.getString("place_id");
		System.out.println(placeid);
	}

	public static void getPlace() {

		String getstring = given().queryParam("key", "qaclick123").queryParam("place_id", placeid).when()
				.get("/maps/api/place/get/json").then().extract().response().asPrettyString();

		System.out.println(getstring);
	}

	public static void putPlace() {

		String address = given().header("Content-Type", "application/json").queryParam("key", "qaclick123")
				.body("{\r\n" + "\"place_id\":\"" + placeid + "\",\r\n" + "\"address\":\"Gondia, Maharashtra\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("/maps/api/place/update/json").then().extract().response().asPrettyString();
		System.out.println(address);
	}

	public static void deletePlace() {

		String delete = given().header("Content-Type", "application/json").queryParam("key", "qaclick123")
				.body("{\r\n" + "\"place_id\":\"" + placeid + "\"\r\n" + "}\r\n" + "").when()
				.delete("/maps/api/place/delete/json").then().extract().response().asPrettyString();
		System.out.println(delete);
	}
}
