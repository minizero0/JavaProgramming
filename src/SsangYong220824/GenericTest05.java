package SsangYong220824;

import java.util.ArrayList;



public class GenericTest05 {

	public static void main(String[] args) {
		ArrayList<Person1> list = new ArrayList<Person1>();
		list.add(new Person1("이순신",27));
		list.add(new Person1("이방원",23));
		list.add(new Person1("이성계",52));
		//for-each반복문 활용하여 sayhello도 호출
		for (Person1 a : list) {
			System.out.println(a);
			if (a instanceof Person1)
				a.sayHello();
		}
		
		
	}
}