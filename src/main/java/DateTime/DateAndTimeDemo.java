/**
 * 
 */
package DateTime;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {

	public static void main(String[] args) {

		/*
		 * localdate,localTime , LocalDateTime,DateTimeFormatter classes are immutable ,
		 * means once declared cant be changed like String means-a new object of that
		 * class will be created.
		 * 
		 * None of time API classes have constructors, so u will never see like new
		 * LocalDate() or new LocalTime()
		 */

		// #1-

		// 2 ways to get localdate only
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1989, 03, 25);
		LocalDate ldnew = LocalDate.of(03, 25, 1989);

		System.out.println(ld);
		System.out.println("User provided local date is :" + ld1);
		System.out.println("in any format date" + ldnew);
		// now get parts of date using other methods
		// ----Month---
		Month ld2 = ld.getMonth();
		System.out.println("Month returned is always in capital " + ld2);
		int ld3 = ld.getMonthValue();
		System.out.println("Month value is always in integer " + ld3);
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
		System.out.println("only hour is :" + h);
		System.out.println("only minute is :" + m);
		System.out.println("only second is :" + s);
		System.out.println("only nano is :" + n);

		// #3
		// ways to change date as per need

		LocalDate ldupdated = ld.plusDays(5);
		LocalDate ldupdated1 = ld.plusWeeks(1);
		LocalDate ldupdated2 = ld.plusMonths(2);
		LocalDate ldupdated3 = ld.plusYears(10);

		System.out.println("Date after adding days is: " + ldupdated);
		System.out.println("Date after adding week is: " + ldupdated1);
		System.out.println("Date after adding months is: " + ldupdated2);
		System.out.println("Date after adding years is: " + ldupdated3);

		// #4
		// ways to get LocalDateTime

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt1 = LocalDateTime.of(2024, 01, 28, 19, 52, 30);
		System.out.println(ldt);
		System.out.println(ldt1);

		// #5
		// ways to get date or time in user required format dd-mm-yyyy or yyyy-mm-dd etc
		// or HH:mm:ss

		// A- lets see first on localdate
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate locDate = LocalDate.now();
		String myformattedDate = locDate.format(df);
		System.out.println(myformattedDate);

		// LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");//this needs time
		// component also

		// B- lets see now on localtime
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime locTime = LocalTime.now();
		String myformattedlocTime = locTime.format(tf);
		System.out.println(myformattedlocTime);

		// #6 way to combine both date and time

		LocalDate date = LocalDate.of(2024, 2, 1);
		LocalTime time = LocalTime.of(12, 30);

		// Combine the date and time to create a LocalDateTime
		LocalDateTime dateTime = date.atTime(time);
		LocalDateTime timedate = time.atDate(date);

		System.out.println(dateTime);
		System.out.println(timedate);

		// #7 ways to get zoneddatetime
		// current system default timezone
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Zoneddate time is:" + zdt); // 2024-02-05T16:09:00.611954+05:30[Asia/Calcutta]

		// any custom timezone's date and time

		ZoneId zi = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt1 = ZonedDateTime.now(zi);
		System.out.println("Zoneddate time of Europse /Paris currently is:" + zdt1); // 2024-02-05T16:09:00.611954+05:30[Asia/Calcutta]

		// now get parts of zonedatetime using other methods
		int year = zdt.getYear();
		int month = zdt.getMonthValue();
		int day = zdt.getDayOfMonth();
		int hour = zdt.getHour();
		int minute = zdt.getMinute();
		int second = zdt.getSecond();
		ZoneId zone = zdt.getZone();
		System.out.println("This timezone is: " + zone);
		// Period- in P3YP2MP23D, like mugal period

		// Duration- in time like 2 hours 30 min 45 sec , like exam duration

	}
}
