package dates_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HandlingCalendarObject {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("06/03/2025"));
		
		// adding the days of the month
		calendar.add(Calendar.DAY_OF_MONTH, 40); // forty days from today		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy")
				.format(calendar.getTime()));
		
		// adding the month
		calendar.add(Calendar.MONTH, 1);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy")
				.format(calendar.getTime()));
		
		// adding one year
		calendar.add(Calendar.YEAR, 1);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy")
				.format(calendar.getTime()));
		
	}
}
