package SsangYong220823;
class Rect{
	private double width;
	private double height;
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
}

public class ToStringEqualsTest {

	public static void main(String[] args) {
		Rect r = new Rect(20,40);
		System.out.println(r);
		System.out.println(r.toString());
		

	}
}

/*출력문에 객체를 표현하여 자동으로 toString이 동작합니다. 
 * toString을 오버라이딩 하지 않으면 기본적으로 클래스이름과 객체의 주소값이 반환됩니다.*/
