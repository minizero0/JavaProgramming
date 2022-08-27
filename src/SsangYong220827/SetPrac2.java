package SsangYong220827;

import java.util.HashSet;
import java.util.Iterator;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class SetPrac2 {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("피터파커", 24));
		set.add(new Person("Tony Stark", 45));
		Iterator<Person> iter = set.iterator();
		
		while (iter.hasNext()) {
			Person ps = iter.next();
			
			System.out.println(ps.name);
			System.out.println(ps.age);
			System.out.println("-------------------");
		}

	}

}
