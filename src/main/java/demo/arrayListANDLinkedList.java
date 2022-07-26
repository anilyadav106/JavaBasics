/**
 * 
 */
package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author anilkumar06
 *
 */
public class arrayListANDLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> obj1 = new ArrayList<String>();

		/* addition and removal methods return true */

		obj1.add("Selenuim webdriver");
		obj1.add("Chrome");
		obj1.add("Extent");
		obj1.add("Automation");
		obj1.add("Java");
		obj1.add("Extent");

		System.out.println("Size of arrayList :" + obj1.size());
		System.out.println("Items in list are :" + obj1);
		System.out.println("last index of duplicate item Extent is " + obj1.lastIndexOf("Extent"));
		System.out.println("Index of item which doesnt exists is -1 ? : " + obj1.indexOf("QTP"));
                
		System.out.println("Fetching item :" + obj1.get(1));
		System.out.println("Does list contains items 'Java' :" + obj1.contains("Java"));

		/*
		 * If there are duplicate elements present in the list and user wants to remove the same,
		 *  it removes the * first occurrence of the specified element from the list.
		 */

		obj1.remove("Extent");
		System.out.println("Size of arrayList after removale of duplicate element is :" + obj1.size());

		System.out.println("*********For each loop************");

		for (Object arrobj : obj1) {
			System.out.println("Array list items are " + arrobj);
		}
		System.out.println("**********Iterator***********");

		Iterator<String> itr = obj1.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next(); // picks up next value i.e at index 0.
			System.out.println("Array list values are " + obj);

		}

		System.out.println("index is :" + obj1.indexOf("Chrome"));
		/*
		 * Here fromIndex is inclusive and toIndex is exclusive. 0,1 and 2 index
		 * values will make up a new list)
		 */
		System.out.println("Sublist is : " + obj1.subList(0, 3));

		System.out.println("**********Reversing of list***********");
		Collections.reverse(obj1); // to reverse items
		System.out.println("Reveresed ordered Items in list are :" + obj1);

		System.out.println("**********Ascending Sorting***********");
		
        Collections.sort(obj1); // to sort items
		System.out.println("Ascending ordered Items in list are :" + obj1);

		System.out.println("**********Descending Sorting***********");

		Collections.sort(obj1); // to first sort items
		Collections.reverse((obj1)); // than just reverse the sorted
										// collection

		System.out.println("Descending ordered Items in list are :" + obj1);

		System.out.println("Clearing the list   ");
		obj1.clear();
		System.out.println("Size of arrayList after clear :" + obj1.size());

		System.out.println("------------Adding or Appending items of an existing list into arratList in a single go");

		ArrayList<String> al = new ArrayList<String>();

		/* Adding elements to the ArrayList */
		al.add("Text 1");
		al.add("Text 2");
		al.add("Text 3");

		System.out.println("ArrayList Elements are: " + al);

		/* Adding elements to a List */
		List<String> list = new ArrayList<String>();
		list.add("Text 4");
		list.add("Text 5");
		list.add("Text 6");

		/* Adding all elements of list to ArrayList in the end using addAll */
		al.addAll(list);

		System.out.println("Updated ArrayList in the end is: " + al);

		System.out
				.println("--------- Adding all elements of list to ArrayList from a specified index using addAll-----");
		al.addAll(2, list);

		System.out.println("Updated ArrayList using index is  " + al);

		System.out.println("*******swapping elements in list**********");
		List<Object> li = new ArrayList<Object>();
		li.add(2);
		li.add(3);
		li.add(4);

		System.out.println("List before swap :" + li);

		Collections.swap(li, 0, 1);
		System.out.println("List after swap :" + li);

		System.out.println("*********How to combine 2 array list in one array list***********");

		// First ArrayList
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("AL1: E1");
		arraylist1.add("AL1: E2");
		arraylist1.add("AL1: E3");

		// Second ArrayList
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("AL2: E1");
		arraylist2.add("AL2: E2");
		arraylist2.add("AL2: E3");

		// New ArrayList
		ArrayList<String> al1 = new ArrayList<String>();

		al1.addAll(arraylist1);
		al1.addAll(arraylist2);

		// Displaying elements of the joined ArrayList
		for (String temp : al1) {
			System.out.println("combined array elements are :" + temp);
		}

		System.out.println(
				"*****converting arrayList to set OR how to remove duplicate list items  converting it to set");
		ArrayList<String> listDuplicate = new ArrayList<String>();

		listDuplicate.add("Extent");
		listDuplicate.add("Automation");
		listDuplicate.add("Extent");

		Set<String> obj2 = new HashSet<String>(listDuplicate);

		System.out.println("New set having no duplicate values :" + obj2);

		System.out.println(
				"******can we define arraylist size also, and how to trim the size to current list size to save m/m");

		ArrayList<String> al12 = new ArrayList<String>(50);

		al12.addAll(arraylist2);
		al12.trimToSize();

		System.out.println("******linked list***Add/remove operations are less expensive***");
		LinkedList<Object> ls = new LinkedList<Object>();
		ls.addFirst("10.190"); // add first
		ls.add("test123");
		ls.add(null);
		ls.add(null);
		ls.add(null);
		ls.addLast("i am last element buddy"); // add last

		Iterator<Object> itr1 = ls.iterator();
		while (itr1.hasNext()) {
			System.out.println("linked list elements are: " + itr1.next());

		}

		/* Iterating in list from a specified index of list */

		List<Integer> size = new ArrayList<Integer>();
		size.add(44);
		size.add(90);
		size.add(11);
		size.add(14);

		Iterator<Integer> listi = size.listIterator(2);
		while (listi.hasNext()) {
			System.out.println(listi.next());
		}

		/*
		 * add/get firt/last elements in linked list only.
		 */
		LinkedList<Integer> firstlast = new LinkedList<Integer>();
		firstlast.add(44);
		firstlast.add(90);
		firstlast.add(11);
		firstlast.add(14);
		System.out.println("first elememt is:" + firstlast.getFirst());
		System.out.println("first elememt is:" + firstlast.getLast());
		firstlast.addFirst(98);
		firstlast.addLast(78);

	}

}
