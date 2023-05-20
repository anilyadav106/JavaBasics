/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class arrayPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 7, 8, 2, 3, 1, 10, 9 };
		int i = arr.length;
		System.out.println(i);

		// sorts only 7,8,2 in ascending order
		Arrays.sort(arr, 2, 5);
		
		System.out.println(Arrays.toString(arr));

		String s1 = "Hello World";
		String s2 = "Hello World";

		String s3 = new String("Hello World");
		// to compare object memory,does the reference variables points to the same m/m location
		System.out.println(s1 == s3);
		//to compare object content
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2); // s1 and s2 refers to same memory location of -862545276

		int[] al = new int[5];
		al[0] = 15;
		al[1] = 13;
		al[2] = 14;

		Arrays.sort(al);
		for (Integer a : al) {
			System.out.println(a);

		}

		
		
		

	}}