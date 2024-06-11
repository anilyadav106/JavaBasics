/**
 * 
 */
package basicjavaprograms.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class GetCommonElementsFrom2Lists {
	public static void main(String[] args) {
		//first create 2 lists
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list1.retainAll(list2);
 		System.out.println("list1 has common lements of : " +list1);
 		
 		
		System.out.println("******Retains common elements which are also in other list or removes which are not in other list  ***");
		LinkedHashSet<Integer> listA = new LinkedHashSet<Integer>();

		// Adding elements
		listA.add(99);
		listA.add(7);
		listA.add(0);
		listA.add(67);
		listA.add(89);

		LinkedHashSet<Integer> listB = new LinkedHashSet<Integer>();

		// Adding elements
		listB.add(99);
		listB.add(11);
		listB.add(0);
		listB.add(99);
		listB.add(76);

		listA.retainAll(listB); // this method is available in HashSet,TreeSet also
		System.out.println("listA has only common elements from listB :" + listA);
		
		
	
	}
}