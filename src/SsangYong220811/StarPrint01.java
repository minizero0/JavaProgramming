package SsangYong220811;

import java.util.Scanner;

public class StarPrint01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("별을 몇개 출력할까요?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) 
			System.out.println("*");

	}

}
