package apiwithrestassured;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class LibraryAPI {

	static String id = "";

	public static void addBook() {

		String str = given().header("Content-Type", "application/json")
				.body("{\r\n" + "\r\n" + "\"name\":\"Learn Appium Automation with Java\",\r\n" + "\"isbn\":\"bcd\",\r\n"
						+ "\"aisle\":\"227\",\r\n" + "\"author\":\"John foe\"\r\n" + "}\r\n" + "")
				.when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response()
				.asPrettyString();

		System.out.println(str);
	}

	public static void getBook() {

		String str = given().queryParam("AuthorName", "John foe").when().get("/Library/GetBook.php").then().extract()
				.response().asPrettyString();
		System.out.println(str);
	}

//	public static void updateBook() {
//		
//		given().header("Content-Type","application/json")
//		.body("")
//		
//	}
	public static void deleteBook() {

		String str = given().header("Content-Type", "application/json")
				.body("{\r\n" + " \r\n" + "\"ID\" : \"" + id + "\"\r\n" + " \r\n" + "} \r\n" + "").when()
				.delete("/Library/DeleteBook.php").then().extract().response().asPrettyString();
		System.out.println(str);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		// addBook();
		System.out.println("*****************************************");
		getBook();
	}

}
