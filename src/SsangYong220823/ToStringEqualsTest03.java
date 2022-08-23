package SsangYong220823;
class Rect2{
	private double width;
	private double height;
	public Rect2(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return width + "+" + height + "=" + width*height;
	}
}

public class ToStringEqualsTest03 {

	public static void main(String[] args) {
		Rect2 r1 = new Rect2(20,40);
		Rect2 r2 = new Rect2(20,40);
		System.out.println(r1);
		System.out.println(r1.toString());
		System.out.println(r1.equals(r1));
		if (r1 == r1)
			System.out.println("true");
		else 
			System.out.println("false");
		
		System.out.println(r1.equals(r2));

	}
}

/*출력문에 객체를 표현하여 자동으로 toString이 동작합니다. 
 * toString을 오버라이딩 하지 않으면 기본적으로 클래스이름과 객체의 주소값이 반환됩니다.*/
