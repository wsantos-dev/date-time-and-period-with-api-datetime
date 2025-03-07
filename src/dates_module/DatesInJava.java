package dates_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesInJava {
	
	public static void main(String[] args) throws ParseException {
		
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
		
		
		
		/*----------------- Simple Date Format -------------------------*/
		System.out.println("-------------------------------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Date to show on screen: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Date to database format: " + simpleDateFormat.format(date));
		
		// to date object
		System.out.println(simpleDateFormat.parse("1985-10-20 23:25:00"));
		
		
		/*----------------------- Calendar ------------------------------------*/
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar [Day of the month]: " 
				+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar [Day of the week]: " 
				+ calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Calendar [Time of day]: " 
				+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar [Minutes of hours]: " 
				+ calendar.get(Calendar.MINUTE));
		System.out.println("Calendar [Seconds of hours]: " 
				+ calendar.get(Calendar.SECOND));
		System.out.println("Calendar [Year]: " 
				+ calendar.get(Calendar.YEAR));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Calendar object date on " + 
				"SimpleDateFormat object format: " 
				+ simpleDateFormat.format(calendar.getInstance().getTime()));
	}
}
 