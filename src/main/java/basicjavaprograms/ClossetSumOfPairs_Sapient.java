/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class ClossetSumOfPairs_Sapient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 10, 20, 25, 63, 96, 57 };
		int x = 100;
		int n = arr.length;
		printClosest(arr, n, x);

	}

	public static void printClosest(int[] arr, int n, int x) {
		// To store indexes of result pair
		int res_l = 0;
	   int res_r = 0; 

		// variable to store current minimum difference
		int temp = Integer.MAX_VALUE;

		// iterating over array
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// if found more closest pair
				if (Math.abs(arr[i] + arr[j] - x) < temp) {
					res_l = i;
					res_r = j;
					temp = Math.abs(arr[i] + arr[j] - x);
				}
			}
		}

		System.out.println("The closest pair is " + arr[res_l] + " and " + arr[res_r]);
	}

}
