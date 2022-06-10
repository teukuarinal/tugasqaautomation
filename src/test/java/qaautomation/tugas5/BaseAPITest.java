package qaautomation.tugas5;

import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPITest {
	
	RequestSpecification registerJsonSpec;
	
	@BeforeMethod
	public void login() {
		
		Faker faker = new Faker();
		String name = faker.name().username();
		String fakerPasswordText = faker.letterify("????????????");
		String fakerPasswordNumber = faker.numerify("####");
		String fakerPhoneNumber = faker.numerify("##########");
		String username = "\"" + name + "\"";
		String email = "\"" + name + "@gmail.com" + "\"";
		String password = "\"" + fakerPasswordText + fakerPasswordNumber + "\"";
		String phonenumber = "\"" + "+628" + fakerPhoneNumber + "\"";
		
		String payload = "{" 
				+ "\"username\"" + ":" + username + "," 
				+ "\"password\"" + ":" + password + "," 
				+ "\"email\"" + ":" + email + "," 
				+ "\"phonenumber\"" + ":" + phonenumber 
				+ "}";
		
		registerJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
				.setContentType(ContentType.JSON).setBody(payload).build().log().all();
	}

}
