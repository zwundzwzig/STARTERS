package college;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		int mathran = (int) (Math.random() * 100) + 1;
		
		Random ran = new Random();
		for(int i = 1; i <=5; i++) {
			System.out.println(ran.nextInt(100));
		}
		
		ran.nextDouble(100.0);
		System.out.println();
		
		Random ran2 = new Random(2);
		for(int i = 1; i <=5; i++) {
			System.out.println(ran2.nextInt(100));
		}
		System.out.println();
		
		int i = 10;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		
		Integer integer = new Integer(10);
		int in = new Integer(10);
		Integer inte = 10;
		
		System.out.printf("%d %d %d", integer, in, inte).println();
		System.out.println(inte == integer);
		
	}

}
