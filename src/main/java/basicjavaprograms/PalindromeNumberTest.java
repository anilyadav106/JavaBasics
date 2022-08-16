/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class PalindromeNumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 345;
		int r = 0;
		int temp = 0;
		while (i > 0) {
// get the reminder as r
			r = i % 10;  // 5 then 4 then 3
		 
			temp = (temp * 10) + r;
			System.out.println(temp);
			i = i / 10;   //  345 to 34 to 3
		}

		if (i == temp) {

			System.out.println(temp + " is a palindrome");
		} else {

			System.out.println(temp + " is NOT a palindrome");
		}
	}

}
