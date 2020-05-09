package testNGLearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flowOfAnnotations extends baseTest {

	@BeforeTest
	public void CreateDBConnection() {

		System.out.println("Connecting to db...");

	}

	@AfterTest
	public void CloseDBConnection() {

		System.out.println("Closing db connection...");

	}

	@BeforeMethod

	public void launchBrowser() {

		System.out.println("Launching browser");
	}

	@AfterMethod

	public void CloseBrowser() {

		System.out.println("Closing browser");
	}

	@Test(priority = 0, groups = { "smoke", "functional" })

	public void doUserRegister() {

		System.out.println("test1");

	}

	@Test(priority = 1, dependsOnMethods = "doUserRegister", groups = { "smoke" })
	public void doLogin() {

		System.out.println("test2");
	}

	@Test(priority = 2, dependsOnMethods = "doLogin", groups = { "smoke" })
	public void doAddToCart() {

		System.out.println("test2");
	}

}
