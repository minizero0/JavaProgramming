package SsangYong220824;

import java.util.ArrayList;
import java.util.Date;

class Person1 {
	private String name;
	private int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "[이름:" + name + ",나이:" + age + "]";
	}
	public void sayHello() {
		System.out.println("안녕," + name);
	}
}

public class ArrayListTest04 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person1("강감찬",23));
		list.add(new Person1("김신",33));
		list.add("java");
		list.add(2022);
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.size());
	}
}
