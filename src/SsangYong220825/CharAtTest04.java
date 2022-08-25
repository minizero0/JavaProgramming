package SsangYong220825;

import java.util.HashMap;
import java.util.Set;

public class CharAtTest04 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String data = "hello korea";
		
		
		
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch != ' ') {
				map.put(ch, 1);
			}
			
			
		}
		System.out.println(map.get('w'));
		System.out.println(map);

	}

}
