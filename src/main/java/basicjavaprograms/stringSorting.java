/*
 * Apply toCharArray() method on input string to create a char array for input string.
   Use Arrays.sort(char c[]) method to sort char array.
   Use String class constructor to create a sorted string from char array.
*/
package basicjavaprograms;

import java.util.Arrays;

public class stringSorting {

	public static void main(String[] args) {
		String str = "linaqp";

		char[] chr = str.toCharArray();
 
		Arrays.sort(chr);
		System.out.println(new String(chr)); // String constructor accepts character array
 	}

}
