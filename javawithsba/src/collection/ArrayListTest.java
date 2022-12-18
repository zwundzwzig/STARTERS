package collection;

import java.util.ArrayList;

class Employee {
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	public String toString() {
		return " id is " + id + " name is " + name + " pay is " + (int)pay;
	}
}

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		
		Employee e1 = new Employee(100, "LEE", 100_000_000);
		Employee e2 = new Employee(200, "KIM", 150_000_000);
		Employee e3 = new Employee(300, "CHO", 480_000_000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);

		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.getClass().getSimpleName() + " index " + i + " value :");
			System.out.println(list.get(i).toString());
		}
	}

}
