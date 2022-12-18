package test;

class StringComparator {
//	String str1;
//	String str2;
//	boolean isLength;
	
	StringComparator() {
		super();
//		this.str1
//		this.str2;
//		this.isLength;
	}
	
	public void compare(String str1, String str2, boolean isLength) {
		
//		this.str1 = str1;
//		this.str2 = str2;
//		this.isLength = isLength;
		
		int result = 0;
		if(isLength == true) {
			result = str1.length() > str2.length() ? str1.length() : str2.length();
			System.out.println(result);
		}
		if(isLength == false) {
			int first = countChar(str1);
			int second = countChar(str2);
			result = first > second ? str1.length() : str2.length();
		}
		
		System.out.println(result);
	}
	
	private  int countChar(String str) {
        return str.length() - str.replace(String.valueOf('a'), "").length();
    }
	
}

public class December_16th_StringComparator {

	public static void main(String[] args) {		
		StringComparator first = new StringComparator();
//		first.compare(“javaprogram”, “oracle”, true);
//		int second = new StringComparator().compare(“javaprogram”, “oracledatabase”, false);
	}

}
//main
//String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
//String delResult2 = deleteChar(data, new String[]{".", "ㅋ", "ㅎ","?", " "});
//System.out.println("===> " + delResult2);
//===> 지금저는수업중입니다정말요과제물도하고있구요
//
//deleteChar 구현메소드