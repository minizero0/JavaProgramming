package SsangYong220819;

class ShapeArr {
	protected int x;
	protected int y;
	protected String type;
	public ShapeArr(int x, int y, String type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	public String toString() {
		return "도형의 종류 : " + type + ", x: " + x + ", y: " + y + " ,";
	}
}

abstract class TwoDimShape extends ShapeArr{
	protected double area;
	public abstract double getArea();
	public TwoDimShape(int x, int y, String type) {
		super(x,y,type);
	}
}
abstract class ThreeDimShape extends ShapeArr{
	protected double volume;
	public abstract double getVolume();
	public ThreeDimShape(int x, int y, String type) {
		super(x,y,type);
	}
}

class Rectangle extends TwoDimShape{
	private double width;
	private double height;
	public Rectangle(int x, int y,double width, double height) {
		super(x,y,"Rectangle");
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		area = width * height;
		return area;
	}
	
	public String toString() {
		return super.toString() + "가로: " + width + ", 세로: " +height + ", 넓이: " + getArea();
	}
}
class Triangle2 extends TwoDimShape{
	private double width;
	private double height;
	public Triangle2(int x, int y, double width, double height) {
		super(x,y,"Triangle");
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		area = width * height / 2;
		return area;
	}
	public String toString() {
		return super.toString() + "가로: " + width + ", 세로: " +height + ", 넓이: " + getArea();
	}
}

class Cube extends ThreeDimShape{
	private double width;
	private double length;
	private double height;
	
	public Cube(int x, int y, double width, double length, double hegiht) {
		super(x,y,"CUBE");
		this.width = width;
		this.length = length;
		this.height = height;
	}
	public double getVolume() {
		volume = width * length * height;
		return volume;
	}
	
	public String toString() {
		return super.toString() + "가로: " + width + "세로: " +length + "높이: " + height + "부피 : " + getVolume();
	}
	
}

class Cylinder extends ThreeDimShape{
	private double radius;
	private double height;
	
	public Cylinder(int x, int y, double height, double radius) {
		super(x,y,"Cylinder");
		this.height = height;
		this.radius = radius;
	}
	public double getVolume() {
		volume = radius * radius * height * 3.14;
		return volume;
	}
	
	public String toString() {
		return super.toString() + "반지름: " + radius + "높이 : " + height + "높이: " + height + "부피 : " + getVolume();
	}
	
}



public class ShapeArrTest {

	public static void main(String[] args) {
		ShapeArr arr[] = new ShapeArr[3];
		arr[0] = new Rectangle(5, 2, 10, 5);
		arr[1] = new Triangle2(5, 2, 10, 5);
		arr[2] = new Cylinder(5, 20, 5, 30);
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] instanceof TwoDimShape)
				System.out.println(((TwoDimShape)arr[i]).getArea());
			if (arr[i] instanceof ThreeDimShape)
				System.out.println(((ThreeDimShape)arr[i]).getVolume());
		}
	}
}
