package test;

class Test {
	void m1(int i) throws ArithmeticException {
		System.out.println(10 / i);
	}
	
	void m2() {
		try {
			m1(2);
		}
		catch(ArithmeticException e) {
			m1(10);
		}
	}
}

class Test2 {
	void m1(int i) {
		if(i <= 0) throw new NumberFormatException();
		
		int count = 0;
		for (int index = 1; index <= i; index++) {
			if(i % index == 0) count++;
		}
		if (count == 2) System.out.println(i + "prime number");
		else System.out.println(i + "no prime number");
	}
}

public class December_14th_ClassInformTest {

//	public static void main(String[] args) {
//		try {
//			Class.forName(args[0]);
//			System.out.println(args[0]);
//		}
//		catch (ClassNotFoundException e) {
//			System.out.println("Class Not Found");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index out of Bounds");
//		} 
//	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		try {
			t2.m1(-13);
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		t2.m1(13);
	}

}
