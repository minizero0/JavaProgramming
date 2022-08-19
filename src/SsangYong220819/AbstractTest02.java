package SsangYong220819;

abstract class  As{
	abstract public void hello();
}

class Bs extends AS{
	public void hello(int a) {//오버라이딩은 매개변수도 똑같이 선언해야 오류가 발생하지않음.
		System.out.println(1);
	}
}


public class AbstractTest02 {
	Bs b1 = new Bs();
	b1.hello(1);

}
