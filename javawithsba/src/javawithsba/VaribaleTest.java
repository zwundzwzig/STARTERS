package javawithsba;

public class VaribaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte score = 127;
		int scr = 100;
		score += 1;
		scr += 100;
		System.out.println(score);
		System.out.println(scr);

		int avg = (score + scr) / 3;
		double avgDouble = (score + scr) / 31.0;

		System.out.println("정수 평균 = " + avg);
		System.out.println("실수 평균 = " + avgDouble);
		System.out.println(Math.floor(avgDouble));
		System.out.println();
		
		int radius = 5;
		final double pi = 3.14;
		double area = radius * pi * pi;
		
		System.out.println(true);
		System.out.println(radius);
		System.out.println();
		
		String loc = "SeSac Yongsan Campus";
		String title = "Cloud Basic Web Server Course";
		System.out.printf("We have studied %s at %s. \nNow %d week after.\n", title, loc, radius);
		
		byte b = 127;
		byte by = (byte)(b + 1);
		int ii = b + 1;
		System.out.printf("%d + %d", ii, by); // byte 변수의 변화 
	}

}
