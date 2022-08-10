package SsangYong220810;

import java.util.Scanner;

public class MaxTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,max;
		System.out.println("첫번째 수 입력==>");
		a = sc.nextInt();
		System.out.println("두번째 수 입력==>");
		b = sc.nextInt();
		max = a;
		if (b > max) {
			max = b;
			System.out.println(max);
		}

	}

}
