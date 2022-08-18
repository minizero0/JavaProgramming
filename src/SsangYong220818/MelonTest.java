package SsangYong220818;

class Food{
	protected double cal;
	protected int price;
	protected double weight;
	
	public Food(double cal, int price, double weight) {
		this.cal = cal;
		this.price = price;
		this.weight = weight;
	}
	public Food() {
		
	}
	
}

class Melon extends Food {
	
	private String farm;
	
	public Melon(double cal, int price, double weight, String farm) {
		super(100,10000,150); // 선언하지 않으면 super() 생략되어있음.
		
//		this.cal = cal;
//		this.price = price;
//		this.weight = weight;
		this.farm = farm;
	}
	
	public String toString() {
		return "칼로리 : " + cal + "cal, 가격 : " + price + "won, 무게 : " + weight + "g, 경작 농원 : " + farm;
	}
	
}

public class MelonTest {

	public static void main(String[] args) {
		Melon m1 = new Melon(200, 3000, 200, "구로 과수원");
		System.out.println(m1);
		

	}

}
