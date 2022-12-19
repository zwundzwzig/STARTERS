package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("010-7777-4444", 
				new String[] {"hong", "010-2222-2222", "031-234-3434", "02-122-9999"}
				);
		map.put("010-1223-2354", "hong");
		map.put("010-1773-2535", "kim");
		map.put("010-1333-9350", "lee");
		map.put("010-1993-2300", "cho");
		map.put("010-9872-4154", "yang");
		
		Set keys = map.keySet();
		
//		for(Object key : keys) {
//			System.out.printf("Key is %s", key).println();
//			String[] values = (String[]) (map.get(key));
//			for(String value : values) {
//				System.out.printf("Value is %s", value).println();
//			}
//		}
		
		Object obj = map.get("010-1223-2354");
		
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[][] arr2 = { {0, 1}, {2, 3}, {4, 5, 6} };
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
		
		int[] ran = {45, 66, 10, 22, 77, 66};
		
		List list = Arrays.asList(ran);
		ArrayList list1 = new ArrayList(5);
		list1.add("java");
		list1.add(10);
		list1.add(3.14);
		Object[] list_arr = new Object[list1.size()];
		
		list1.toArray(list_arr);
//		list.add("java");
		
		System.out.println(Arrays.toString(list_arr));
	}

}
