package SsangYong220812;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("입력오류.");
			return;
		}
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0)
				System.out.println(i + " ");
				
		}

	}

}
