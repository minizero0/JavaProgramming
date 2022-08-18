package SsangYong220818;

class Box{
	private double width;
	private double length;
	private double height;
	private double volum;
	
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

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setWidth(10);
		b1.setHeight(5);
		b1.setLength(7.2);
		b1.calcVolum();
		System.out.printf("가로 : %f\n세로 : %f\n높이 : %f\n부피 : %f", b1.getWidth(), b1.getLength(), b1.getHeight(), b1.getCalcVolum());
		System.out.println(b1.getCalcVolum());
	}
}