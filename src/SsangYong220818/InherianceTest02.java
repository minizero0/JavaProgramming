package SsangYong220818;

class C{  			//부모,상위,조상 클래스 
	int i;
	private int j;
}
class D extends C{	//자식,하위,후손 클래스 
					//상속관계 클래스라도 private 메소드, 변수에 접근할 수 없다.
					//외부의 다른 클래스로 부터는 접근을 허용하지않고 상속된 자식클래스들 에게 접근 허용을 위해 protected 사용.
	int k;
	public D() {
		i = 10;
		j = 20;
		k = 30;
	}
	public void info() {
		System.out.println("i:" + i + ",j:" + j + ",k:" + k);
	}
}

public class InherianceTest02 {

	public static void main(String[] args) {
		D ob = new D();
		ob.info();
		
	}
}
		