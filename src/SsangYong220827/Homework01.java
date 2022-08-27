package SsangYong220827;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int n = 1;
		
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, n);			
		}
		System.out.println(map);
		
		

	}

}
