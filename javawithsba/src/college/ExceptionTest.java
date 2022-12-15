package college;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int k = i / j;
			System.out.printf("The result is %d", k).println();
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please write two numbers.");
		}
		catch(ArithmeticException e) {
			System.out.println("you cannot write `0`.");
		}
		catch(Exception e) {
			System.out.println("끝판왕");
		}
		finally {
			System.out.println("This is the output.");
		}
	}

}
