package SsangYong220825;

import java.util.HashMap;
import java.util.Set;

public class CharAtTest05 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String data = "hello korea";
		
		
		
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch != ' ') {
				Integer n = map.get(ch);
				if (n == null)
					map.put(ch, 1);
				else
					map.put(ch, n+1);
			}
		}
		System.out.println(map);

	}

}
