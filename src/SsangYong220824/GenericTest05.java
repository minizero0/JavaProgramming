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
//			a.sayHello();				<Person1> Generic 설정했기 때문에 이런식으로 작성해도 상관없음
			if (a instanceof Person1) 	//만약 타입이 다를 수도 있을 때는 instanceof로 타입 확인
				((Person1)a).sayHello();
		}
		
	}
}