package test;

class Employee {

	protected int id;
	protected String name;
	protected int salary;
	protected int general;

	Employee(int id, String name, int salary, int general) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.general = general;
	}

	int getWholeSalary() {
		return salary + general;
	}

	@Override
	public String toString() {
		return "사번 : " + id + " 이름 : " + name + " 본봉 : " + salary + " 일반수당 : " + general + " 총급여 : " + getWholeSalary();
	}
}

class Manager extends Employee {

	private int managerSalary;

	Manager(int id, String name, int salary, int general, int managerSalary) {
		super(id, name, salary, general);
		this.managerSalary = managerSalary;
	}
	
	@Override
	public int getWholeSalary() {
		return salary + general + managerSalary;
	}

	@Override
	public String toString() {
		return "사번 : " + id + " 이름 : " + name + " 본봉 : " + salary + " 일반수당 : " + general + " 간부수당 : " + managerSalary
				+ " 총급여 : " + getWholeSalary();
	}

}

class Engineer extends Employee {

	private int techSalary;
	private int qualifiSalary;

	Engineer(int id, String name, int salary, int general, int techSalary, int qualifiSalary) {
		super(id, name, salary, general);
		this.techSalary = techSalary;
		this.qualifiSalary = qualifiSalary;
	}

	@Override
	public int getWholeSalary() {
		return salary + general + techSalary + qualifiSalary;
	}

	@Override
	public String toString() {
		return "사번 : " + id + " 이름 : " + name + " 본봉 : " + salary + " 일반수당 : " + general + " 기술수당 : " + techSalary
				+ " 자격수당 : " + qualifiSalary + " 총급여 : " + getWholeSalary();
	}

}

class Secretary extends Employee {

	private int secretarySalary;

	Secretary(int id, String name, int salary, int general, int secretarySalary) {
		super(id, name, salary, general);
		this.secretarySalary = secretarySalary;
	}

	@Override
	public int getWholeSalary() {
		return salary + general + secretarySalary;
	}

	@Override
	public String toString() {
		return "사번 : " + id + " 이름 : " + name + " 본봉 : " + salary + " 일반수당 : " + general + " 비서수당 : " + secretarySalary
				+ " 총급여 : " + getWholeSalary();
	}

}

public class December_13th {

	public static void main(String[] args) {
		Employee[] employee = new Employee[4];

		employee[0] = new Employee(1000, "이사원", 10000, 5000);
		employee[1] = new Manager(2000, "김간부", 20000, 10000, 10000);
		employee[2] = new Engineer(3000, "박기술", 15000, 7500, 5000, 5000);
		employee[3] = new Secretary(4000, "최비서", 15000, 7000, 10000);
		
		for (Employee employe : employee) {
			System.out.println(employe);
		}
	}

}
