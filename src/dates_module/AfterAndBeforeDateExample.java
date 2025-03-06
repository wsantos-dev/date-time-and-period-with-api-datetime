package dates_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AfterAndBeforeDateExample {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// simulating a future date: Due date of a bill

		Date dateDue = sdf.parse("05/03/2025 23:59:59");

		String result = isDueTicket(dateDue);
		
		System.out.println("Result: " + result);
	}
	
	private static String isDueTicket(Date date) {
		
		Date currentDate = Calendar.getInstance().getTime();

	    if (date.after(currentDate)) {
	    	return "Ticket is not due!";
	    }	
	    if (date.before(currentDate)) {
	        return "The ticket is due!";
	    }
	    return "The ticket due today";
	}
	

}
