package SsangYong220824;

import java.util.ArrayList;
import java.util.Date;

class Person2 {
	private String name;
	private int age;
	public Person2(String name, int age) {
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

public class ArrayListTest05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person2("강감찬",23));
		list.add(new Person2("김신",33));
		list.add("java");
		list.add(2022);
		list.add(new Date());
		
		for (int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			System.out.println(data);
		}
		
	}
}
