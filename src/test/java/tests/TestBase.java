package tests;

import org.testng.annotations.BeforeMethod;

import configurations.LoadManager;

public class TestBase {

	protected String ROOT_URI;// = "https://reqres.in/";

	@BeforeMethod
	public void beforeMethod() {
		LoadManager manager = new LoadManager();
		manager.loadConfigurations();
		ROOT_URI = manager.baseUrl;
	}
}
