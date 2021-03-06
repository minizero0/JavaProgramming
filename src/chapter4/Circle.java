package chapter4;

public class Circle {
	int radius;
	String name;
	
	public Circle(){
		
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	

	public static void main(String[] args) {
		Circle pizza = new Circle();
		
		pizza.radius=10;
		pizza.name = "sexy";
		
		System.out.println(pizza.name+"피자의 면적은: "+pizza.getArea());
		
		Circle ball = new Circle();
		ball.name = "축구공";
		ball.radius = 15;
		System.out.println(ball.name + "의 면적은" + ball.getArea());
	}

}
