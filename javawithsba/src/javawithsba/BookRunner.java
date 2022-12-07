package javawithsba;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book deepDiveJavaScript = new Book();
		Book coreJavaScript = new Book();
		
		deepDiveJavaScript.setFavoratePart("Module");
		coreJavaScript.setFavoratePart("scope");
		
		System.out.println(deepDiveJavaScript.getFavoratePart());
		System.out.println(coreJavaScript.getFavoratePart());
		
		System.out.println();
	}

}
