package collection;

import java.util.ArrayList;
import java.util.List;

class SameSentence {
	
	private String result = "";
	
	private void getSameSentences(List<String> sentences1, List<String> sentences2) {
		for(int i = 0; i < sentences1.size(); i++) {
			if(sentences1.get(i) == sentences2.get(i)) {
				result += sentences2.get(i) + " ";
			}
		}
	}
	
	public void compare(List<String> list1, List<String> list2){
		if(list1.size() == list2.size()) getSameSentences(list1, list2);
		if(list1.size() < list2.size()) getSameSentences(list1, list2);
		if(list1.size() > list2.size()) getSameSentences(list2, list1);
		System.out.println(result);
		result = "";
	}
}

public class SameSentenceTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); 
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 용산캠퍼스에서 자바를 배우는 중입니다"); 
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! "); 
		list1.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list2 = new ArrayList<String>(); 
		list2.add("자바는 객체지향 언어입니다"); 
		list2.add("우리는 청계천에서 자바를 배우는 중입니다"); 
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! "); 
		list2.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다"); 
		list3.add("우리는 용산에서 자바를 배우는 중입니다"); 
		list3.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		
		SameSentence ss = new SameSentence();
		
		System.out.println("list1, list2에서 같은 내용을 출력합니다");
		ss.compare(list1, list2);
		System.out.println("================================");
		System.out.println("list1, list3에서 같은 내용을 출력합니다");
		ss.compare(list2, list3);
	}

}
