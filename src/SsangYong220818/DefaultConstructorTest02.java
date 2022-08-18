package SsangYong220818;

class Person1{
	private String name;
	private int age;
	
	public Person1() {
		
	}
	
	public Person1(String name, int age) {  //생성자 하나라도 만들면 기본생성자는 제공되지 않는다.
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "," + age;
	}
}

public class DefaultConstructorTest02 {

	public static void main(String[] args) {
		//Person1 p1 = new Person1(); 생성자 생성시 생성된 생성자가 원하는 매개변수를 넣어줘야한다. 그렇지 않으면 오류 발생.
		Person1 p1 = new Person1("tom", 23);
		//사용자가 생성자를 한개도 만들지 않으면
		//기본 생성자가 제공되기 때문에 위와 같은 객체를 생성할 수 있다.
		//String = null, int = 0 으로 초기화 된다.
		
		System.out.println(p1);
	}
}
