/**
 * 
 */
package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
 
/**
 * @author anilkumar06
 *
 */
public class LocalDateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * localdate,localTime , LocalDateTime,DateTimeFormatter classes are
		 * immutable , means once declared cant be changed like String means-a new object of
		 * that class will be created.
		 */
		
		// #1-

		// 2 ways to get localdate only
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1989, 03, 25);
		System.out.println(ld);
		System.out.println("use provided local date is" + ld1);

		// now get parts of date using other methods
		// ----Month---
		Month ld2 = ld.getMonth();
		System.out.println(ld2);
		int ld3 = ld.getMonthValue();
		System.out.println(ld3);
		// ----Date---

		DayOfWeek ld4 = ld.getDayOfWeek();
		System.out.println(ld4);
		int ld5 = ld.getDayOfMonth();
		System.out.println(ld5);

		// ---Year
		int ld6 = ld.getYear();
		System.out.println(ld6);

		// #2
		// 2 ways to get localTime only

		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(18, 31, 25);
		System.out.println(lt);
		System.out.println("use provided local time is: " + lt1);

		// now get parts of time using other methods
		int h = lt.getHour();
		int m = lt.getMinute();
		int s = lt.getSecond();
		int n = lt.getNano();

		// #3
		// ways to change date   as per need

		LocalDate ldupdated = ld.plusDays(5);
		LocalDate ldupdated1 = ld.plusWeeks(1);
		LocalDate ldupdated2 = ld.plusMonths(2);
		LocalDate ldupdated3 = ld.plusYears(10);

		System.out.println("Date after adding days is: " + ldupdated);
		System.out.println("Date after adding week is: " + ldupdated1);
		System.out.println("Date after adding months is: " + ldupdated2);
		System.out.println("Date after adding years is: " + ldupdated3);

		
		//#4 
		//ways to get LocalDateTime
		
		LocalDateTime ldt =   LocalDateTime.now();
		LocalDateTime ldt1 =  LocalDateTime.of(2024,01,28,19,52,30);
		System.out.println(ldt);
		System.out.println(ldt1);
		
		//#5
		//ways to get date or time in user required format dd-mm-yyyy or yyyy-mm-dd etc
		//or HH:mm:ss
		
		//A- lets see first on localdate
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate locDate=LocalDate.now();
       String myformattedDate= locDate.format(df);
       System.out.println(myformattedDate);
       
        //B- lets see now on localtime
		DateTimeFormatter tf= DateTimeFormatter.ofPattern("HH:mm:ss");
       LocalTime locTime = LocalTime.now();
       String myformattedlocTime=locTime.format(tf);
       System.out.println(myformattedlocTime);

	}		 
	}
 