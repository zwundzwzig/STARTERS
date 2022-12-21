package InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOEX1 {

	public static void main(String[] args) {
		int data = 0;
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		while((data = input.read()) != -1) {
			output.write(data); // void write(int b)
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}

}
