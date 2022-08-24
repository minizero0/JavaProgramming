package SsangYong220824;

import java.util.ArrayList;

class Animal{
	protected String name;
	protected int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class Lion extends Animal{
	private char sex;
	public Lion(String name, int age, char sex) {
		super(name, age);
		this.sex = sex;
	}
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 성별 : " + sex;
	}
	
	
}
class Tiger extends Animal{
	private String color;
	public Tiger(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 색깔 : " + color;
	}
}

public class Cage {
	private Object animal;
	
	public void setAnimal(Object x) {
		animal = x;
	}
	public Object getAnimal() {
		return animal;
	}

	public static void main(String[] args) {
		ArrayList<Tiger> tiger = new ArrayList<Tiger>();
		ArrayList<Lion> lion = new ArrayList<Lion>();
		tiger.add(new Tiger("b",3,"white"));
		tiger.add(new Tiger("c",13,"black"));
		lion.add(new Lion("c",13,'f'));
		lion.add(new Lion("f",13,'m'));
		System.out.println(tiger);
		System.out.println(lion);
		

	}

}
