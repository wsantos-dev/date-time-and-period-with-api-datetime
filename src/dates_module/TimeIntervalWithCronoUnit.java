package dates_module;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeIntervalWithCronoUnit {

    public static void main(String[] args) throws ParseException {

	// total days of a date until now.
	long days = ChronoUnit.DAYS.between(LocalDate.parse("2024-01-01"), LocalDateTime.now());

	System.out.println("Have " + days + " days between dates.");

	// total decades of a date until now.
	long decades = ChronoUnit.DECADES.between(LocalDate.parse("1992-01-01"), LocalDateTime.now());
	System.out.println("Have " + decades + " decade(s) between dates.");
    }
}
