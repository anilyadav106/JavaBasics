/**
 * 
 */
package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author anilkumar06
 *
 */
public class assertDemo {

	@Test

	public static void AHardAssertion() {
		System.out.println("test started1");

		Assert.assertEquals(1, 13);

		System.out.println("test ended1"); // this line will not be executed in hard assert, Next method will be executed

	}

	@Test

	public static void BSoftAssert() {
		System.out.println("test started2");
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(12, 13);

		System.out.println("test ended2");
		 asrt.assertAll(); // always last statement, else its above statements
		// would not be executed.
	}


	@Test

	public static void CSoftAssert2() {
		System.out.println("test started3");
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(9, 13);

		System.out.println("test ended3");
		 asrt.assertAll(); // always last statement, else its above statements
		// would not be executed.
	}

}
