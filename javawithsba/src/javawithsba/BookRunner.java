package javawithsba;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book deepDiveJavaScript = new Book();
		Book coreJavaScript = new Book();

		deepDiveJavaScript.setFavoratePart("Module");
		coreJavaScript.setFavoratePart("Framwork");

		String getDeep = deepDiveJavaScript.getFavoratePart();
		String getCore = coreJavaScript.getFavoratePart();

		System.out.printf(getDeep, getCore);
		System.out.println();

		deepDiveJavaScript.addReview(new Review(1, 5, "I felt deep education!"));
		coreJavaScript.addReview(new Review(1, 5, "I learned core education!"));
		System.out.println(deepDiveJavaScript);
		System.out.println();
	}

}
