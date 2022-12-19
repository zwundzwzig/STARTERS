package generics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		System.out.println(set.size());
		
		HashSet<Integer> lotto = new HashSet<>();
		
		for(int i = 1; i <= 8; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			System.out.println(ran);
		}
		System.out.println();
		
		while(true) {
			if(lotto.size() > 6) break;
			int ran = (int) (Math.random() * 45) + 1;
			lotto.add(ran);
		}
		System.out.println(lotto);
		System.out.println();
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}

}
