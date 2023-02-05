/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class DuplicateCharactersUsingForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		  String s= "Welcome to coforge";
 
		  
		  Set<Character> set = new HashSet<Character>();
		  
		  
		  for ( int i=0;i< s.length();i++) {
			  
			  for( int j=i+1;j<s.length();j++) {
				  
				  if(s.charAt(i)==s.charAt(j)) {
					  
				 set.add(s.charAt(i) ); 
					  
				  } 
			  } 
		  }
		  System.out.println(set.size()); 
		  
	} 
}
