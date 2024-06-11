package testNGLearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
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
	
	@BeforeClass
	public void teadDown1() {

		System.out.println("Before class !!!");
	}
	@AfterClass
	public void teadDown2() {

		System.out.println("After class !!!");
	}


}
