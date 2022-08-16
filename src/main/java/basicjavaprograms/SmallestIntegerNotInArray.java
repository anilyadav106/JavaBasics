/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author anilkumar06
 *
 */
public class SmallestIntegerNotInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] test = { -1,1, 2,  6, -8, 5 };

		System.out.println(SmallestIntegerNotInArray.solution(test));

	}

	public static int solution(int[] arr) {

		int smallestInt = 1;

		if (arr.length == 0)
			return smallestInt;

		Arrays.sort(arr);
		
	 
		for(int a: arr) {
		 System.out.println(a);
		}

		if (arr[0] > 1)
			return smallestInt;
		
	 	System.out.println("last no is " + arr[arr.length - 1]);
		/* if all elements are negative even after sorting then smallest will be 1 */
		if (arr[arr.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;
	}

}
