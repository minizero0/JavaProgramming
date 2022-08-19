package SsangYong220819;

abstract class Vechicle{
	int speed;
	public abstract double getKillosPerLiter();
	
	public void printSpeed() {
		System.out.println(speed);
	}
	public Vechicle(int speed) {
		this.speed = speed;
	}
}

class Car extends Vechicle{
	public Car(int speed) {
		super(speed);
	}
	public double getKillosPerLiter(){
		return speed;
	}
}

public class VechicleTest {

	public static void main(String[] args) {
		Car c = new Car(100);
		c.printSpeed();
		System.out.println(c.getKillosPerLiter());
		

	}

}
