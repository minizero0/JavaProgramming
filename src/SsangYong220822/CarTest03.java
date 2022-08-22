package SsangYong220822;

interface Movable2{
	int speed = 100;
	public void speedUp(int amount);
	public void speedDown(int amount);
	public void printSpeed();
}

class Car1 implements Movable2{
	private String name;
	private String color;
	
	public Car1(String name, String color) {
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

public class CarTest03 {

	public static void main(String[] args) {
		Movable2 m = new Car1("asd","green");
		//Car c = m; -> 오류발생.
		Car c = (Car)m;  //형변환 후 대입해줘야한다.
		//부모의 참조변수가 자식클래스의 객체를 참조할 수 있다.
		//그렇다 하더라도 그 변수를 자식클래스의 변수에 바로 대입할 수 없다.
		//자식클래스형으로 형변환하여 대입할 수 있다.
		
		
	}

}
