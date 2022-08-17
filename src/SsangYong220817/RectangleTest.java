package SsangYong220817;

class Rectangle {
	int width;
	int length;
	
	int calcArea(int a, int b) {
		return a * b;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle num1 = new Rectangle();
		num1.length = 5;
		num1.width = 10;
		System.out.println((double)num1.calcArea(num1.length, num1.width));

	}

}
