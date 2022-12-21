package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1], true);
		
		while(true) {
			int data = fis.read();
			if(data == -1) break;
			fos.write(data);
		}
		
		fis.close();
		fos.close();
	}

}
