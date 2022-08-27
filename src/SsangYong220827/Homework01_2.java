package SsangYong220827;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			if (map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		Iterator<String> iter = map.keySet().iterator();
		
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.print(key + " ==> " + value + "\n");
		}
	}

}
