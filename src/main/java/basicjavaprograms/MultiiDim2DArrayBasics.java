/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
public class MultiiDim2DArrayBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialization with values
		//An array of arrays
		int[][] anotherMatrix ={{1, 2, 3, 4}, {5, 6, 7},{9, 10, 11, 12}};
		 
		System.out.println(anotherMatrix.length);//how many elements in 2D array=3
        System.out.println(anotherMatrix[0].length);//how many elements in first array position=4		 
        System.out.println(anotherMatrix[1].length);//how many elements in 2nd array position=3		 
		System.out.println("******************");

        for (int i=0;i<anotherMatrix.length;i++) {
        	
        	for (int j=0;j<anotherMatrix[i].length;j++){
        		
        		System.out.println(anotherMatrix[i][j]);
        	}
        	
        }
	}

}
