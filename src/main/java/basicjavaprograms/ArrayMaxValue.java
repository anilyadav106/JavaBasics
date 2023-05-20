package basicjavaprograms;
/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class ArrayMaxValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 5 };
		int max = array1[0];

		for (int i = 1; i < array1.length; i++) {

			if (array1[i] > max) {
				max = array1[i];
			}
		}
		
		System.out.println("The larget no is :" + max);
	}


 
}
