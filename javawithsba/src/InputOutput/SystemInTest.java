package InputOutput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		System.out.println("waiting input value");
//		while(true) {
//			int data1 = System.in.read();
//			if((char)data1 == 'q') break;
//			System.out.println((char) data1);
//		}
//		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		while(true) {
//			int data = isr.read();
//			if((char)data == 'q') break;
//			System.out.println((char) data);
//		}
		
		Scanner key = new Scanner(System.in);
		while(key.hasNextInt() ) {
			int first = key.nextInt();
			if(first == 5) break;
			if(first == 2) first = key.nextInt();
			int second = key.nextInt();
			if(second == 5) break;
			if(second == 2) {
				first = key.nextInt();
				second = key.nextInt();
			}
			System.out.println(first - second);
		}
		
//		String first = key.nextLine();
//		System.out.println(first);
	}

}
