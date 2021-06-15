package tests;

import org.testng.annotations.Test;

import data.Put;

public class PutTest extends TestBase {

	@Test
	public void put() {
		new Put(ROOT_URI).getPreviousTimeStamp().reqBody().requestAndCompare();
	}
}