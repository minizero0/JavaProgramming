package SsangYong220811;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("입력오류");
			return;
		}
		
		for (int i = 1; i < num; i++)
		{
			if (i % 3 == 0)
				System.out.print(i + " ");
		}

	}

}
