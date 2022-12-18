package test;

import java.util.Arrays;

class DeleteChar {
	String data;
	
	void deleteChar(String data, String[] arr) {
		this.data = data;
	}
}

public class December_16th_url {
	
	public static String deleteChar(String data, String[] arr) {
//		String str = "";
		
//		arr.
		for(String ar : arr) {
			data.replaceAll(ar, "");
		}
		
		return data.join("");
	}

	public static void main(String[] args) {
		String url = "http://www.kitri.re.kr:8080/java/test";
		
		String[] result = url.split("\\.|http://|:|/|/+");
		System.out.println(Arrays.toString(result));
		
		String resu = url.substring(url.lastIndexOf("//")+2);
		String[] res = resu.split("\\.|:|/|/+");
		System.out.println(Arrays.toString(res));
		
		
		String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
		String delResult2 = deleteChar(data, new String[]{".", "ㅋ", "ㅎ","?", " "});
		System.out.println("===> " + delResult2);
		
	}

}
