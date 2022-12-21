package InputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		for(int i = 48; i <= 57; i++) {
			bos.write(i);
		}
		bos.close();
		fos.close();
	}

}
