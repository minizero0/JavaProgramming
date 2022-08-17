package SsangYong220817;

class Employee {
	private String name;
	private long number;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public long getNumber() {
		return number;
	}
	public int getPrice() {
		return price;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee ym = new Employee();
		ym.setName("ym");
		ym.setNumber(0104141);
		ym.setPrice(3600);
		
		System.out.println("이름 : " + ym.getName() + "\n전화번호 : " + ym.getNumber() + "\n연봉 : " + ym.getPrice());
		

	}

}
