package SsangYong220810;
import java.util.Scanner;

public class HongdaeNight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age, height;
		System.out.println("이름과 나이, 키를 입력하세요.");
		name = sc.next();
		age = sc.nextInt();
		height = sc.nextInt();
		
		if (20 <= age && age <= 30 && height >= 165)
			System.out.println(name + "님 입장가능");
		else
			System.out.println(name + "님 입장불가능");

	}

}
