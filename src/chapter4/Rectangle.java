package chapter4;
import java.util.Scanner;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle() {
		
	}
	public double getArea() {
		return width*height;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle nemo = new Rectangle();
		System.out.print("높이:");
		nemo.height =sc.nextDouble();
		System.out.print("길이:");
		nemo.width = sc.nextDouble();
		
		System.out.println(nemo.getArea());
		
	}

}
