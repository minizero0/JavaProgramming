package SsangYong220818;

class Food{
	protected int cal;
	protected int price;
	protected int weight;
	
}

class Melon extends Food {
	
	private String farm;
	
	public Melon(int cal, int price, int weight, String farm) {
		this.cal = cal;
		this.price = price;
		this.weight = weight;
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
