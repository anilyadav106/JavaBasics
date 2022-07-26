package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // key
		 																// storage
		hm.put("RollNo1", 111);
		hm.put("RollNo2", 123);
		hm.put("RollNo3", 133);
		
		System.out.println(hm);
		System.out.println(hm.size()); // 3
		System.out.println(hm.isEmpty());
		System.out.println(hm.get("RollNo3"));
		hm.remove("RollNo2");

		System.out.println(hm.size()); // 2
		System.out.println(hm.containsKey("test"));
		
	

	}

}
