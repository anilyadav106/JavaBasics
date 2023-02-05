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
		// TODO Auto-generated method stub

		String s = "anil@@@$%#$###$%%123"; 
		// using replace all

 	String s1 = "";
	//	s1 = s.replaceAll("[a-zA-Z0-9]", "");   // it will print all junk/special  --@@@$%#$###$%%s
	 	s1 = s.replaceAll("[^a-zA-Z0-9]", "");   // it will print non junk/special--Anil
 
	 System.out.println(s1);

		// using char value range if string has only letters and numbers

		String s2 = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) > 64 && s.charAt(i) <= 122) {

				s2 = s2 + s.charAt(i);

			}

			 
		}
		System.out.println(s2);
	}

}
