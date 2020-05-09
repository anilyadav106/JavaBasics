/**
 * 
 */
package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author anilkumar06
 *
 */
public class HashSetAndTreeSetAndLinkedHashSet {

	public static void main(String[] args) {

		Set<Object> set = new HashSet<Object>();
		set.add("anil");
		set.add("anil");
		set.add(10.12);
		set.add(12);
		set.add(null);
		set.add(null);
		set.add(true);
		set.add(12);

		System.out.println("*********HashSet : no default sorting, no ordering,no indexing");
		Iterator<Object> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("HashSet elemets are :" + itr.next());
		}

		System.out.println("*********TreeSet : by default ascending order sorting, *** ");
		TreeSet<Object> tree = new TreeSet<Object>();
		tree.add("tunil");
		tree.add("anil");
		tree.add("bunil");
		tree.add("sunil");

		Iterator<Object> itr1 = tree.iterator();
		while (itr1.hasNext()) {
			System.out.println("TreeSet elemets are :" + itr1.next());
		}

		System.out.println("***********/* Iterating in set in reverse order */**********");

		TreeSet<Integer> reverse = new TreeSet<Integer>();
		reverse.add(44);
		reverse.add(90);
		reverse.add(11);
		reverse.add(14);

		Iterator<Integer> reverseiterator = reverse.descendingIterator();
		while (reverseiterator.hasNext()) {
			System.out.println(reverseiterator.next());
		}
		System.out.println("***********LinkedHashSet maintains inseration order ***********");

		// LinkedHashSet of Integer Type
		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

		// Adding elements
		lhset2.add(99);
		lhset2.add(7);
		lhset2.add(0);
		lhset2.add(67);
		lhset2.add(89);
		lhset2.add(66);
		System.out.println(lhset2);

		System.out.println(
				"***********Retains common elements which are also in other list or removed which are not in other list    ***********");
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

		listA.retainAll(listB);
		System.out.println("listA has only common elements from listB :" + listA);

	}

}
