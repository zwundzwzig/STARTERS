package test;

class RunString {
	String first = "Android";
	String middle = "Alois";
	String last = "Schwarzenegger";
	String firstInit = first.substring(0, 1);
	String middleInit = middle.substring(0, 1);
	String lastInit = last.substring(0, 1);
	String initials = firstInit + middleInit + lastInit;
	
	RunString() {
	}
	
	String getName() {
		return "1. 이름 : " + first + " " + middle + " " + last;
	}
	
	String getUpperName() {
		return "2. 이름 (대문자) : " + first.toUpperCase() + " " + last.toUpperCase();
	}
	
	String getInitialName() {
		return "3. 이니셜 : " + initials;
	}
	
	String getFirstName() {
		return "4. First Name is " + first;
	}
 	
}

public class December_15th_String {

	public static void main(String[] args) {
		
		RunString result = new RunString();
		System.out.println(result.getName());
		System.out.println(result.getUpperName() + " " + result.first.equalsIgnoreCase("Android"));
		System.out.println(result.getInitialName());
		System.out.println(result.getFirstName());
		
	}

}
