package SsangYong220822;

abstract class Vehicle{
	protected int speed;
	protected String name;
	protected String color;
	
	public abstract double getKillosPerLiter();
	
	public Vehicle(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	public Vehicle() {
	}
}

interface Move{
	int speed = 100;
	public void SpeedUp(int speed);
	public void SpeedDown(int speed);
	public void printSpeed();
}

class Carr extends Vehicle implements Move{
	public Carr(String name, String color,int speed) {
		super(name, color, speed);
	}
	public Carr() {
	}
	public double getKillosPerLiter() {
		return 2;
	}
	public void turnLeft() {
		System.out.println("좌회전 합니다.");
	}
	public void turnLight() {
		System.out.println("우회전 합니다.");
	}
	public void SpeedUp(int speed) {
		System.out.println(speed + "만큼 속도 증가.");
		super.speed += speed;
	}
	public void SpeedDown(int speed) {
		System.out.println(speed + "만큼 속도 감소.");
		super.speed -= speed;
	}
	public void printSpeed() {
		System.out.println("현재속도 : " + super.speed + "km");
	}
	public void speedStop() {
		super.speed = 0;
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		Carr c = new Carr("malibu", "white", 100);
		Move c1 = new Carr("KIA", "Black", 70);
		Vehicle c2 = new Carr("Hundai", "Green", 150);
//		c.SpeedUp(20);
//		c.printSpeed();
//		c.SpeedDown(50);
//		c.printSpeed();
//		c1.SpeedDown(20);
//		c1.printSpeed();
//		((Carr)c1).speedStop();
//		c1.printSpeed();
		((Carr)c2).SpeedDown(30);
		((Carr)c2).printSpeed();

	}

}
