/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class EnumDemo {

	/**
	 * @param args
	 */
	
	public enum Browsers  {
		
		
		CHROME,FIREFOX,SAFARI,EDGE;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Browsers.CHROME);
		System.out.println(Browsers.EDGE);
		
		
	}

}
