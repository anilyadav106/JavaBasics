/**
 * 
 */
package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class CollectionClassUseFulMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> src = new ArrayList<Integer>();
		src.add(42);
		src.add(94);
		src.add(1);
		src.add(16);
		

		ArrayList<Integer> dest = new ArrayList<Integer>();
		dest.add(11);
		dest.add(15);
		dest.add(89);
		dest.add(76);
		dest.add(88);

		/*
		 * #1 copying src list to dest list  ,provided dest have atleast capacity
		 * to absorb src
		 */
		Collections.copy(dest, src);
		System.out.println("Destination list is updated :" + dest);

		/*
		 * #2 reversing elements of src
		 */
		Collections.reverse(src);
		System.out.println("Reversed elements are: " + src);

		/*
		 * #3 sorting elements of src, elements must be comparable like all
		 * integers or strings
		 */
		Collections.sort(src);
		System.out.println("Sorted elements are: " + src);

		/*
		 * #4 Adding all elements in src using Collections method.
		 */
		Collections.addAll(src, 12, 34, 67);
		System.out.println("Added more elements in src: " + src);

		/*
		 * #5 Adding all elements in src from another list using list method i.e
		 * Merging list newList with List src
		 */
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(44);
		newList.add(90);
		newList.add(11);
		newList.add(14);
		src.addAll(newList);

		System.out.println("Added more elements in src: " + src);

		/*
		 * #6 Swapping 2 nos.
		 */
		Collections.swap(newList, 0, 1);
		System.out.println("Swapped  1st element with 2nd element in newList: " + newList);

		/*
		 * #7 Shuffle the collection.
		 */
		Collections.shuffle(newList);
		System.out.println("Shuffled items in  newList: " + newList);

		/*
		 * #7 min and max from a collection.
		 */

		System.out.println("Minimum value from the collection is :" + Collections.min(src));
		System.out.println("Maximum value from the collection is :" + Collections.max(src));

	}

}
