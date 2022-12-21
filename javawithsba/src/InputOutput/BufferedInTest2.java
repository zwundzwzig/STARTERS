package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		long start, end = 0;
		FileReader fis = new FileReader("/Users/junhyungcho/Downloads/컬렉션프레임워크실습예제.pdf");
		start = System.currentTimeMillis();
		while(true) {
			int data;
			try {
				data = fis.read();
				if(data == -1) break;
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		end = System.currentTimeMillis();
		System.out.println("With file reader : " + (end - start));
		
		fis = new FileReader("/Users/junhyungcho/Downloads/컬렉션프레임워크실습예제.pdf");
		BufferedReader br = new BufferedReader(fis, 10);
		
		while(true) {
			int data;
			try {
				data = br.read();
				if(data == -1) break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		end = System.currentTimeMillis();
		System.out.println("With buffer reader : " + (end - start));
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
