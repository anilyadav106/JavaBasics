package basicjavaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateWordsInStringUsingLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str= "I am am Anil Anil Kumar yadav";

		String [] strArray=str.split(" ");
		
		 //LinkedHashSet maintains insertion order while retrieving
		Set<String> set = new LinkedHashSet<>();

		for (String i : strArray)
		{   
			set.add(i);
					    }
		
		System.out.println(set);
		//Iterator works on collections 
		Iterator<String> itr =set.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.print(itr.next()+" ");
		}

		}
	}
