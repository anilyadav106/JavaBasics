/**
 * 
 */
package learnselenuim;

import org.openqa.selenium.Dimension;

/**
 * @author anilkumar06
 *
 */
public class windowminimize extends Testbase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
 		     Dimension d = new Dimension(100, 200);//int width, int height
			 driver.manage().window().setSize(d);
	}

}
