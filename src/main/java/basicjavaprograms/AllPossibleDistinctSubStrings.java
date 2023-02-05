/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
		// TODO Auto-generated method stub

		String str = "abcd";

		Set<String> set = new HashSet<String>();
 
		for (int i = 0; i <= str.length(); i++) {

			for (int j = i + 1; j <=str.length(); j++) {

				set.add(str.substring(i, j));
				 
			}
		}
		System.out.println(set);
		System.out.println(set.size());
	 

	}

}
