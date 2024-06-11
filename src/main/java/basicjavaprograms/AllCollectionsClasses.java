/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author anilkumar06
 *
 */
public class AllCollectionsClasses {

	/**
	 * @param args
	 * Iterable is the parent Interface of all and has only 1 method-iterator()
	 * Collections is a class
	 * Collection is an Interface
	 */
	public static void main(String[] args) {

		System.out.println("********List **********");
		/*
		 * maintains insertion order- means while retrieving you get in same order in
		 * order of inserting ,no default sorting, contains duplicate elements,
		 * can contains nulls also
		 */
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(44);
		list.add(6);
		list.add(8);
		list.add(null);
		list.add(null);
		System.out.println("list is :"+list);
		
		System.out.println("********LinkedList **********");
		
		/*
		 * Yes, both ArrayList and LinkedList in Java maintain the insertion order of
		 * elements. This means that elements are stored and retrieved in the order they
		 * were added.
		 */		
		
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("d");
		list1.add("c");
		System.out.println(list1);

		/* There is no sorted list, instead we can use  Collections.sort(list);
		 * 
		 *  Because we assume that list will always give us result based on index, if index is changed due to sorting, we loose that confidence*/
		
		/* There is no TreeList class to have sorted items
		 * List<Object> list1 = new TreeList<>(); list1.add("a"); list1.add("b");
		 * list1.add("d"); list1.add("c"); System.out.println(list1);
		 */
		 
		System.out.println("********Set **********");
		/*
		 * Doesn't maintains insertion order- means while retrieving you get in random order  
		 * - no default sorting
		 * can not contains duplicate elements
		 * can contains nulls also but not duplicate nulls
		 */
		
		/* does not maintains insertion order while checking duplicates */
		Set<Object> set = new HashSet<>();
		set.add("anil");
		set.add("anil");
		set.add("3");
		set.add("2");
		set.add("1");
		set.add("2");
		set.add('c');
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println("********LinkedHashSet **********");
		/* maintains insertion order while checking no duplicates also*/
		Set<Object> set1 = new LinkedHashSet<>();
		set1.add("anil");
		set1.add("anil");
		set1.add("3");
		set1.add("2");
		set1.add("1");
		set1.add("2");
		set1.add('c');
		set1.add(null);
		set1.add(null);
		System.out.println("LinkedHashSet is:" +set1);
		
		System.out.println("********TreeSet **********");
		/* sorted while checking duplicates 
		 * can not have nulls -because null can not be sorted*/
		Set<Object> set2 = new TreeSet<>();
		set2.add("anil");
		set2.add("anil");
		set2.add("3");
		set2.add("2");
		set2.add("1");
		set2.add("2");  
	//	set2.add(null);  // it will give null pointer exception
		System.out.println("TreeSet is " +set2);
		
		System.out.println("********Map **********");
		
		/*HashMap is non-synchronized as compared to its legacy HashTable
		 * means multiple threads can access the same map object at the same time
		 * Hashmap is faster than HashTable
		 * no sorting of keys 	
		 * -Doesn't maintains insertion order- object returns are in random order	 * 
		 * -can have   multiple null keys but previous one is overridden by latest-so only 1 exists in result set
		 * -can have multiple null values
		 */
		Map<Object, Object> map = new HashMap<>();
		map.put("state", "harayana");
		map.put("state", "delhi");
		map.put("id", 1);
		map.put("rollno", 22);
		map.put("section", 'A');
		map.put("city", "Gurugram");
		map.put("rank", 233);
		map.put("classrank", 17);
		map.put("isMonitor", true);
		map.put(null, 1);
		map.put(null, 2);
	
		System.out.println("Map is:" +map);
		
	 
	
		/* Maintains insertion order */
		Map<Object, Object> map1 = new LinkedHashMap<>();
		map1.put("name", "anil");
		map1.put("state", "haryana");
		map1.put("id", 1);
		map1.put("rollno", 22);
		map1.put("section", 'A');
		map1.put("city", "Gurugram");
		map1.put("rank", 233);
		map1.put("classrank", 17);
		map1.put("isMonitor", true);
		map1.put(null, 1);
		map1.put(null, 2);
		System.out.println("Linked hashmap is:"+ map1);
		
	
		
		/* sorted order of keys in result set*
		 * can not have null keys-nulls can not be sorted*/
		Map<Object, Object> map2 = new TreeMap<>();
		map2.put("state", "harayana");
		map2.put("id", 1);
		map2.put("rollno", 22);
		map2.put("section", 'A');
		map2.put("city", "Gurugram");
		map2.put("rank", 233);
		map2.put("classrank", 17);
		map2.put("isMonitor", true);
		 
		System.out.println("TreeMap is: "+map2);
		
		
		System.out.println("**** Collections class important methods****");
		
		Collections.shuffle(list1);
		System.out.println("shuffled list is :" +list1);
		
		/* sort in natural ascedning order */
		Collections.sort(list1);
		System.out.println("sorted list is :"+list1);
		
		/* sort in descending order */
		Collections.sort(list1,Comparator.reverseOrder());
		System.out.println("descending list is:" +list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(44);
		list2.add(6);
		list2.add(8); 
		list2.add(8);  

		/* max value of collection */
		System.out.println(Collections.max(list2));
		 /* swap  a collection value */
		 Collections.swap(list2, 1,2);   // 11,6,44,8,8
		 System.out.println(list2);
		 /* reverse a collection */
		 Collections.reverse(list2) ;	
		 System.out.println(list2);
		 
			/* the no of times 8 is persent in the list2 */
	   System.out.println( "Repeating no in the collection is:" +Collections.frequency(list2, 8));
	 
		 
	}

}
