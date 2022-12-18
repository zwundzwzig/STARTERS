package college;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(calendar.MONTH);
		int year = calendar.get(calendar.YEAR);
		int date = calendar.get(calendar.DATE);
		int dayOfMonth = calendar.get(calendar.DAY_OF_MONTH);
		System.out.printf("%d, %d, %d, %d", month, year, date, dayOfMonth);
		System.out.println(calendar);
	}

}
