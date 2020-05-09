package testNGLearning;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class forcefullySkipTest {

	@Test

	void skipTest() {
		if (1 == 2) {
			throw new SkipException("Skipping the test as condition is not met");
		} else {

			System.out.println("all good");
		}

	}
}
