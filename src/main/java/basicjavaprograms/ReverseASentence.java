/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class ReverseASentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		String str = "bunny studies in green field school";
		System.out.println(str.length());
		String strtemp = " ";
		
		String strArray[] = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {

			 
		 strtemp = strtemp + strArray[i] + " ";
			 

		}
//remove the leading and trailling white spaces
		System.out.println(strtemp.trim());
		System.out.println(strtemp.trim().length());

	}

}
