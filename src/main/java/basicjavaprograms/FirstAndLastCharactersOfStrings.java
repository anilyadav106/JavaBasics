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
		//print first3char  
	 String first3char=str.substring(0, 3);
 	System.out.println(first3char);
 	
 	
	//print last3char  
 	 String last3char=str.substring(str.length()-3, str.length());
  	System.out.println(last3char);
  	
 	

	}

}
