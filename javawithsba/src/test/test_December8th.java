package test;

import java.util.Arrays;

public class test_December8th {
	public static void main(String[] args) {
		if (args.length < 5 && args.length > 10) {
			System.out.println("Incorrct input values.");
			return;
		}

		String star = "*";
		String space = " ";
		int count = (int) (Math.random() * 10) + 1;

		for (int i = 1; i <= count; i += 2) {
			System.out.println(space.repeat((count - i) / 2) + star.repeat(i));
		}

		System.out.println("-----");

		int[] arr = new int[] { (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1,
				(int) (Math.random() * 1000) + 1, (int) (Math.random() * 1000) + 1, (int) (Math.random() * 1000) + 1,
				(int) (Math.random() * 1000) + 1, };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("-----");
		for (int i = 0; i < args.length - 1; i++) {
			for (int j = i + 1; j < args.length; j++) {
				int before = Integer.parseInt(args[i]);
				int after = Integer.parseInt(args[j]);

				int tmp = 0;
				if (before > after) {
					tmp = before;
					args[i] = args[j];
					args[j] = Integer.toString(tmp);
				}
			}
		}

		System.out.println(Arrays.toString(args));

	}
}
