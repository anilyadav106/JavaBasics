/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class JavaTestForLoopSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		int sum=0;
		for ( int i=0,j=0;i<5&j<5;++i,j=i+1) {
			System.out.println(i +" "+ j);
	 
			sum+=i;
			System.out.println("sum is " +sum);
			}
		System.out.println(sum);

	}

}
