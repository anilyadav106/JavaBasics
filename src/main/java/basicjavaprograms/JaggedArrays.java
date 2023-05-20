/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class JaggedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		/*
		 *   it has 3 rows- each row as a single dim array, means multi dim array has
		 * multiple single dim arrays as its members
		 */
		String str[][] = new String[3][ ];
		
		str[0]= new String[]{"anil"};
		str[1]= new String[]{"sunil","kumar"};
		str[2]= new String[]{"preetam","garvit"};
		
		  for(int i=0;i<str.length;i++) {
			  
			  for(int j=0;j<str[i].length;j++) {
				  
				  System.out.println(str[i][j]);
			  }
		  }
	}

}
