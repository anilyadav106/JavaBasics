package testNGLearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flowOfAnnotations extends baseTest {

	@BeforeTest
	public void CreateDBConnection() {

		System.out.println("Before Test...");

	}

	@AfterTest
	public void CloseDBConnection() {

		System.out.println("After Test...");

	}

	@BeforeMethod

	public void launchBrowser() {

		System.out.println(" Before method-Launching browser");
	}

	@AfterMethod(enabled = true,alwaysRun = true)

	public void CloseBrowser() {

		System.out.println("After method-Closing browser");
	}

	@Test(priority = 0, groups = { "smoke", "functional" })

	public void doUserRegister() {

		System.out.println(" Test-test1");
		

	}

	@Test(priority = 1, dependsOnMethods = "doUserRegister", groups = { "smoke" })
	public void doLogin() {

		System.out.println(" Test-test2");
	}

	@Test(priority = 2, dependsOnMethods = "doLogin", groups = { "smoke" })
	public void doAddToCart() {

		System.out.println("Test-test3");
	}

}
