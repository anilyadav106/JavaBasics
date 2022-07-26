/**
 * 
 */
package crowe;

import java.util.Arrays;

import org.openqa.selenium.Keys;

/**
 * @author anilkumar06
 *
 */
public class parent {

	int a = 10;

	parent() {

		System.out.println("hiii");

	}

	static class child extends parent {
		int a = 11;

		child() {

			System.out.println(super.a);
			System.out.println(this.a);
			System.out.println("hiii3232");

		}

		public static void main(String[] args) {
 
			int[] arr = { 1, 2, 3, 4, 5 };
			
			String str= "anil kumar";
			
			 int s=str.length();
			 
			 String newstr="";
			 
			 for(int i=s-1;i>=0;i--) {
				 
				 newstr=newstr+str.charAt(i);
			 }
			 
			 
			 System.out.println(newstr);
			 StringBuffer sbr= new StringBuffer("anil");
			System.out.println( sbr.reverse());
			
			 
			int size=arr.length;
			Arrays.sort(arr);
			System.out.println(arr[size-1]);
			}
		 

		}

	}

 