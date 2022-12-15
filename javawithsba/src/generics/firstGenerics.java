package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyCustomList<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElements(T element) {
		list.add(element);
	}

	public void removeElements(T element) {
		list.remove(element);
	}

	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}
}

public class firstGenerics {

	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	static double sumOfNumberList(List <? extends Number> numbers) {
		double sum = 0.0;
		for(Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	static void addCoupleOfValues(List <? super Number> numbers) {
		numbers.add(1);
		numbers.add(1l);
		numbers.add(1d);
		numbers.add(1f);
	}

	public static void main(String[] args) {
		List<Number> emptyList = new ArrayList<>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1,2d,3,4,5,6.123)));
		System.out.println(sumOfNumberList(List.of(7f,8l,9,10,11.2)));
		
		String value = doubleValue(new String());
		Integer i = doubleValue(Integer.valueOf(5));
		ArrayList arr = doubleValue(new ArrayList<>());
		
		LinkedList<Integer> ia = new LinkedList<>(List.of(1,2,3));
		duplicate(ia);
		System.out.println(ia);
		
		MyCustomList<String> list = new MyCustomList();
		list.addElements("Always awake");
		list.removeElements("Always awake");
		list.addElements("Smoking dreams");
		list.removeElements("Smoking");

		MyCustomList<Integer> listy = new MyCustomList();
		listy.addElements(Integer.valueOf(5));
		listy.addElements(2);
		listy.removeElements(3);

		System.out.println(list);
		System.out.println(listy);
		System.out.println(list.get(0));
		System.out.println(listy.get(0));
	}

}
