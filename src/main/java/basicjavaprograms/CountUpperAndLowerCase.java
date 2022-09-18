/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class CountUpperAndLowerCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "anilKUmar  YADav";

		int lower = 0 ;

		int upper = 0 ;

		for (int i = 0; i < test.length(); i++) {

			char c = test.charAt(i); 
			

			if (c > 65 && c < 90) {

				upper ++;
			} 
			else if (c!=' ')   // ignore  considering white space as lower case

			  lower++;  
		}
System.out.println("Upper cases :" + upper);
System.out.println("lower cases :" + lower);
	}

}
