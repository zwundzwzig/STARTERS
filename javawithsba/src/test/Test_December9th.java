package test;

import java.util.Arrays;

class Student {
	String name;
	String course;
	int expense;
	int refunds;
	static String education = "새싹";
	final int extraCharge = 5000;
	
	void calc(String course) {
		if (course.equals("Java")) refunds = (int)(expense * 0.2 + extraCharge);
		if (course == "JSP") refunds = (int)(expense * 0.15 + extraCharge * 2);
		if (course == "Spring") refunds = (int) (expense * 0.1 + extraCharge);
		else refunds = 0;
	}
}

public class Test_December9th {
	
	public static void main(String[] args) {
		Student aa = new Student();
		aa.name = "KIM";
		aa.course = "WoongJin";
		aa.expense = 300_000;
		aa.calc("Java");
		System.out.printf("name : %s\ncourse : %s\nexpense : %d\nrefunds : %d\neducation : %s\nextra change : %d\n",
				aa.name, aa.course, aa.expense, aa.refunds, aa.education, aa.extraCharge);
		System.out.println(Arrays.toString(args));
	}
	
}
