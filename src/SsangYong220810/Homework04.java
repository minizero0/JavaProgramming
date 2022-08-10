package SsangYong220810;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,sum;
		System.out.println("x값을 입력하세요.");
		x = sc.nextDouble();
		
		if (x <= 0)
			sum = x*x*x -(9*x) + 2;
		else
			sum = (7*x) + 2;
		System.out.println("결과는 = " + sum);

	}

}
