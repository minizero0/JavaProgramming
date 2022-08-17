package SsangYong220817;

class Dog {
	private String name;
	public String breed;
	private int age;
		
	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog () {
	}
	
	public void printDog () {
		System.out.println("이름 : " + name + "\n종 : " + breed + "\n나이 : " + age);
	}
}

public class TeamExam {
	public static void main(String[] args) {
		Dog myDog = new Dog("요크", "퍼그", 23);
		Dog myDog2 = new Dog("요크", 23);
		Dog myDog3 = new Dog();
		myDog.printDog();
		myDog2.printDog();
		myDog3.printDog();
	}
}
