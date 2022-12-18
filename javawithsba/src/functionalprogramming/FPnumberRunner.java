package functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPnumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(25, 1, 7, 10, 11, 13);
		numbers
			.stream()
			.forEach(element -> System.out.println(element > 12));
		
		int sum1 = normalSum(numbers);
		int sum2 = numbers
					.stream()
					.reduce(0, (num1, num2) -> num1 + num2);
		int sum3 = numbers
				.stream()
				.filter(num -> num % 2 == 1)
				.reduce(0, (num1, num2) -> num1 + num2);
		
		System.out.println(sum1 == sum2);
		System.out.println(sum3);
		
		List
			.of(23, 12, 34, 53)
			.stream()
			.max((n1, n2) -> Integer.compare(n1, n2))
			.get();

		List
			.of(23, 12, 34, 53)
			.stream()
			.filter(e -> e % 2 == 1)
			.collect(Collectors.toList());
		
		IntStream
			.range(1, 11)
			.reduce(0, (n1, n2) -> n1 + n2);
		
		IntStream
			.range(1, 11)
			.map(e -> e * e)
			.boxed()
			.collect(Collectors.toList());
			
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
