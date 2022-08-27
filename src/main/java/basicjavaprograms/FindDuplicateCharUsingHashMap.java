/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
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

		String s = "AAaNNIL";

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


	for (Map.Entry<Character, Integer> set:map.entrySet()) {
			
			if(set.getValue()>1) {
				
				System.out.println(set.getKey()+ " repeating " +set.getValue() + " times" );
			}
			
			 
		}
	 
	
		 
		 
 // print only those values which are > 1 i.e duplicate characters
		List<Integer> values = new ArrayList<>(map.values());
		for ( Integer i:values) {
			if(i>1) {
				 
				System.out.println(i);
			}
			
		}
		
		

	}

}
