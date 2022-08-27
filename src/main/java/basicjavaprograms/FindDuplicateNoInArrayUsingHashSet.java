package basicjavaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateNoInArrayUsingHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 5, 6, 7, 7, 8, 9, 0, 9 };

		Set<Integer> set = new HashSet<>();

		for (int i : array) {
			// if unable to add in set , add method returns false. Only unique element are
			// added in set
			if (!set.add(i)) {

				System.out.println("duplicate element founded   " + i);
			}

		}
	}

}
