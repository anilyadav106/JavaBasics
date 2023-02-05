/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*******1st**********");
		// 1*2*3*4*5
		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}

		System.out.println(fact);

		System.out.println("*******2nd**********");
		// formula=n*(n-1)*(n-2).....*1
		// 5*4*3*2*1
		int n = 5;
		int result = 1;
		for (int i = n; i >= 1; i--) {

			result = result * i;

		}

		System.out.println(result);
	}

}
