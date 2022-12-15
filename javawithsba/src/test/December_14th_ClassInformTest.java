package test;

public class December_14th_ClassInformTest {

	public static void main(String[] args) {
		try {
			Class.forName(args[0]);
			System.out.println(args[0]);
		}
		catch(ClassNotFoundException e) {
			System.out.println("NOT_FOUND_404");
		}
	}

}
