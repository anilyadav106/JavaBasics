package basicjavaprograms;

import java.util.HashMap;

public class reverseString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Adidas");
		System.out.println("Reverse string is:" + sb.reverse());
 		System.out.println(sb);   // this will be reversed only because SB are mutable, the reverse method has changed/muted the string content
	}
 

}
