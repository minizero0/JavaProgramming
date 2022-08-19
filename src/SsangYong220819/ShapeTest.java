package SsangYong220819;

abstract class Shape{
	protected int x;
	protected int y;
	protected double area;
	abstract public void operation();
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Shape() {
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public double getArea() {
		return area;
	}
	
}

class Rect extends Shape{
	protected double width;
	protected double height;
	public Rect() {
	}
	public void operation() {
		area = width * height;
	}
	public Rect(int x, int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth(double width) {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight(double height) {
		return height;
	}
	public String toString() {
		return "x : " + x + ", y : " + y + ", width : " + width + ", height : " + height + ", area : " + area;
	}
}

class Circle extends Shape{
	private double radius;
	public void operation() {
		area = radius * radius * 3.14;
	}
	
	public Circle() {
	}
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return "x : " + x + ", y : " + y + ", radius : " + radius + ", area : " + area;
}
}

class Triangle extends Rect{
	public Triangle() {
		
	}
	public Triangle(int x, int y, double width, double height) {
		super(x,y,width,height);
	}
	public void operation() {
		area = width * height / 2;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getheight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}	
	
}

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 20, 4);
		Rect r1 = new Rect(10,20, 3, 5);
		c1.operation();
		r1.operation();
		System.out.println(c1);
		System.out.println(r1);

	}

}
