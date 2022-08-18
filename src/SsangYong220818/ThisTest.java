package SsangYong220818;

class Human{
	private String name;
	private int age;
	
	public Human(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human() {
		this("Hong", 20); 	//다른 생성자 호출시 this()사용. this()는 생성자의 첫번째 문장에만 사용가능. 다른 라인에 사용시 오류 발생.
	}
	public String toString() {
		return "이름:" +name + ",나이:" + age;
	}
}

public class ThisTest {

	public static void main(String[] args) {
		Human h1 = new Human("이순신", 30);
		Human h2 = new Human();
		System.out.println(h1);
		System.out.println(h2);
	}

}
