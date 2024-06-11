/**
 * 
 */
package basicjavaprograms;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class AllPossibleDistinctSubStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "abcd";

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) { // go till end of list length coz substring(i, j) generates a
															// substring starting from index i and ending at index j-1,
															// so doesnt consider last letter

				set.add(str.substring(i, j));

			}
		}
		System.out.println(set);
		System.out.println(set.size());

	}

}
