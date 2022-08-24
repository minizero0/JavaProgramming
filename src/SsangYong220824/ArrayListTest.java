package SsangYong220824;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("grape");
		list.add("watermelon");
		System.out.println(list);
		list.add("grape");			//중복허용
		list.add("peach");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());
	}
}
