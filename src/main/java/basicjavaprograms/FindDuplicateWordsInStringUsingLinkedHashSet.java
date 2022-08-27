package basicjavaprograms;

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
		
		 
		Set<String> set = new LinkedHashSet<>();

		for (String i : strArray)
		{
			set.add(i);
					    }
		
		Iterator<String> itr =set.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.print(itr.next()+" ");
		}

		}
	}
