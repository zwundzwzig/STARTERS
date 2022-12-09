package javawithsba;

class Data {
	int k = 10;
}

class C {
	void add(int i) {
		System.out.println(i++);
	}

	void addData(Data d) {
		System.out.println(d.k++);
	}
}

public class CallByValue {

	public static void main(String[] args) {
		C c1 = new C();

		Data main_d = new Data();
		int j = 10;
		c1.add(j);
		c1.addData(main_d);

		System.out.println(main_d.k);
		System.out.println(j);

	}

}
