package SsangYong220811;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("구구단 중에서 몇단을 출력할까요?");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}

}
