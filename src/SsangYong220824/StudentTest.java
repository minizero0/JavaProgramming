package SsangYong220824;

import java.util.ArrayList;

class Student{
	private String name;
	private String address;
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
	private String number;
	
	public Student(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public String toString() {
		return "이름: " + name + ", 주소: " + address + ", 전화번호: " + number; 
	}
}

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("jennie", "seoul mapo", "01023334555"));
		list.add(new Student("jisoo", "seoul yongsan", "01041418894"));
		list.add(new Student("lisa", "incheon bupyeong", "01056662333"));
		
		for (Student a : list)
			System.out.println(a);

	}

}
