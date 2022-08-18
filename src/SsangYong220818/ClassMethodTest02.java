package SsangYong220818;

class Human3{
	private String name;
	private int age;
	public static String addr;
	public static int cnt = 0;;
	
	Human3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void hello() { //멤버 메소드, 멤버 변수 접근불가.
		System.out.println("hello");
		cnt += 2; // -> static 멤버변수는 접근가능.
		count();  // -> static 멤버메소드 접근가능.
		name = "asd";  //static 메소드에서는 static 멤버에만 접근이 가능하다. 멤버변수를 사용할 수 없다.
	}
	
	public static void count() {
		cnt++;
	}
	
	public String toString() {
		return "이름: " + name + "나이: " + age;
	}
}

public class ClassMethodTest02 {

	public static void main(String[] args) {
		Human3 h1 = new Human3("Hwang", 23);
		Human3.hello(); 
		//static 키워드가 붙어있는 메소드는 객체를 생성하지 않아도 호출가능.
		//객체 없이 호출하기 때문에 클래스 이름을 통해서 호출. -> 클래스 메소드
	}

}
