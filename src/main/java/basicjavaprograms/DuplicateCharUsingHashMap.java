/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class DuplicateCharUsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AANNIL kumar yadav";

		char[] c = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : c) {

			if (map.get(ch) == null) {
 
				map.put(ch, 1);
			} else {

				map.put(ch, map.get(ch) + 1);
			}
		}

		
 
		List<Integer> values = new ArrayList<>(map.values());
		for ( Integer i:values) {
			if(i>1) {
				System.out.println(i);
			}
			
		}
		
		

	}

}
