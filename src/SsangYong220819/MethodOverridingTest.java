package SsangYong220819;

//하늘을 나는 새 클래스.

class Bird{
	String name;
	String color;
	boolean wing;
	public Bird() {
		
	}
	public Bird(String name, String color, boolean wing) {
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	public void fly() {
		if(wing == true) 
			System.out.println(color + "색" + name + "(이)가 훨훨난다.");
		else
			System.out.println(color + "색" + name + "(이)가 날 수 없다.");
		
	}
}

//하늘을 나는 비행기 클래스 
class Plane extends Bird{
	boolean engine;
	public Plane() {
	}
	public Plane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
	}
	public void fly() {
		if(wing == true && engine == true)
			System.out.println(color + "색" + name + "이륙.");
		else
			System.out.println(color + "색" + name + "이륙불가.");
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		Bird b1 = new Bird("딱다구리", "green", true);
		Bird b2 = new Bird("파랑새", "blue", false);
		
		b1.fly();
		b2.fly();
		
		
		Plane p = new Plane("보잉747", "하늘", true, true);
		p.fly();
	}

}
