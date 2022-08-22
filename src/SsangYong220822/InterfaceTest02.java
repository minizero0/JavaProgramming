package SsangYong220822;

interface Shape{
	public void draw();
}

class Rect implements Shape{
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Triangle implements Shape{
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		Shape ob1 = new Circle();
		Shape ob2 = new Rect();
		Shape ob3 = new Triangle();
		
		ob1.draw();
		ob2.draw();
		ob3.draw();
	}

}
