package basicjavaprograms;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateNoInArrayUsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 1, 4, 6, 7, 7, 8, 9, 0, 9 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : array) {
			// if unable to add in set , add method returns false. Only unique element are
			// added in set
			if (!map.containsKey(i)) {

				map.put(i, 1);
			} else {

				map.put(i, map.get(i) + 1);
			}

		}
		
		
		System.out.println(map);
	for (Integer x:	map.keySet()) {
		
		
		if(map.get(x)>1) {
			
			System.out.println("duplicate element founded is " + x);
		}
	}
	}

}
