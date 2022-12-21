package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInTest {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fis = new FileReader("buffer.txt");
		BufferedReader br = new BufferedReader(fis, 10);
		while(true) {
			try {
//				int data;
//				data = fis.read();
//				if(data == -1) break;
//				System.out.println((char) data);
				String line = br.readLine();
				if(line == null) break;
				System.out.print(line);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
