package SsangYong220819;

class Product{
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	};


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "물건 이름: " + name + ", 가격 : " + price;
	}
}

class DiscountProduct extends Product{
	private double discount;
	private double result;
	
	public DiscountProduct(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	
	public double getPrice() {	
		result = price - (price * discount);
		return result;
	}
	
	public String toString() {
		return super.toString() + ", 할인된 가격 :" + getPrice();
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("toothbrush", 3000);
		Product p2 = new DiscountProduct("toothbrush", 3000, 0.15);
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
