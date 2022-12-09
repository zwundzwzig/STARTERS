package javawithsba;

class Overload {
	int add(int i, int j) {
		return i + j;
	}

	String add(String i, String j) {
		return i + j;
	}
	
	Double add(double i, double j) {
		return i + j;
	}
}

public class Overloading {

	public static void main(String[] args) {
		Overload over = new Overload();
		String result1 = over.add("spring ", "boot");
		int result2 = over.add(10, 4);
		double result3 = over.add(1.2, 1.1);
		System.out.printf("%d %s %f", result2, result1, result3).println();
		
		int dec = Integer.parseInt("100", 2);
		System.out.println(dec);
	}

}
