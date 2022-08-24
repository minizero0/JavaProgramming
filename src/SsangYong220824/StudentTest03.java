package SsangYong220824;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest03 {
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("1: 추가, 2:출력, 0:종료");
	}
	
	public static void insertStudent(ArrayList<Student> list) {
		System.out.println("학생 정보를 입력하세요. [종료:Exit]\n이름:");
		String name = sc.next();
		System.out.println("주소:");
		String addr = sc.next();
		System.out.println("전화번호:");
		String number = sc.next();
		list.add(new Student(name, addr, number));
	}

	public static void printStudent(ArrayList<Student> list) {
		System.out.println("*** 학생 목록 ***");
		System.out.println("이름\t주소\t전화");
		
		for (Student a : list)
			System.out.println(a.getName() + "\t" + a.getAddress() + "\t" + a.getNumber() + "\t");
	}
	

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		int sel;
		
		while(true){
			menu();
			sel = sc.nextInt();
			if (sel == 0)
				break;
			switch(sel) {
				case 1:insertStudent(list);break;
				case 2:printStudent(list);break;
			}
		}
	}
}