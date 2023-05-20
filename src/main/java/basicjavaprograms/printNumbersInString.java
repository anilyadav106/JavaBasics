package basicjavaprograms;

import java.awt.List;
import java.util.ArrayList;

public class printNumbersInString {

	// use character class

	public static void main(String[] args) {

		String s = "anilyadav106@gmail.com";
		char[] s1 = s.toCharArray(); 
		
		//store numbers only in a string and print

		String s2 = "";

		for (int i = 0; i < s1.length; i++) {

			if (Character.isDigit(s1[i])) {
				s2 = s2 + s1[i];

			}

		}
		System.out.println(s2);

	}

}
