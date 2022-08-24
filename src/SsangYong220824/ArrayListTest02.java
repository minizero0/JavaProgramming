package SsangYong220824;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {  //여러가지 자료형을 넣을 수 있다.
		ArrayList list = new ArrayList();
		list.add("홍길똥");
		list.add(27);
		list.add(182.5);
		list.add("서울시 마포 서교");
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		
	}
}
