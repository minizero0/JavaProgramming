package SsangYong220818;

class Plane{
	private String company;
	private String model;
	private int number;
	public static int planes;
	
	public static int getPlanes() {
		return planes;
	}
	
	public boolean ifNumber(int number) {
		if (number > 500) {
			System.out.println("승객수가 잘못 입력되었습니다.");
			return false;
		}else
			return true;
	}
	
	public Plane() {
		planes++;
	}
	
	public Plane(String company, String model, int number) {
		if (ifNumber(number) == false)
			return;
		this.company = company;
		this.model = model;
		this.number = number;
		planes++;
	}
	public Plane(String company) {
		this.company = company;
		model = "AirPorce";
		number = 500;
		planes++;
	}
	public Plane(String company, String model) {
		this.company = company;
		this.model = model;
		number = 500;
		planes++;
	}
	public Plane(String company, int number) {
		this.company = company;
		this.number = number;
		model = "Debian";
		planes++;
	}
	public Plane (int number) {
		this.number = number;
		company = "AmericaAirPlane";
		model = "A380";
		planes++;
	}
	
	public String toString() {
		return "company : " + company + ", model : " + model + ", number : " + number;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane("Asiana", "A230", 65);
		Plane p2 = new Plane("KoreaAir", "A230");
		Plane p3 = new Plane(365);
		Plane p4 = new Plane();
		Plane p5 = new Plane("NewYork", 400);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		System.out.println("생성된 비행기 : " + Plane.getPlanes());
		System.out.println("생성된 비행기 : " + Plane.planes);
	}
}