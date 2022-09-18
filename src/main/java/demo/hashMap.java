package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class hashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // key
																		// value
																		// pair
																		// storage
		hm.put("RollNo1", 111);
		hm.put("RollNo2", 123);
		hm.put("RollNo3", 133);
		hm.put("RollNo3", 134);
	

		System.out.println("The map is:" + hm);
		System.out.println("The size of map is:" + hm.size()); // 3
		System.out.println("Is the map empty? : " + hm.isEmpty());
		/* return the latest value of duplicate key */
		System.out.println("The value of a specific key is:" + hm.get("RollNo3"));
		/* you have to remove basis key, as there is no indexing in hashmap */
		hm.remove("RollNo2");

		System.out.println("Is there any key named:test " + hm.containsKey("test"));
		System.out.println("Is there any value named:999 " + hm.containsValue(999));
		System.out.println("**** Converting  map elements to a Set ******");
		Set<Entry<String, Integer>> mySet = hm.entrySet();
		System.out.println("Set elements from Map are :" + mySet);

		System.out.println("**** Iterating map elements******");

		Iterator<Entry<String, Integer>> itr = mySet.iterator();

		while (itr.hasNext()) {

			Map.Entry me = itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());

		}
		/*
		 * how to create a sub tree map basis key value
		 */

		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

		// Put elements to the map
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(60, "White");
		tree_map.put(50, "Pink");
		System.out.println("Orginal TreeMap content: " + tree_map);
		/* false means not inclusive of 20 no key */
		System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));
		/* true means inclusive of 20 and 4o keys key */
		SortedMap<Integer, String> sub_tree_map = new TreeMap<Integer, String>();
		sub_tree_map = tree_map.subMap(20, true, 40, true);
		// sub_tree_map = tree_map.subMap(20, 40);
		System.out.println("sub tree is :" + sub_tree_map);
		/* how to create a set out of unique Keys out from a map. */
		TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>();

		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());
	}

}
