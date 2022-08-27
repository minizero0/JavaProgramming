package SsangYong220827;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prac {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str1 = sc.nextLine();
		System.out.println(str);
		System.out.println(str1);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hello", 1);
		map.put("java", 4);
		map.put("welcome", 5);
		map.put("hello", 1);
		System.out.println(map);
		
		ArrayList ar = new ArrayList();
		ar.add("hello");
		ar.add("java");
		ar.add("see");
		ar.add("hello");
		System.out.println(ar);
	}
	
}
