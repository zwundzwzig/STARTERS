package javawithsba;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avgInt = 10 / 3;
		float avgDouble = 10 / 2f;
		System.out.println(avgInt);
		System.out.println(avgDouble);
		avgDouble *= avgInt;
		byte i = 127;
		System.out.println();

		String condition = "title";

		if (condition == "title")
			System.out.println("Search with title");
		else if (condition == "writer")
			System.out.println("Search with writer");
		else if (condition == "contents")
			System.out.println("Search with contents");
		else
			System.out.println("Please write a Keyword");

		switch (condition) {
		case "title":
			System.out.println("Search with title");
			break;
		case "writer":
			System.out.println("Search with writer");
			break;
		case "contents":
			System.out.println("Search with contents");
			break;
		default:
			System.out.println("Please write a Keyword");
		}

		char j = 'A';

		char grade;
		switch (avgInt) {
		case 21:
			grade = 2;
			break;
		case 1:
			System.out.println();
			break;
		case 'A':
			System.out.println();
			break;
		default:
			System.out.println();
		}

		System.out.printf("%s's grades are %d, %.2f, %c, and %3d", condition, avgInt, avgDouble, j, i).println();
		
		int oneToHundred = (int)(Math.random() * 100 + 1);
		
		System.out.println(oneToHundred);
	}

}
