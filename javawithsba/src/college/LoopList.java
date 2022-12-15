package college;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopList {

	public static void main(String[] args) {
		List<String> words = List.of("A", "B", "C");
		List<String> wordsA = new ArrayList<String>(words);
		
		for(String word : words) {
			System.out.println(word);
		}
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		
		Iterator wordsIterator = words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
		
//		for(String word : wordsA) {
//			if(word.endsWith("C")) {
//				wordsA.remove(word);
//			}
//			System.out.println(word);
//		}
		
		Iterator wordsAIterator = wordsA.iterator();
		System.out.println("-----");
		while(wordsAIterator.hasNext()) {
			System.out.println(wordsAIterator.next());
		}

	}

}
