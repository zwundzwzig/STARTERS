package constructor;

import java.util.Arrays;

class Employer {
	int id;
	String name;
	protected String title;
	String dept;
	double salary;
	
	Employer(int i, String n, String t, double s) {
		System.out.printf("Employer 생성자 호출 %d, %s, %s, %.2f, %s", i, n, t, s, name).println();;
	}
	
	Employer(int id, String name, String title, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.dept = dept;
		this.salary = salary;
	}
	
	Employer(int id, String name) {
		this(id, name, "No", "Not yet", -1);
	}
	
	Employer() {
		this(2, "HELLO", "DeepDive", "Core", 1000);
	}
}

class Manager extends Employer {
	
	Manager(int id, String name, String dept, String job) {
		super.id = id;
		this.name = name;
		this.dept = dept;
		this.job = job;
	}
	String title = "관리직";
	String job;

	void test() {
		System.out.println("1" + this.title);
		System.out.println("2" + title);
		System.out.println("3" + super.title);
	}
	
	public String toString() {
		return "id : " + id + " name : " + name + " job : " + job;
	}
}

public class Employee {
	
	Employer arr[];

	public static void main(String[] args) {
		Employer e1 = new Employer(100, "HI", "Guten Tag!", 3);
		Employer e2 = new Employer(1, "Guten Tag!");
		Employer e3 = new Employer();
		e1.name = "WOW";
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
		System.out.println();
		
		Manager m = new Manager(5, "Guten Abend", "JJK", "yahoo");
		m.test();
		System.out.println(m);
	}

}
