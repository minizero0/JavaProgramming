package SsangYong220817;

class Person2 {  //클래스 정의 
	String name;
	int age;
	
	void eat(String food) {
		System.out.printf("%d살 %s가 %s를 먹는다.\n",age,name,food);
	}
	void go(String anywhere) {
		System.out.printf("%d살 %s가 %s로 간다.\n",age,name,anywhere);
	}
	int manAge(int age) {
		return age - 1;
	}
}

public class PersonTest{

	public static void main(String[] args) {
		Person2 lee; //객체 참조변수를 선언
		lee = new Person2();//객체생성
		Person2 jo = new Person2(); // 객체참조변수 선언을 동시에 객체 생성.
		
		lee.name = "daehyun";
		lee.age = 24;
		lee.eat("Hamburger");
		System.out.println(lee.manAge(lee.age));
		
	}

}
