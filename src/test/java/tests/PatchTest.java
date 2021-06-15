package tests;

import org.testng.annotations.Test;

import data.PatchData;

public class PatchTest extends TestBase {

	@Test
	public void patch() {
		new PatchData(ROOT_URI).getPreviousTimeStamp().makeReqBody().requestAndCompare();
	}
}
