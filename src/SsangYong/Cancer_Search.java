package SsangYong;
import java.util.Scanner;
import java.util.Date;

public class Cancer_Search {

	public static void main(String[] args) {
		Date year = new Date();
		Scanner sc = new Scanner(System.in);
		int thisYear = year.getYear() + 1900;
		String name;
		int birth;
		System.out.println("이름과 출생연도를 입력하세요");
		name = sc.next();
		birth = sc.nextInt();
		if (thisYear - birth >= 40)
			System.out.println(name + "님은 대상자입니다.");
		else
			System.out.println(name + "님은 대상자가 아닙니다.");

	}

}
