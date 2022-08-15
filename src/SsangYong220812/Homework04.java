package SsangYong220812;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		double prod = 1.0, r;
		int i, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 r: ");
		r = sc.nextDouble();
		System.out.println("거듭제곱횟수 n: ");
		n = sc.nextInt();
		
		for (i = 0;i < n; i++)
			prod *= r;
		System.out.println(prod);

	}

}
