/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class RemoveSpecialCharactersInString {

	public static void main(String[] args) {
 
		String s = "anil@@@$%#$###$%%123"; 
		// using replace all and regex
  	    String s1 = "";
	//	s1 = s.replaceAll("[a-zA-Z0-9]", "");   // replace these with blank ,it will print all junk/special  --@@@$%#$###$%%s
	 	s1 = s.replaceAll("[^a-zA-Z0-9]", "");   // replace other than these with blank ,it will print non junk/special--Anil
 
	 System.out.println(s1);

	 
		
		// using character ranges
		
		String s3 = "";

		for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
            	s3 = s3 + currentChar;
            }
        }
		
		System.out.println(s3);

		
	}

}
