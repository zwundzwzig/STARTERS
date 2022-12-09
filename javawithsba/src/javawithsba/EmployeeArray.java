package javawithsba;

import java.util.Arrays;

public class EmployeeArray {
	
	Employer arr[];

	public static void main(String[] args) {
		Employer arr[] = new Employer[2];
		
		Employer e1 = new Employer();
		e1.id = 100;
		e1.name = "LEE";
		e1.title = "Junior";
		e1.dept = "itDeveloper";
		e1.salary = 1000;
		arr[0] = e1;

		Employer e2 = new Employer();
		e2.id = 200;
		e2.name = "PARK";
		e2.title = "Senior";
		e2.dept = "BackEndDeveloper";
		e2.salary = 2000;
		arr[1] = e2;
		
		for(Object ar:arr) {
			System.out.println(ar.equals(e2));
		}
	}

}
