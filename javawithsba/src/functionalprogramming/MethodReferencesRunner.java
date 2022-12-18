package functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer inte) {
		System.out.println(inte);
	}

	public static void main(String[] args) {
		List
			.of("Figma", "Adobe", "Zeppelin", "VScobe")
			.stream()
			.map(String::length)
//			.forEach(s -> System.out.println(s));
			.forEach(MethodReferencesRunner::print);
		
		Integer max = List.of(23, 99, 54, 55, 100).stream()
				.filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		
		System.out.println(max);
	}
	
	public static boolean isEven(Integer number) {
		return false;
	}

}
