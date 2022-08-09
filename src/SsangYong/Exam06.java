package SsangYong;
import java.util.Scanner;
import java.util.Date;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		
		int thisYear = today.getYear() + 1900;
		String name;
		int year;
		int age;
		
		System.out.println("이름과 생년원일 입력>>");
		name = sc.next();
		year = sc.nextInt();
		
		age = thisYear - year;
		
		if (age >= 40 && thisYear % 2 == year % 2) {
			System.out.println("검사 대상자입니다.");
		}
		else
			System.out.println("대상자가 아닙니다.");

	}

}
