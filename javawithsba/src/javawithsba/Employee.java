package javawithsba;

class Employer {
	int id;
	String name;
	String title;
	String dept;
	double salary;
}

class Manager extends Employer {
	String job;
}

public class Employee {

	public static void main(String[] args) {
		Employer e1 = new Employer();
		System.out.println(e1.name);
		
		Manager manager = new Manager();
		manager.id = 2;
		manager.name = "HONG";
		manager.title = "a";
		manager.dept = "b";
		manager.job = "";
		System.out.println(manager.id);
	}

}
