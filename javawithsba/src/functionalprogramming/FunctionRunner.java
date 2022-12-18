package functionalprogramming;

import java.util.List;

public class FunctionRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Java", "JavaScript", "GO", "TypeScript");
		printBasic(list);
		System.out.println();
		printWithFW(list);
		System.out.println();
		printWithFilter(list);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFW(List<String> list) {
		list.stream().forEach(element -> System.out.println("Function : " + element));
	}
	
	private static void printWithFilter(List<String> list) {
		list
			.stream()
			.filter(element -> element.startsWith("Java"))
			.forEach(element -> System.out.println("Filter : " + element));
	}

}
