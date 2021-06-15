package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.DeleteData;


public class DeleteTest extends TestBase{

	DeleteData deleteData;

	@Test
	public void verifyCode() {
		deleteData.reqAndVerifyDeleteCode();
	}

	@Test
	public void getCode() {
		int actual = deleteData.reqAndGetDeleteCode();
		Assert.assertEquals(actual, 204);
	}
	
	@BeforeMethod
	public void inst() {
		deleteData=new DeleteData(ROOT_URI);
	}

}
