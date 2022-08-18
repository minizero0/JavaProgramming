package SsangYong220818;

class Box1{
	private double width;
	private double length;
	private double height;
	private double volum;
	
	//클래스 이름과 동일한 이름의 메소드를 생성자라고 하며
	//객체 생성시에 자동으로 수행하여 멤버변수들의 값을 초기화 할 목적으로 사용하는 특수한 메소드
	//생성자는 호출문에 의해 동작하는것이 아니기 떄문에 return의 개념이 없다.
	//생성자 이름 왼쪽에 리턴타입을 쓰지 않아야 합니다. void or (int,char등등) 쓰면 안된다.
	//또, 생성자는 중복하여 정의할 수 있다. 중복(overloading)하여 정의하려면 매개변수 개수나 자료형이 달라야 한다.
	
	public Box1() {
		width = 10;
		length = 10;
		height = 10;
	}
	public Box1(double width, double length, double hegiht) {
		this.width = width;
		this.length = length;
		this.height = hegiht;
	}
	public Box1(double width) {
		this.width = width;
		length = 10;
		height = 10;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getHeight() {
		return height;
	}
	public void calcVolum() {
		volum = width * height * length;
	}
	public double getCalcVolum() {
		return volum;
	}
}

public class BoxTest02 {

	public static void main(String[] args) {
		Box1 b1 = new Box();
		b1.setWidth(10);
		b1.setHeight(5);
		b1.setLength(7.2);
		b1.calcVolum();
		System.out.printf("가로 : %f\n세로 : %f\n높이 : %f\n부피 : %f", b1.getWidth(), b1.getLength(), b1.getHeight(), b1.getCalcVolum());
		System.out.println(b1.getCalcVolum());
	}
}