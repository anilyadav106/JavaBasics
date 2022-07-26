/**
 * 
 */
package basicjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author anilkumar06
 *
 */
public class CountDuplicateWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 	String s = "I am anil anil kumar yadav yadav";

		String[] sarray = s.split(" ");

		Map<String, Integer> map = new HashMap();

		for (String s1 : sarray) {
			///intitially the map is empty and has null keys
			if (map.get(s1) == null) {
//put the first element I and set its value as 1
				map.put(s1, 1);
			}

			else {
//when the value of key already exist, update the key's value to +1
				map.put(s1, map.get(s1) + 1);
			}

		}
//now updated map
		System.out.println(map);

	}
}
