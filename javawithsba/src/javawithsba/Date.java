package javawithsba;

import java.time.*;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		LocalDate today = LocalDate.now();
		System.out.println(now.getDayOfYear());
		System.out.println(today.withDayOfYear(365));
		System.out.println(today.isLeapYear());
	}

}
