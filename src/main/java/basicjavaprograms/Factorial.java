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
		int num = 5;

		// formula=n*(n-1)*(n-2).....*1
		// 5*4*3*2*1
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}

		System.out.println(fact);

		System.out.println("*******or**********");

		int n = 5;
		int result = 1;

		for (int i = n; i >= 1; i--) {

			result = result * i;

		}

		System.out.println(result);
	}

}
