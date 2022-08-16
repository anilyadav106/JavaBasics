/**
 * 
 */
package basicjavaprograms;

import java.util.Arrays;

/**
 * @author anilkumar06
 *
 */
public class PalindromeStringUsingArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using array sorting  	
		
		
		String  s1="anil";
		String  s2="lina";
		
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		
		Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
		
		if( Arrays.equals(charArray1, charArray2)) {
			
			System.out.println("String is palindrome/anagram");
		} else
			System.out.println("String is NOT palindrome/anagram");	
			
		}

	}

 