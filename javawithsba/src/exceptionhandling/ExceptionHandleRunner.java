package exceptionhandling;

public class ExceptionHandleRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended"); // Stack Trace
	}
	
	private static void method1() {
		method2();
		System.out.println("Method1 end");
	}

	private static void method2() {
		try {
//			String str = null;
//			str.length();
			int[] i = {1, 2};
			int number = i[2];
			System.out.println("Method2 end");
		}
		catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("Array Index Out Of Bounds Exception");
			err.printStackTrace();
		}
		catch(NullPointerException err) {
			System.out.println("Null Pointer Exception");
			err.printStackTrace();
		}
		catch(Exception err) {
			err.printStackTrace();
		}
	}

}
