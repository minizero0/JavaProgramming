package SsangYong220822;

interface Movable1{
	int speed = 100;
	public void speedUp(int amount);
	public void speedDown(int amount);
	public void printSpeed();
}

class Car implements Movable1{
	private String name;
	private String color;
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void turnLeft() {
		System.out.println("좌회전 합니다.");
	}
	public void turnLight() {
		System.out.println("우회전 합니다.");
	}
	public void speedUp(int amount) {
		System.out.println(amount + "만큼 속도 증가.");
	}
	public void speedDown(int amount) {
		System.out.println(amount + "만큼 속도 감소.");
	}
	public void printSpeed() {
	}
}

public class CarTest02 {

	public static void main(String[] args) {
		Car c1 = new Car("malibu", "white");
		c1.speedUp(20);
		c1.speedDown(20);
		c1.turnLeft();
		c1.turnLight();
		Movable1 m = new Car("BMW", "Black");
		//Movable 인터페이스는 Car클래스의 부모이므로
		//클래스의 참조변수가 Car의 객체를 생성할 수 있다.
		m.speedUp(100);
		
		m.turnLeft();
		//Error => Movable1 인터페이스에서는 turnLeft메소드가 선언되어 있지 않다.
		//movable 인터페이스를 구현한 자식클래스인 Car에 추가한 메소드이다.
		//자식클래스에 추가한 메소드는 부모의 참조변수를 통해서 호출 불가능.
		((Car)m).turnLeft();
		//부모의 참조변수를 통해 자식객체를 참조하고 있을때.
		//자식클래스에서 추가된 메소드를 호출하려면 자식클래스형으로 형변환 후 호출해야한다.
		
	}

}
