package SsangYong220812;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, sum = 1;
		System.out.println("N을 입력하세요==>");
		N = sc.nextInt();
		
		while (N > 0) {
			sum *= N;
			if (N == 1) 
				System.out.print(N + "=");
			else
				System.out.print(N + "*");
			N--;
		}
		System.out.print(sum);

	}

}
