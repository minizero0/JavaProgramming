package SsangYong220824;

import java.util.ArrayList;

class Student{
	private String name;
	private String address;
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
