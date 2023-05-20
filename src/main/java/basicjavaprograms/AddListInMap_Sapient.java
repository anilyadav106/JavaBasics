/**
 * 
 */
package basicjavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author anilkumar06
 *
 */
public class AddListInMap_Sapient {

	/// {
//         “batter”=
//         [
//             { "id"= "1001", "type"= "Regular" },
//             { "id"= "1002", "type"= "Chocolate" }
//         ]
//     }
	 
	
	//first have 2 maps
	// then add these 2 maps in a list
	//finally add this list in a map having key as batter and value as above list
	public static void main(String[] args) {

		Map<String, ArrayList<HashMap<String,String>>> map = new HashMap<>();

		ArrayList<HashMap<String, String>> batterlist = new ArrayList<HashMap<String, String>>();

		HashMap<String,String> batter1 = new HashMap<String,String>();
		batter1.put("id","1001");
		batter1.put("type","Regular");
		
		
		HashMap<String,String> batter2 = new HashMap<String,String>();
		batter2.put("id","1002");
		batter2.put("type","Chocolate");
		
		batterlist.add(batter1);
		batterlist.add(batter2);

		map.put("batter",batterlist);

		System.out.println(map);
		    

	}

}
