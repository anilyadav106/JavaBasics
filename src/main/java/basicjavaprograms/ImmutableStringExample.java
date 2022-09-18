/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class ImmutableStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "code";

		System.out.println(a.hashCode());

		/*
		 * a new literal is created in SCP and "a" now refer to a+"decode" object
		 * earlier a reference is now lost. Earlier code is now not referred by any
		 * variable
		 */

		// now try to modify the string
		a = a + "decode";

		System.out.println(a.hashCode());
		/*
		 * since both hashcodes are different, that means earlier created literal still
		 * exists without any modification and that is why string is immutable
		 */

	}

}
