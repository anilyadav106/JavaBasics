/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class FirstAndLastCharactersOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str ="www.amazon.com";
		//print first4char  
	 String first4char=str.substring(0, 4);
 	System.out.println(first4char);
 	
 	
	//print last4char  
 	 String last4char=str.substring(str.length()-4, str.length());
  	System.out.println(last4char);
  	
 	

	}

}
