/**
 * 
 */
package basicjavaprograms;
 

import java.util.LinkedHashSet;
import java.util.Set;

public class removeTraillingLeadingZeros {

	public static void main(String[] args) {

	
		System.out.println(removeLeadingCharacters( "aaanila")); // nila
		System.out.println(removeTrailingCharacters("acataa")); //acat
		System.out.println(removeTrailingChars1( "aacataa")); //aacat
		System.out.println(removeLeadingChars1( "aacat ")); //cat
		
		System.out.println(removeTraillingChars("anilaaa"));  // anil

	}

	public static String removeTraillingChars(String str) {

		char[] ch = str.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();

		for (Character c : ch) {

			set.add(c);
		}
		
	//System.out.println(set);

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
	
	
	// on same string , perform deleting first character till its A
	public static	String removeLeadingCharacters(String s) {
	    StringBuilder sb = new StringBuilder(s);
	    while (sb.length() > 0 && sb.charAt(0) == 'a') {
	        sb.deleteCharAt(0);
	      
	    }
	    return sb.toString();
	}
	
	//shortest
	// cucumber step defination also has these regex symbols
	// ^ start of string, $ end of string
	
	public static String removeTrailingChars1(String s) {
		String s1=s.toLowerCase();
	    return s1.replaceAll("a+$", "");   // $ means end of string, + means:-The quantifiers specify the number of occurrences of a character.
	}
	public static String removeLeadingChars1(String s) {
		String s1=s.toLowerCase();
	    return s1.replaceAll("^a+", "");  // ^ means start of string,+ means:-The quantifiers specify the number of occurrences of a character.
	}
}
