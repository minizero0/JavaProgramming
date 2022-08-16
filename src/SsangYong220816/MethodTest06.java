package SsangYong220816;

import java.util.Scanner;

public class MethodTest06 {
	//임의의 수를 N을 전달받아 1~n까지의 합을 누적하여 출력하는 메소드.
	static void sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println(sum);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum(n);
		sum(5);
		sum(10);
	}
}