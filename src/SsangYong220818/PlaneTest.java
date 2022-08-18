package SsangYong220818;

class Plane{
	private String company;
	private String model;
	private int number;
	public static int planes = 1;
	
	public static int getPlanes() {
		return planes;
	}
	
	public Plane() {
	}
	
	public Plane(String company, String model, int number) {
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
		Plane p1 = new Plane("Asiana", "A230", 365);
		Plane p2 = new Plane("KoreaAir", "A230");
		Plane p3 = new Plane(365);
		Plane p4 = new Plane();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println("생성된 비행기 : " + Plane.getPlanes());

	}

}
