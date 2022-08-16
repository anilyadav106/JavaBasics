/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class MissingNoInASeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		int sum = 0;
		int expectedSum = 0;
		//sum the no of series
		for (int i = 0; i < intArray.length; i++) {

			sum = sum + intArray[i];
		}
//sum the no which should be originally available in the same series
		for (int i = 1; i <= 10; i++) {

			expectedSum = expectedSum + i;
		}
		System.out.println(sum);
		System.out.println(expectedSum);

		//diff of original and given series is the missing no itself
		System.out.println("Missing no is " + (expectedSum - sum));
	}
}
