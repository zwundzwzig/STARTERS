package collection;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		String[] animals = {"0-lion", ":snake", "Tiger", "dog"};
		Arrays.sort(animals);
		System.out.println(Arrays.toString(animals));
		
		class MyComparator implements Comparator {

			@Override
			public int compare(Object o1, Object o2) {
				if(!(o1 instanceof String && o2 instanceof String)) {
					return -1;
				}
				String s1 = (String) o1;
				String s2 = (String) o2;
				
				return s1.compareTo(s2) * -1;
			}
			
		}
		MyComparator mc = new MyComparator();
		System.out.println(mc.compare("ABC", "ㄱdEF"));
		Arrays.sort(animals, mc);
		System.out.println(Arrays.toString(animals));
	}

}
