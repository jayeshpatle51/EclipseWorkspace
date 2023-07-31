package apiwithrestassured;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class EndToEndEcommerceAPI {
	static String token = "";
	static String userId = "";
	static String productId = "64588d67568c3e9fb1667037";

	static RequestSpecification reqspecfication;

	// Register Page =https://rahulshettyacademy.com/client
	public static RequestSpecification reqspecificationOb() {
		reqspecfication = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();

		return reqspecfication;
	}
	public static void loginRequest() {
//		String str = given().header("Content-Type", "application/json")
//				.body("{\r\n" + "    \"userEmail\": \"jayesh@gmail.com\",\r\n"
//						+ "    \"userPassword\": \"Jayesh123#\"\r\n" + "}")
//				.when().post("/api/ecom/auth/login").then().extract().response().asPrettyString();

		String str = given().spec(reqspecificationOb()).body("{\r\n" + "    \"userEmail\": \"jayesh@gmail.com\",\r\n"
						+ "    \"userPassword\": \"Jayesh123#\"\r\n" + "}")
				.when().post("/api/ecom/auth/login").then().extract().response().asPrettyString();
		JsonPath js = new JsonPath(str);
		token = js.getString("token");
		userId = js.getString("userId");
		System.out.println(token);
		System.out.println(userId);
	}

	public static void createProduct() {

		String str = given().header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>")
				.header("Authorization", token).multiPart("productName", "qwerty")
				.multiPart("productAddedBy", "6454a713568c3e9fb16442f2").multiPart("productCategory", "fashion")
				.multiPart("productSubCategory", "shirts").multiPart("productPrice", "11500")
				.multiPart("productDescription", "Addias Originals").multiPart("productFor", "women")
				.multiPart("productImage", new File("C:\\Users\\SPURGE\\Downloads\\downloadcar.jpg")).when()
				.post("/api/ecom/product/add-product")
				.then().extract().response().asPrettyString();

		JsonPath js = new JsonPath(str);
		productId = js.getString("productId");
		System.out.println(str);

	}

	public static void createOrder() {
		String str = given().header("Content-Type", "application/json").header("Authorization", token)
				.body("{\r\n" + "    \"orders\": [\r\n" + "        {\r\n" + "            \"country\": \"India\",\r\n"
						+ "            \"productOrderedId\": \"" + productId + "\"\r\n" + "        }\r\n" + "    ]\r\n"
						+ "}")
				.when().post("/api/ecom/order/create-order").then().extract().response().asPrettyString();
		System.out.println(str);
	}

	public static void deleteProduct() {

		String str = given().header("Authorization", token).when()
				.delete("/api/ecom/product/delete-product/" + productId).then().extract().response().asPrettyString();

		System.out.println(str);
	}

	public static String getAllProductPayload() {
		return "{\r\n" + "  \"productName\": \"\",\r\n" + "  \"minPrice\": null,\r\n" + "  \"maxPrice\": null,\r\n"
				+ "  \"productCategory\": [],\r\n" + "  \"productSubCategory\": [],\r\n" + "  \"productFor\": []\r\n"
				+ "}";
	}
	public static void getAllProduct() {

		String str = given().header("Authorization", token).header("Content-Type", "application/json")
				.body(getAllProductPayload()).when().post("/api/ecom/product/get-all-products").then()
				.extract().response().asPrettyString();

		System.out.println(str);
	}

	public static void getOrderDetails() {
	}

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";


		loginRequest();
		// getAllProduct();

//		createProduct();
//		deleteProduct();
	}

}
