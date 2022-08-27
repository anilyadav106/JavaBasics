/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		// 0 1 1 2 3 5 8 13 21 34 
		
		int first=0;
		int second=1;
		
		int length=10;
		
		
		for(int i=1;i<=length;i++) {
			System.out.print(first + " ");  
			int third=first+second; 
			first=second;
			second=third;
			
			
		}

	}

}
