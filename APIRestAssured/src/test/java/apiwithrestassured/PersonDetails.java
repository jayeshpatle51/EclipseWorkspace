package apiwithrestassured;

import static io.restassured.RestAssured.given;

public class PersonDetails {

	public static void postDetails() {

		String res = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"FirstName\" : \"Suresh\",\r\n" + "    \"LastName\" : \"Anand\",\r\n"
						+ "    \"Email\" : \"suresh123@gmail.com\",\r\n" + "    \"Phone\" : \"8765856837\"\r\n" + "}")
				.when().post("http://localhost:3000/PersonDetails").then().extract().response().asPrettyString();

		System.out.println(res);
		// String js = res.jsonPath().get("LastName[1]").toString();
		// System.out.println(js);
	}

	public static void main(String[] args) {

		// RestAssured.baseURI = "http://localhost:3000/PersonDetails";
//		Response res = given().when().get();
//		String js = res.jsonPath().get("LastName[1]").toString();
//		System.out.println(js);

		postDetails();
//		Map<String, String> map = res.cookies();
//
//		for (String str : map.keySet()) {
//			System.out.println(str + " == " + map.get(str));
//		}

//		Interperabolity
//		Complience
//		Penetration
//		Fuzz testing

	}

}
