package tests;

import org.testng.annotations.Test;

import data.PostLoginData;

public class PostLogin extends TestBase {

	@Test
	public void token() {
		new PostLoginData(ROOT_URI).makeReqBody().requestAndCompareToken();
	}

}
