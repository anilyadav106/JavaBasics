package basicjavaprograms;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author anilkumar06
 *
 */
public class FindDuplicateNoInAraayUsingBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		int [] array= {1,4,5,5,6,7,7,8};
		
	  //using 2 for loops
		
		for (int i=0;i<array.length;i++) {
			
			for (int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					
					System.out.println("duplicate element found is :" + array[i]);  // no counting
					
				}
			}
			
		}
		
	  
		
	}

}
