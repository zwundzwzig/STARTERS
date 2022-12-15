package collection;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'ㄱ', 'C', 'Z', 'a', '0', 'C', 'H', 'O', 'A');
		Set<Character> treeSet = new TreeSet<>(characters);
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		Set<Character> hashSet = new HashSet<>(characters);
		
		System.out.println(characters);
		System.out.println("tree : "+ treeSet);
		System.out.println("tree : "+ treeSet);
		System.out.println("linked hash : "+ linkedHashSet);
		System.out.println("hash : "+ hashSet);
	}

}
