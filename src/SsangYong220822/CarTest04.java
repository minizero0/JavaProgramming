package SsangYong220822;

interface Movable3{
	int speed = 100;
	public void speedUp(int amount);
	public void speedDown(int amount);
	public void printSpeed();
}

class Car2 implements Movable3{
	private String name;
	private String color;
	
	public Car2(String name, String color) {
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

public class CarTest04 {

	public static void main(String[] args) {
		Car2 c = new Car2("hundai", "cahcol");
		Movable3 m = c;  //부모의 참조변수는 자식클래스의 객체를 참조할 수 있다.
		((Car2)m).turnLeft();
		Movable3 m1 =  (Movable3)c;
		m.speedUp(100);
		
	}

}
