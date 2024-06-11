package basicjavaprograms;

public class reverseString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Adidas");
		System.out.println("Reverse string is:" + sb.reverse());
 		System.out.println(sb);   // this will be reversed only because SB are mutable, the reverse method has changed/muted the string content
 		String cde = "cde";
 	     
 		
 		//just an example
 	     String str = cde.substring(2, 3); 
 	     System.out.println(str);

	}
 

}
