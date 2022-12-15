package college;

class MyExcept extends Exception {
	int errorCode;
	
	MyExcept(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public void getErrorCode() {
		System.out.println(super.getMessage() + " " + errorCode);
	}
}

class Subject {
	boolean isSearch = false;
	String[] names = {"Spring", "Boot", "JSP", "servlet", "java"};

	void search(String name) throws MyExcept {
		for(String nme : names) {
			if(nme.equals(name)) {
				isSearch = true;
				break;
			}
		}
		if(isSearch == false) throw new MyExcept(name + " is not found.", 404);
		System.out.println("Hello!");
	}
}

public class MyException {

	public static void main(String[] args) {
		try {
			new Subject().search("MariaDB");
		} catch (MyExcept e) {
			e.getErrorCode();
		}
	}

}
