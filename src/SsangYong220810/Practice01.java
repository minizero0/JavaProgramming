package SsangYong220810;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 200;
		int sum = a * b;
		if (a >= 10)
			sum = sum - (int)(sum*0.1);
		System.out.println(sum);

	}

}
