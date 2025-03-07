package dates_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenerateDatesSimulatingInstallments {

    public static void main(String[] args) throws ParseException {
	
	Date initialDate = new SimpleDateFormat("dd/MM/yyyy").parse("06/03/2025");
	
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(initialDate);
	
	for (int i = 1; i <= 12; i++) {
	    calendar.add(Calendar.MONTH, 1);
	    System.out.println("Payment installment nº " + i + " with due is in: " + 
	    new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
	}
	
    }
}
