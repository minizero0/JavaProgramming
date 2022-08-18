package SsangYong220818;

class Human2{
	private String name;
	private int age;
	public static String addr;
	
	Human2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void hello() {
		System.out.println("hello");
	}
	
	public String toString() {
		return "이름: " + name + "나이: " + age;
	}
}

public class ClassMethodTest {

	public static void main(String[] args) {
		Human1 h1 = new Human1("Hwang", 21);
		Human2.hello(); 
		//static 키워드가 붙어있는 메소드는 객체를 생성하지 않아도 호출가능.
		//객체 없이 호출하기 때문에 클래스 이름을 통해서 호출. -> 클래스 메소드
	}

}
