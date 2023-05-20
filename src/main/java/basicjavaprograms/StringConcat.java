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

		String a = "adidas";
		a.concat("shoes"); // no impact on a value as doing concat has no impact on original string value

		System.out.println(a);

		String b = a.concat("shoes"); // but storing this manipulated string in a new string vairble will give a new
										// object (adidas shoes) to new varibale B

		System.out.println(a); // no impact to adidas
		System.out.println(b); // a new object
		System.out.println(a); // no impact to adidas

	 
		
	}

}
