package SsangYong220825;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListAndHashSet {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
//		for (int i = 0; i < set.size(); i++)
//			System.out.println(set.get(i));  HashSet에는 get메소드가 없음 
//		for (int a : set)
//			System.out.println(a); for-each를 활용하여 값을 뽑아준다.
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			int a = iter.next();
			System.out.println(a);
		}
		
	}

}
