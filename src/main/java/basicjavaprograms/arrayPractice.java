/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author anilkumar06
 *
 */
public class arrayPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 7, 8, 2, 3, 1, 10, 9 };
		int i = arr.length;
		System.out.println(i);
	 

		// sorts only 7,8,2 in ascending order
		Arrays.sort(arr, 2, 5);
		System.out.println(Arrays.toString(arr));

		String s1 = "Hello World";
		String s2 = "Hello World";

		String s3 = new String("Hello World");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);

		int[] al = new int[5];
		al[0] = 15;
		al[1] = 13;
		al[2] = 14;

		Arrays.sort(al);
		for (Integer a : al) {
			System.out.println(a);

		}
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		for (Integer in : list) {
			System.out.println(in);
		}
		 
//			System.out.println("********list interface and its implemented class arraylist");
		
		List<String> al1 = new ArrayList<String>();
		al1.add(0, "Bunny");
		al1.add(1, "Hunny");
		al1.add(2, "Punny");
	
		System.out.println(al1);
		System.out.println(al1.size()); // 3

		al1.remove(0);
		System.out.println(al1.size());// 2
		System.out.println(al1.get(0)); // Hunny

	}

}