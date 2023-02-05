/**
 * 
 */
package basicjavaprograms;

import java.util.Date;

/**
 * @author anilkumar06
 *
 */
public class DateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString().replace(":","_").replace(" ", "_"));
	}

}
