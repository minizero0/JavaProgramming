package SsangYong220819;

class I{
	
	public void pro() {
		System.out.println("pro");
	}
	
	public void hello() {
		System.out.println("A의 hello");
	}
}

class J extends I{
	public void hello() {
		System.out.println("B의 hello");
	}
	public void test_b() {
		System.out.println("test_b입니다");
	}
}
	
class K extends I{
	public void hello() {
		System.out.println("K의 hello");
	}
	public void test_c() {
		System.out.println("test_c입니다.");
	}
}

public class InstanceOfTest {

	public static void main(String[] args) {
		I ob = new J();		//부모의 참조변수가 자식 클래스의 객체를 참조할 수 있음 
		ob.pro();			//부모클래스의 메소드를 사용할 수 있다.
		ob.hello();			//자식클래스에서 오버라이딩한 메소드가 동작한다.
//		ob.test_b();		//자식클래스에서 새로 추가된 메소드는 호출할 수 없다.
		((J)ob).test_b();	//자식클래스로 형 변환하여 호출해야 한다.
		
		I arr[] = {new J(), new J(), new K()};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof J) {  //arr[i]가 B 클래스의 객체인가?
				((J)arr[i]).test_b();
			}
			if (arr[i] instanceof K)
				((K)arr[i]).test_c();
		}
	}	

}
