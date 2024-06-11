/**
 * 
 */
package basicjavaprograms.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class PalindromeAndRepeationTest {

	public static void main(String[] args) {
		System.out.println(PalindromeAndRepeationTest.isPalindrome("mam"));
		PalindromeAndRepeationTest.countChar("aanill") ;

	}

	
	 
	public static boolean isPalindrome(String str) {

		if (str == null) {

			return false;
		} else {

			StringBuffer sb = new StringBuffer(str);

			StringBuffer str1 = sb.reverse();

			return str1.equals(str);
		}

	}
 
	
	public static boolean isPalindrome1(String str) {
		
		
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			str1=str1+str.charAt(i);
			
		}
		return str1.equals(str);
		
	}
	
	public static void countChar(String str) {
		
		
	char c[]=	str.toCharArray();
		
		Map<Character,Integer> map= new HashMap<>();
		
		
		for (Character ch: c) {
			
			if(!map.containsKey(ch)) {
				
				map.put(ch,1);
			}else
				
			{
				
				map.put(ch, map.get(ch)+1);
			}
		}
		
		
		System.out.println(map);
		
		
		Set<Character> set =map.keySet();
		
		for(Character cchar: set) {
			
			if(map.get(cchar)>1) {
				
				System.out.println("Repeating character  " + cchar + " is times " + map.get(cchar));
			}
		}
		
		
	}

}
