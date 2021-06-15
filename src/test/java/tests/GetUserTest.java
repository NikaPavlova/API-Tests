package tests;

import org.testng.annotations.Test;

import data.GetUser;

public class GetUserTest extends TestBase {

	@Test
	public void getUserById() {
		String expectedEmail = "janet.weaver@reqres.in";
		new GetUser().requestAndCompare(ROOT_URI, expectedEmail);
	}

}
