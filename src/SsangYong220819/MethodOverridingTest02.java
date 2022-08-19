	package SsangYong220819;
class A{
	public void hello() {
		System.out.println("A의 hello");
	}
}

class B extends A{
	public void hello() {
		System.out.println("B의 hello");
	}
	public void pro() {
		hello();
		super.hello();
	}
}
public class MethodOverridingTest02 {

	public static void main(String[] args) {
		B ob = new B();
		ob.hello();
		ob.pro();
	}

}
