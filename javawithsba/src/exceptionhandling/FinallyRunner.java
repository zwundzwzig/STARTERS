package exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null; 
		try {
			scanner = new Scanner(System.in);
			int[] numbers = {12, 3, 4, 5};
			int number = numbers[5];
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		finally {
			if(scanner != null) {
				System.out.println("Before Scanner Close");
				scanner.close();
			}
		}
	}

}
