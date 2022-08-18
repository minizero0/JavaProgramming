package SsangYong220818;

class Food{
	protected double cal;
	protected int price;
	protected double weight;
	
	public Food(double cal, int price, double weight) {
		this.cal = cal;
		this.price = price;
		this.weight = weight;
		System.out.println("새로운 생성자 호출");
	}
	public Food() { //위의 생성자를 생성하면 매개변수가 없는 생성자를 생성해주는게 좋음.
		System.out.println("기본생성자호출.");
	}
	
}

class Melon extends Food {
	
	private String farm;
	
	public Melon(double cal, int price, double weight, String farm) {
		super(cal,price,weight); // 선언하지 않으면 super() 생략되어있음. 반드시 첫번째 문장에 와야함.
		//부모클래스의 매개변수를 갖는 생성자를 요구함.
		
	
		this.farm = farm;
	}
	
	public String toString() {
		return "칼로리 : " + cal + "cal, 가격 : " + price + "won, 무게 : " + weight + "g, 경작 농원 : " + farm;
	}
	
}

public class MelonTest {

	public static void main(String[] args) {
		Melon m1 = new Melon(200, 3000, 200, "구로 과수원");
		Melon m2 = new Melon(100, 10000, 500, "구로 과수원");
		System.out.println(m1);
		System.out.println(m1.cal);
		System.out.println(m2);
		System.out.println(m2.cal);
		System.out.println(m1.cal);
	}

}
