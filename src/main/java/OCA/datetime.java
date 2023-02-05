/**
 * 
 */
package OCA;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author anilkumar06
 *
 */
public class datetime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time=LocalTime.now();
		
	Period d=Period.between(LocalDate.of(2023, 01, 02),LocalDate.of(2023, 03, 26) );
          System.out.println(d.getDays());
	}

}
