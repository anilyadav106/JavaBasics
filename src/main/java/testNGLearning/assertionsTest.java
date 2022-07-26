package testNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsTest extends baseTest {
	@Test
	public void assertTest() {

		String actual_title = "yahoo.com";
		String exp_title = "gmail.com";

		Assert.assertEquals(exp_title, actual_title); // high priority test
														// cases

		/*
		 * SoftAssert softassert = new SoftAssert(); // low priority test cases
		 * softassert.assertEquals(exp_title, actual_title); 
		 * softassert.all();
		 */

	}
}
