/**
 * 
 */
package crowe;
 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class A {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("A1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("A2");
  }
  
  @Test
  public String t1() { 
	  System.out.println("t1");
	  return "anil";
	 }
  public class B extends A{
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("B1");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("B2");
		
	  }
	  
	  
		/*
		 * @Test public void t1() { System.out.println("t1");
		 * 
		 * 
		 * }
		 * 
		 * @Test public void t2() { System.out.println("t2"); }
		 */
	  
  }

}
