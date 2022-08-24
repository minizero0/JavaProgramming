package SsangYong220824;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest03 {
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("1: 추가, 2:출력, 3:검색, 4:삭제, 0:종료");
	}
	
	public static void insertStudent(ArrayList<Student> list) {
		System.out.println("학생 정보를 입력하세요.\n이름:");
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
	
	public static void searchStudent(ArrayList<Student> list) {
		String sName;
		System.out.println("검색하려는 학생의 이름을 입력하세요.");
		sName = sc.next();
		for (Student a : list) {
			if (a.getName().equals(sName)) {
				System.out.println(a);
				return;
			}
		}
		System.out.println("존재하는 이름이 없습니다.");
	}
	
	public static void removeStudent(ArrayList<Student> list) {
		String sName;
		System.out.println("삭제하려는 학생의 이름을 입력하세요.");
		sName = sc.next();
		for (Student a : list) {
			if (a.getName().equals(sName)) {
				list.remove(a);
				return;
			}
		}
		System.out.println("존재하는 이름이 없습니다.");
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
				case 3:searchStudent(list);break;
				case 4:removeStudent(list);break;
			}
		}
	}
}