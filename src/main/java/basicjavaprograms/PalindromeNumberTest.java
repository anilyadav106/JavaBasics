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

		int num = 345;
		int r = 0;
		int temp = 0;
		while (num > 0) {
     // get the reminder as r
			r = num % 10; // 5 then 4 then 3

			temp = (temp * 10) + r;

			/*
			 * 0+5 ,50+4=54, 540+3=543
			 */

 			num = num / 10; // 345 to 34 to 3
		}

		if (num == temp) {

			System.out.println(temp + " is a palindrome");
		} else {

			System.out.println(temp + " is NOT a palindrome");
		}
	}

}
