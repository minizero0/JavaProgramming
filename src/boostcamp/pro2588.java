package boostcamp;

import java.util.Scanner;

public class pro2588 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum = 0;
		while (b > 0) {
			int c = 0;
			c = b % 10;
			c *= a;
			sum += c;
			b /= 10;
			System.out.println(c);
		}
		System.out.println(sum);
	}

}
