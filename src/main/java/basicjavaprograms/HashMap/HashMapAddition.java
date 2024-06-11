package basicjavaprograms.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class HashMapAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');

		List<Character> list1 = new ArrayList();

		list1.add('a');
		list1.add('b');
		list1.add('d');

		System.out.println(list.retainAll(list1));
		System.out.println(list);

		StringBuilder sb = new StringBuilder("anil");
		System.out.println(sb.reverse());

		String s = "anilanilsddc a a ";

		char[] c = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (Character i : c) {

			if (map.get(i) == null) {

				map.put(i, 1);
			} else {

				map.put(i, map.get(i) + 1);
			}

		}

		System.out.println(map);

		for (Character cc : map.keySet()) {

			if (map.get(cc) > 1) {

				System.out.println(cc);

			}
		}

		// addition in hashmap
		Map<String, Integer> hm = new HashMap<>();

		hm.put("firstno", 12);

		hm.put("secondname", 13);

		int i1 = 0;
		for (String s1 : hm.keySet()) {

			i1 = i1 + hm.get(s1);
		}
		System.out.println(i1);

	}

}
