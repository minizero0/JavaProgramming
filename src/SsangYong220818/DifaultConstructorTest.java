package SsangYong220818;

class Person{
	private String name;
	private int age;
	
	public String toString() {
		return name + "," + age;
	}
}

public class DifaultConstructorTest {

	public static void main(String[] args) {
		Person p1 = new Person(); 
		//사용자가 생성자를 한개도 만들지 않으면
		//기본 생성자가 제공되기 때문에 위와 같은 객체를 생성할 수 있다.
		//String = null, int = 0 으로 초기화 된다.
		
		System.out.println(p1);
	}
}
