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
		// TODO Auto-generated method stub

		String str = "bunny studies in green field school";
		String strtemp = " ";
		System.out.println(str.length());
		String strArray[] = str.split("\\s");

		for (int i = strArray.length - 1; i >= 0; i--) {

			 
		 strtemp = strtemp + strArray[i] + " ";
			 

		}
//remove the leading and trailling white spaces
		System.out.println(strtemp.trim());
		System.out.println(strtemp.trim().length());

	}

}
