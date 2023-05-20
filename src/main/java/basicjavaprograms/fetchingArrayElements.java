/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * @author anilkumar06
 * 
 * Question asked in capgemini
 *
 */
public class fetchingArrayElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(fetchingArrayElements.desiredList());
		
		 
	}
	
	public static  ArrayList<Integer> desiredList() { 
		
		int[] hArray = {7,2,5,18,19,15,27,31,6,27,45,32};
	 
 
		int max= hArray[0];
		ArrayList<Integer> newlist= new ArrayList<Integer>();
 
		for (int i=0;i<hArray.length;i++){

		if (hArray[i]>=max){

		max=hArray[i];

		newlist.add(max);
		
		} 
		 
	}
		System.out.println(max);
		return newlist;
		

	}
}

