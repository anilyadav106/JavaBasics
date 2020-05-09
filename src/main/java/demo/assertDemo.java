/**
 * 
 */
package demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author anilkumar06
 *
 */
public class assertDemo {

	@Test

	public static void assertDemo1() {
		System.out.println("test started");
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(12, 13);
		System.out.println("test ended");
		asrt.assertAll(); // always last statement, else its above statements
							// would not be executed.
	}

}
