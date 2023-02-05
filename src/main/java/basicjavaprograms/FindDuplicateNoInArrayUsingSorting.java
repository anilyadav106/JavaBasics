package basicjavaprograms;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateNoInArrayUsingSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		int [] array= {1,4,5,5,6,7,7,8}; 
		
		  //using sorting
		Arrays.sort(array);
		
		
		for(int i=0;i<array.length-1;i++) {
			// keep checking current element with next element
			if(array[i]==array[i+1]) {
				System.out.println("duplicate element found is :" + array[i]);
				
				
				
			}
		}
		
	}

}
