package SsangYong220812;

import java.util.Scanner;

public class NestedForTest02 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("별을 몇줄 출력할까요?");
		a = sc.nextInt();
		System.out.println("별을 몇줄 출력할까요?");
		b = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
