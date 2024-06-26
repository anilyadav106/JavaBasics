/**
 * 
 */
package basicjavaprograms.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateCharUsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "adidas";

		char[] c = s.toCharArray();
 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : c) {

			if (map.get(ch) == null) {
 
				map.put(ch, 1);
			} 
		
			else {

				map.put(ch, map.get(ch) + 1);  	//map.get(ch) already has a value, keep adding 1
			}
		}

 	 // using keyset method
	Set<Character> set= map.keySet();
	//itearte and check when its value is >1 , that key has duplicate words
	for( Character s1: set) {
		if(map.get(s1)>1) {
			//System.out.println(map.get(s1));   // print only those values which are > 1 i.e duplicate characters
			System.out.println(s1 +" repeating " + map.get(s1) + " times");
		}	
		
	}
 
		 System.out.println(map.values());
 // print only those values which are > 1 i.e duplicate characters
		List<Integer> values = new ArrayList<>(map.values());
		for ( Integer i:values) {
			if(i>1) {
				 
				System.out.println(i);
			}
			
		}
		
		

	}

}
