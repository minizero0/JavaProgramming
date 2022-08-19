package SsangYong220819;

abstract class C{
	abstract public void hello();  //추상메소드는 자식클래스들이 반드시 오버라이딩 해야하는 강제성을 부여.
}
class D extends C{
		//부모클래스의 메소드를 오버라이딩 하지 않아 오류 발생.
}

public class AbstractTest {

	public static void main(String[] args) {
		
	}

}
