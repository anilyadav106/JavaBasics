/**
 * 
 */
package basicjavaprograms;

public class TrimAnyCharactersInString {

	public static void main(String[] args) {

 		System.out.println(removeDesiredCharacterFromString("cataa"));

	}
	// by keep checking each character and then if its desired character to remove,
	// dont add it to new string
 
	// to remove all occurence of a with blank

	public static String removeDesiredCharacterFromString(String str) {
		String strNew = null;
		if (str == null || str.length() == 0) {

			System.out.println("Please enter a valid string");
		} else {
			strNew = str.replaceAll("[a]", "");

		}
		return strNew;

	}

}
