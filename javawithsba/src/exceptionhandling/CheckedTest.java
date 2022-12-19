package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedTest {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("sample.txt");
			throw new FileNotFoundException();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}

}
