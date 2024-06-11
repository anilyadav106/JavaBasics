/**
 * 
 */
package basicjavaprograms.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anilkumar06
 *
 */
public class NonrepeatedCharactersUsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "adidas";
 
	 
		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (Character c : ch) {

			if (map.get(c) == null) {

				map.put(c, 1);
			}

			else {
				map.put(c, map.get(c) + 1);

			}
		}
		
		// now iterate through this newly created map and where value is 1 is
				// non-repeating character
		//way 1
		for ( Character s: map.keySet()) {
			
			if(map.get(s)==1) {
				
				System.out.println(s);
			}
		}

		// now iterate through this newly created map and where value is 1 is
				// non-repeating character
		//way 2
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
			}

		}

	}
}
