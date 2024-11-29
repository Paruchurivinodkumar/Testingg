package apitestingpractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Apipra {
     @Test
	public void vin() {
		given()
		.when()
		.get(" https://automationexercise.com/api/productsList")
		.then()
		.statusCode(405);
	}
}
