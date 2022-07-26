package basicjavaprograms;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class A {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("parent before method");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("parent after method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("parent before test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("parent after test");
  }
  
  @Test
  public void A1() {
	  System.out.println("parent test");
  }
  public class B extends A{
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("child before method");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("child after method");
	  }
	  
	  //child before and after test methods are ignored. Only parent one will be called.
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("child before test");
	  } 
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("child after test");
	  }
	 
	  @Test
	  public void t1() {
		  System.out.println("child test  1");
	  }
	  @Test
	  public void t2() {
		  System.out.println("child test  2");
	  }
	   
	  
  }

}
