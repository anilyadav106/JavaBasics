/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class ReverseWordsInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "Java is a programming language";

		System.out.println(reverseWords(str));

	}

	public static String reverseWords(String str) {

		String strTemp = "";

		String[] strArray = str.split(" ");

		for (String s : strArray) {
      //use SB because it can modify same string object
			StringBuffer strBUffer = new StringBuffer(s);
			strTemp = strTemp + strBUffer.reverse() + " ";

		}
		return strTemp;

	}
}
