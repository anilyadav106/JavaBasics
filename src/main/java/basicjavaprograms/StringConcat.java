/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * @author anilkumar06
 *
 */
public class StringConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * hashmap---2 int addition related how to revere a string normal and SB class
		 * string -remove special characters from a string
		 * 
		 * how to hit a request--header/payload/authentication how to post a request
		 * 
		 * types of requests/status codes
		 * 
		 * List [a,b,c,d,e,f,g,h,k,l]; 
		 * Patterns in framework 
		 * Types of frameworks Ci?CD
		 * Pipeline BDD-Cucumber
		 */
		
		
		String a = "adidas";
		a.concat("shoes"); // no impact on a value as doing concat has no impact on original string value

		System.out.println(a);

		String b = a.concat("shoes"); // but storing this manipulated string in a new string vairble will give a new
										// object (adidas shoes) to new varibale B

		System.out.println(a); // no impact to adidas
		System.out.println(b); // a new object
		System.out.println(a); // no impact to adidas

		
		 
		
		/* how to print only character in a list upto a limit */

		List<Character> list = new ArrayList<>();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');

		System.out.println(list);

		for (Character c : list) {

			if (c.equals('g')) {

				break;

			}

			System.out.println(c);

		}
		
		
		

		

	}

}
