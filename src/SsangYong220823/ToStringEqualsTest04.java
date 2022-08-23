package SsangYong220823;
class Rect3{
	private double width;
	private double height;
	public Rect3(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return width + "+" + height + "=" + width*height;
	}
	public boolean equals(Rect3 r) {
		boolean isFlag = false;
		if(width == r.width && height == r.height) {
			isFlag = true;
		}
		return isFlag;
	}
}

public class ToStringEqualsTest04 {

	public static void main(String[] args) {
		Rect3 r1 = new Rect3(20,40);
		Rect3 r2 = new Rect3(20,40);
		System.out.println(r1.equals(r2));

	}
}

/*출력문에 객체를 표현하여 자동으로 toString이 동작합니다. 
 * toString을 오버라이딩 하지 않으면 기본적으로 클래스이름과 객체의 주소값이 반환됩니다.*/
