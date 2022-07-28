package chapter2;
import models.Person;
import models.Hero;

public class ClassEx {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("홍길동,", 25);
 		System.out.println(person1);
		System.out.println(person2);
		Hero hero = new Hero("슈퍼맨");
		Hero hero2 = new Hero("배트맨");
		hero.attack(hero2);
	}

	
}
