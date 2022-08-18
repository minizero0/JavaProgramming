package SsangYong220818;

class Person{
	protected String name;
	protected String address;
	protected String number;
	
	public Person() {
	}
	public Person(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}

class Customer extends Person{
	private String code;
	private int mileage;
	
	public Customer() {
		
	}
	
	public Customer(String name, String address, String number, String code, int mileage) {
		super(name,address,number);
		this.code = code;
		this.mileage = mileage;
	}
	public String toString() {
		return "이름 : " + name + ", 주소 : " + address + ", 전화번호 : " + number + ", 고객코드 : " + code + "마일리지 : " 
	+ mileage + "point"; 
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

public class TeamExam {

	public static void main(String[] args) {
		Customer c1 = new Customer("tomas","seoul hongdae", "02-1234-5677", "CODE1234", 1200);
		System.out.println(c1);
	}
}
