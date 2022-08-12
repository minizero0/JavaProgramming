package SsangYong220812;

import java.util.Scanner;

public class DoWhileTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄 수를 입력하세요 ==>");
		int N = sc.nextInt();
		
		int i = 0;
		do {
			int j = 0;
			do {
				System.out.print("*");
				j++;
			}while(j <= i);
			System.out.println();
			i++;
		}while(i < N);

	}

}
