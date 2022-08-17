package SsangYong220817;

class Person3 {  	//클래스 정의 
	String name;
	int age;
	
	Person3(String name, int age){			//생성자 정의
		this.name = name;
		this.age = age;
		System.out.println("객체생성----->");
	}
	
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

public class PersonTest_Constructor{

	public static void main(String[] args) {
		Person3 lee; //객체 참조변수를 선언
		lee = new Person3("조영민", 27);//객체생성	
		Person3 jo = new Person3("김민준", 25); // 객체참조변수 선언을 동시에 객체 생성.
		
//		lee.name = "daehyun";
//		lee.age = 24;
//		lee.eat("Hamburger");
		System.out.println(lee.manAge(lee.age));
		System.out.println(jo.name + jo.age);
		
	}

}
