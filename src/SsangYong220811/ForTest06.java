package SsangYong220811;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		int count = 0;
		System.out.println("n을 입력하세요.");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("합은 " + sum + "이고 3의 배수의 개수는 " + count + "입니다.");

	}

}
