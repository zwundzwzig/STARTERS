package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileInput = null;
		
		try {
//		FileInputStream fileInput = new FileInputStream("./file-write.txt");
		fileInput = new FileReader("./file-write.txt");
			while(true) {
				int data = fileInput.read();
				if(data != -1) System.out.print((char)data); 
				else break;
			}
		}
		catch (FileNotFoundException err) {
			System.out.println("Nah shit");
			err.printStackTrace();
		}
		catch (IOException err) {
			System.out.println("Input or Output gotta problem");
			err.printStackTrace();
		}
		finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
