package javawithsba;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book deepDiveJavaScript = new Book();
		Book coreJavaScript = new Book();
		
		deepDiveJavaScript.setFavoratePart("Module");
		coreJavaScript.setFavoratePart("");
		
		String getDeep = deepDiveJavaScript.getFavoratePart();
		String getCore = coreJavaScript.getFavoratePart();
		
		System.out.println(getDeep);
		System.out.println(getCore);
		
		System.out.println();
	}

}
