package SsangYong;
import java.util.Scanner;

public class Cancer_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		int birth;
		System.out.println("이름과 출생연도를 입력하세요");
		name = sc.next();
		birth = sc.nextInt();
		if (2022 - birth >= 40)
			System.out.println(name + "님은 대상자입니다.");
		else
			System.out.println(name + "님은 대상자가 아닙니다.");

	}

}
