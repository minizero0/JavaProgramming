package SsangYong220810;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.println("3개의 정수를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b && a < c)
			min = a;
		else if (b < a && b < c)
			min = b;
		else
			min = c;
		
		System.out.println("가장 작은 값은 = " + min);

	}

}
