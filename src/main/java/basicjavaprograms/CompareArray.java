/**
 * 
 */
package basicjavaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class CompareArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] str1 = { "a", "b", "c", "d" };
		String[] str2 = { "c", "d", "e" ,"a"};

		System.out.println(Arrays.equals(str1, str2));

		// give the common elements in both the arrays
		//use hashset wherever you want to have no duplicates in result set

		Set<String> set = new HashSet<>();

		for (String s : str1) {

			set.add(s);
		}
		Set<String> commonset = new HashSet<>();
		for (String s : str2) {

			if (set.contains(s))// if first set contains this element, means this is common,so add it in result
								// set

			{
				commonset.add(s);

			}
		}

		System.out.println("Common elements: " + commonset);

	}
}
