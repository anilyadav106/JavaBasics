/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class ReverseWordsInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str="Java is a programming language";	
		
	System.out.println(reverseWords(str));
		
		
		}
	
	static String reverseWords(String str) {
		
		String strTemp="";
		
		String[] strArray= str.split(" ");
		
		for ( String s: strArray) {
			
			StringBuffer strBUffer = new StringBuffer(s);
			StringBuffer revString=strBUffer.reverse();
			
			strTemp=strTemp+ revString+" ";
		}
		 return  strTemp;
		 
	}
}
 
