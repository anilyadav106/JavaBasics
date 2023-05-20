/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class PrintCharactersUptoALimit {

	// print before 'f'
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');
 

		for (Character c : list) {

			if (c.equals('f')) {

				break;  //come out of for loop   ,, if is not a loop

			}

			System.out.println(c);

		}


	}

}
