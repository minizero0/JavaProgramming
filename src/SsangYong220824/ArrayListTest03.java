package SsangYong220824;

import java.util.ArrayList;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "[이름:" + name + ",나이:" + age + "]";
	}
}

public class ArrayListTest03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Person p = new Person("홍길동", 20);
		Person lee = new Person("이순신", 45);
		list.add(p);
		list.add(lee);
		System.out.println(list);
		System.out.println(list.size());
	}
}
