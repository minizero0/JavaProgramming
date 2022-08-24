package SsangYong220824;

import java.util.ArrayList;
import java.util.Scanner;
/*
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
*/
public class StudentTest02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("학생 정보를 입력하세요. [종료:Exit]\n이름:");
			String name = sc.next();
			if (name.equals("exit"))
				break;
			System.out.println("주소:");
			String address = sc.next();
			System.out.println("전화번호:");
			String number = sc.next();
			list.add(new Student(name, address, number));
		}
		System.out.println("*** 학생 목록 ***");
		System.out.println("이름\t주소\t전화");
		
		for (Student a : list)
			System.out.println(a.getName() + "\t" + a.getAddress() + "\t" + a.getNumber() + "\t");

	}

}
