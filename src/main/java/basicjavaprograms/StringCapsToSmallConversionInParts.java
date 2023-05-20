/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class StringCapsToSmallConversionInParts {

	/**
	 *W.a.P. for converting  'abcXYZ'  to 'ABCxyz'?
	 */
	public static void main(String[] args) {
		convertCaps("abcXYZ");
	}

	
	static void convertCaps(String str) {

		if (str.length() == 1) {

			System.out.println("Output is " + str);
		}

		String stnew = "";
		char[] c1 = str.toCharArray();

		for (int i = 0; i <= c1.length - 4; i++) {

			stnew = stnew + Character.toUpperCase(c1[i]);

		}

		for (int i = 3; i < c1.length ; i++) {

			stnew = stnew + Character.toLowerCase(c1[i]);

		}

		System.out.println(stnew);

	}

}
