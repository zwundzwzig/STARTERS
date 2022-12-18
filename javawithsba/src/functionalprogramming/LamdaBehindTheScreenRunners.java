package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}
	
}

public class LamdaBehindTheScreenRunners {

	public static void main(String[] args) {
		List
			.of(23, 99, 299, 2000, 2, 3, 25, 22)
			.stream()
//			.filter(n -> n % 2 == 0)
			.filter(new EvenNumberPredicate())
//			.map(e -> e * e)
			.map(new NumberSquareMapper())
//			.forEach(e -> System.out.println(e));
			.forEach(new SystemOutConsumer());
	}

}
