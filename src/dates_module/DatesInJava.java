package dates_module;

import java.util.Date;

public class DatesInJava {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		// milliseconds that represent a current date
		System.out.println("Date in milliseconds: " + date.getTime());
		
		
		/* deprecated methods */
		
		// day of Month
		System.out.println("Day of the month: " + date.getMonth());
		
		// day of Week
		System.out.println("Day of the week: " + date.getDay());
		
		// time of day
		System.out.println("Time of day: " + date.getHours());
		
		// minutes of hours
		System.out.println("Minutes of hours: " + date.getMinutes());
		
		// seconds of hours
		System.out.println("Seconds of hours: " + date.getSeconds());
		
		// year (should with 1900 to obtain the actual date)
		System.out.println("Year: " + (date.getYear() + 1900));
		
		
		
		
	}
}
 