package SsangYong220822;

class Ac{
	int a = 5;
	final static int N = 100; 
	//final 값은 변경할 수 없으니 객체마다 메모리를 확보할 필요가 없다.
	//모든 객체가 공동으로 사용하는 클래스 변수로 만드는 것이 일반적이다.                                             
	
}

public class FinalVariableTest02 {

	public static void main(String[] args) {
		Ac ob = new Ac();
		ob.a = 6;
		System.out.println(ob.a);
		//ob.N = 200; //final 키워드가 붙은 상수는 변경할 수 없다.
		System.out.println(ob.N);

	}
}