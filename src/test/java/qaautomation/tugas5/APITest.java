package qaautomation.tugas5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITest extends BaseAPITest {

	@Test
	public void registerAPI() {
		Response responseRegister = given().spec(registerJsonSpec).post("/register");
		
		assertEquals(responseRegister.statusCode(), 201);
	}
	
	@Test
	public void registerAPI1() {
		Response responseRegister = given().spec(registerJsonSpec).post("/register");
		
		assertEquals(responseRegister.statusCode(), 201);
	}
	
	@Test
	public void registerAPI2() {
		Response responseRegister = given().spec(registerJsonSpec).post("/register");
		
		assertEquals(responseRegister.statusCode(), 201);
	}
	
	@Test
	public void registerAPI3() {
		Response responseRegister = given().spec(registerJsonSpec).post("/register");
		
		assertEquals(responseRegister.statusCode(), 201);
	}
}
