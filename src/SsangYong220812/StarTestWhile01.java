package SsangYong220812;

import java.util.Scanner;

public class StarTestWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("별을 몇줄 출력할까요?");
		a = sc.nextInt();
		System.out.println("별을 몇칸 출력할까요?");
		b = sc.nextInt();
		
		while (a > 0) {
			int i = 0;
			while (i < b) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			a--;
		}

	}

}
