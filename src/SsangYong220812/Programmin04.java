package SsangYong220812;

import java.util.Scanner;

public class Programmin04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, c = 1;
		
		System.out.println("몇 항까지 출력하시겠습니까.");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			long temp;
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
			
			
		}

	}

}
