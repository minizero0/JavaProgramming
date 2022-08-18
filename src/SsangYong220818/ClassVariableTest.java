package SsangYong220818;

class Human1{
	private String name;
	private int age;
	static int cnt = 0;  //정적변수 객체 생성시 name, age는 객체마다 다른 주소값을 가지지만 정적변수는 같은곳을 참조한다.
	
	public Human1(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return name + " " + age + " " + cnt;
	}
}

public class ClassVariableTest {
	

	public static void main(String[] args) {
		Human1 h1 = new Human1("mattu",23);
		Human1 h2 = new Human1("cavin",32);
		h1.cnt++;
		System.out.println(h1);
		h1.cnt++;
		System.out.println(h2);

		

	}

}
