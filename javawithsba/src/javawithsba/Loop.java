package javawithsba;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String star = "*";
		String space = " ";
		int count = (int) (Math.random() * 10) + 1;

		for (int i = 1; i <= count; i += 2) {
			System.out.println(space.repeat((count - i) / 2) + star.repeat(i));
		}
		for (int j = count - 1; j >= 1; j -= 2) {
			System.out.println(space.repeat((count - j) / 2) + star.repeat(j));
		}
		while (true) {
			int stop = (int) (Math.random() * 10) + 1;
			if (stop == 9)
				continue;
			if (stop % 2 != 0)
				break;
			System.out.println(stop);
		}
		System.out.println("------");

		int[] arr = new int[] { 23, 49, 50, 1, 5 };

//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*50)+1;
//			System.out.println(arr[i]);
//		}
		System.out.println("------");

		int min = 10;
		int max = 10;
		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i]) {
				int temp = arr[i];
				arr[i] = min;
				min = temp;
			}
			if (min < arr[i]) {
				int temp = arr[i];
				arr[i] = min;
				min = temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] > arr[i]) {
				arr[0] = arr[i];
				arr[arr.length - 1] = arr[0];
			}
		}
		System.out.printf("최솟값 : %d", arr[0]).println();
		System.out.printf("최댓값 : %d", arr[arr.length - 1]).println();

		System.out.printf("최솟값 : %d", min).println();
//		System.out.println(args);
	}

}