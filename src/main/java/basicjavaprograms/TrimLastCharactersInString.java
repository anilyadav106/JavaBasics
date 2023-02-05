/**
 * 
 */
package basicjavaprograms;
 

public class TrimLastCharactersInString {

	public static void main(String[] args) {

		System.out.println(removeTraillingA("cataa"));
		
	}

	public static String removeTraillingA(String str) {
		
	//	String str1="cataa";
		
	 
		
		String str2=""; 
for(int i=str .length()-1;i>=0;i--) {
	
	
	if (!(str .charAt(i)=='a')) {
		
	str2=str2+i;
	}
	
	System.out.println(str2);
}
		return str2;
		
	}

}
