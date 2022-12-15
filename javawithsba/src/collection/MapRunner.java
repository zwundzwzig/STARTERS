package collection;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "Puff one time and i puff twice. " + "y'all already know what it is!";
		Map<Character, Integer> occurances = new HashMap();
		Map<String, Integer> wordsOccurances = new HashMap();
		
		char[] characters = str.toCharArray();
		String[] words = str.split(" ");
		
		for (char character : characters) {
			Integer integer = occurances.get(character);
			if(integer == null) occurances.put(character, 1);
			else occurances.put(character, integer + 1);
		}
		
		for (String word : words) {
			Integer integer = wordsOccurances.get(word);
			if(integer == null) wordsOccurances.put(word, 1);
			else wordsOccurances.put(word, integer + 1);
		}
		
		System.out.println(occurances);
		System.out.println(wordsOccurances);
	}

}
