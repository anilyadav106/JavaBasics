/**
 * 
 */
package learnselenuim;

import org.openqa.selenium.Point;

/**
 * @author anilkumar06
 *
 */
public class windowminimize extends Testbase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		     Point p= new Point(-2000, 0);
			 driver.manage().window().setPosition(p);
	}

}
