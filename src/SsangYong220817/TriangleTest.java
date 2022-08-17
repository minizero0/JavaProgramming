package SsangYong220817;

class Triangle{
	private int width;
	private int height;
	private int area;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
	
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle myTr = new Triangle();
		myTr.setWidth(10);
		myTr.setHeight(5);
		
		System.out.println(myTr.getArea());

	}

}
