package SsangYong220817;

class Triangle{
	private double width;
	private double height;
	private double area;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height/2;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle myTr = new Triangle();
		myTr.setWidth(10);
		myTr.setHeight(5);
		
		System.out.println(myTr.getArea());
		myTr.setHeight(20);
		System.out.println("수정 후 면적 :" + myTr.getArea());
		
	}
}
