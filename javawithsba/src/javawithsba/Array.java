package javawithsba;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Write at least 2 values.");
			return;
		}
		for (String arg : args)
			System.out.println(arg);

		int[] first = { 21, 22, 23 };
		int all = 0;
		for (int fst : first) {
			all += fst;
		}
		System.out.println(all);

		int a = 1;
		int b = 2;
		int c = 3;
		int[] second = { a, b, c };
		System.out.println(Arrays.toString(second));

		int ii[][] = { { 1, 2 }, { 4, 5, 6 } };
		System.out.println(Arrays.toString(ii[0]));
		System.out.println(Arrays.toString(ii[1]));
		System.out.println("----------");

		String names[] = new String[5];
		int kor[] = new int[names.length];
		int eng[] = { 96, 100, 66, 89, 49 };
		boolean condition = false;

		for (int i = 0; i < names.length; i++) {
			names[i] = "'" + args[i] + "'" + " 응시자";
		}
		for (int i = 0; i < kor.length; i++)
			kor[i] = (int) (Math.random() * 100) + 1;
		System.out.println(Arrays.toString(kor));
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%s의 합계 점수는 %d," + " 평균 점수는 %.2f", names[i], kor[i] + eng[i], kor[i] * 0.6 + eng[i] * 0.4)
					.println();
		}

		for (int i = 0; i < names.length; i++) {
			if (names[i].trim().equals("'wow' 응시자")) {
				int sum = (int) (kor[i] * 0.6 + eng[i] * 0.4);
				System.out.println("Sum is " + sum);
				condition = true;
			}
		}
	}

}
