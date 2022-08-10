package SsangYong220810;
import java.util.Scanner;

public class HongdaeNight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름과 나이를 입력하세요.");
		name = sc.next();
		age = sc.nextInt();
		
		if (age >= 20)
			System.out.println(name + "님 입장가능");
		else
			System.out.println(name + "님 입장불가능");

	}

}
