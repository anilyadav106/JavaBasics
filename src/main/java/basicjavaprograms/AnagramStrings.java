/**
 * 
 */
package basicjavaprograms;

import java.util.Arrays;

/**
 * @author anilkumar06
 *
 */
public class AnagramStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isAnagram("anil", "anil");

	}

	public static void isAnagram(String s1, String s2) {
		Boolean state = false;
		String str1 = s1.trim();
		String str2 = s2.trim();

		if (str1.length() != str2.length()) {

			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
		else {
		char str1Char[] = str1.toLowerCase().toCharArray();
		char str2Char[] = str2.toLowerCase().toCharArray();

		Arrays.sort(str1Char);
		Arrays.sort(str2Char);

		state = Arrays.equals(str1Char, str2Char);

		if (state) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
		}
	}

}
