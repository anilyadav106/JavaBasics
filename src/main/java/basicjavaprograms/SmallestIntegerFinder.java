/**
 * 
 */
package basicjavaprograms;

 import java.util.Arrays;

 
public class SmallestIntegerFinder {
	
    public static int findSmallest(int[] A) {
        // Check if the array is null or empty
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        // Sort the array
        Arrays.sort(A);

        // Return the first element of the sorted array
        return A[0];
    }

    public static void main(String[] args) {
        int[] test1 = { -1, 1, 2, 6, -8, 5 };
        int[] test2 = { 1, 2, 3, 4, 5 };
        int[] test3 = { -1, -2, -3, 0 };
        int[] test4 = {};  // Empty array

        try {
            System.out.println(findSmallest(test1));  // Output: -8
            System.out.println(findSmallest(test2));  // Output: 1
            System.out.println(findSmallest(test3));  // Output: -3
            System.out.println(findSmallest(test4));  // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

