package SsangYong220824;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("파인애플");
		set.add("키위");
		set.add("샤인머스켓");
		set.add("수박");
		System.out.println(set);
		System.out.println(set.add("수박"));
		System.out.println(set.add("복숭아"));
		System.out.println(set);
	}
}
