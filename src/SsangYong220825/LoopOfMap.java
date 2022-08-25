package SsangYong220825;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LoopOfMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kor", 100);
		map.put("eng", 80);
		map.put("math", 90);

		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key);
			System.out.println(value);
			System.out.println("--------------------------------");
		}
//		for (int i = 0; i < map.size(); i++) {
//			Object obj = map.keySet();
//			System.out.println(obj);
//			Object obj2 = map.values();
//			System.out.println(obj2);
//			
//		}
		
		
//		for (Object obj : map)  			오류
//			System.out.println(obj);

	}

}
