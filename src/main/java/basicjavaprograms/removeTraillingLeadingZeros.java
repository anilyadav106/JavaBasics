/**
 * 
 */
package basicjavaprograms;
 

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeTraillingLeadingZeros {

	public static void main(String[] args) {

		System.out.println(removeTraillingA("cataa"));
		System.out.println(removeTrailingCharacters("cataa"));

	}

	public static String removeTraillingA(String str) {

		char[] ch = str.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();

		for (Character c : ch) {

			set.add(c);
		}
		
	System.out.println(set);

		String str1 = "";
		for (Character s : set) {

			str1=str1+s;
		}

		return str1;

	}
	
	

	public static  String removeTrailingCharacters(String s) {
		
	    StringBuilder sb = new StringBuilder(s);
	    
	    while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 'a') {
	        sb.setLength(sb.length() - 1);
	    }
	    return sb.toString();
	}

}
