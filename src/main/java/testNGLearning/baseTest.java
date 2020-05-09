package testNGLearning;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class baseTest {

	@BeforeSuite
	public void setup() {

		System.out.println("Initializing everything !!!");

	}

	@AfterSuite
	public void teadDown() {

		System.out.println("Quitting everything !!!");
	}

}
