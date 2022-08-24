package SsangYong220824;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add(5);		오류발생.
		list.add("hello");
		list.add("apple");
		System.out.println(list);

	}

}
