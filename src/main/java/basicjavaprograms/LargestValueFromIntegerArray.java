package basicjavaprograms;

import java.util.Arrays;

public class LargestValueFromIntegerArray {

	public static void main(String[] args) {

		int[] array = {11, 2, 55, 7,-99,34,-5 };
		
		System.out.println("**** using for loop****");
		
		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("The larget no is :" + max);
		
		
		
	System.out.println("**** using array sorting*****");
		
		
		Arrays.sort(array);
		
		 	
			System.out.println("Smallest no is : " +  array[0]);
			
			System.out.println("largest no is : " +  array[array.length-1]);
	 
	}

}
