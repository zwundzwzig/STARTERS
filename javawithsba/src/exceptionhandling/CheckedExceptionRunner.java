package exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(1000);
		}
		catch(InterruptedException err) {
			err.printStackTrace();
		}
		anotherMethod();
	}
	
	public static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void anotherMethod() throws RuntimeException {}

}
