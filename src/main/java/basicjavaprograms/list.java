
package basicjavaprograms;

import java.util.ArrayList;

/**
 * @author anilkumar06
 *
 */
public class list {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("anil");
		list.add("sunil");
		System.out.println(list.size() + " "  + list.get(1));
		
		for ( String s : list) {
			
			System.out.println(s);
		}
	}

}
