package SsangYong220822;

class A{
	public void hello() {
		System.out.println("A의 Hello");
	}
	public final void pro() {
		System.out.println("pro");
	}
}

class B extends A{
	//자식클래스에서 필요하다면 얼마든지 부모의 메소드를 오버라이딩 할 수 있다.
	public void hello() {
		System.out.println("B의 hello");
	}
	//부모클래스의 fianl 메소드는 오버라이딩 할 수 없다.
//	public void pro() {
//		System.out.println("B의 hello ");
//	}
}

public class FinalMethodTest {

	public static void main(String[] args) {
		B ob = new B();
		ob.hello();
		ob.pro();

	}

}
