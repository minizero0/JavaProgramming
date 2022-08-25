package SsangYong220825;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(0, "번호");
		
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(4, "번호");
		
		System.out.println(list1);
		System.out.println(list2);
		list1.remove(2);
		list2.remove(2);
		System.out.println(list1);
		System.out.println(list2);
	}

}
