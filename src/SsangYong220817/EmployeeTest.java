package SsangYong220817;

class Employee {
	private String name;
	private String number;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
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
		ym.setNumber("01041418894");
		ym.setPrice(3600);
		
		System.out.println("이름 : " + ym.getName() + "\n전화번호 : " + ym.getNumber() + "\n연봉 : " + ym.getPrice());
		

	}

}
