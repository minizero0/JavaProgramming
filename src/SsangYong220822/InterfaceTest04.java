package SsangYong220822;

class O{
	int k = 100;
	public void test() {
		System.out.println("test");
	}
}
interface Q{
	int YEAR = 2022; //DEFAULT final . -> final int YEAR
	public void hello();
}

interface R{
	String title = "JAVA"; //DEFAULT final String title
	public void pro();
}

class S extends O implements Q,R{
	String name = "honggild";
	
	public void sayHello() {
		System.out.println("ehoh~ " + name);
	}
	public void hello() {
		System.out.println("hello");
	}
	public void pro() {
		System.out.println("pro");
	}
	
}

public class InterfaceTest04 {

	public static void main(String[] args) {
		S ob = new S();
		ob.sayHello();
		ob.pro();
		ob.hello();
		ob.k = 200;
//		ob.YEAR = 2021; 인터페이스 변수는 자동 상수이므로 변경할 수 없다.

	}

}
