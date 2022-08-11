package SsangYong220811;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch (num) {
			case 2:System.out.println("1등 당첨!.");break;
			case 5:System.out.println("5등 당첨!.");break;
			case 7:System.out.println("3등 당첨!.");break;
			default :System.out.println("탈락입니다.");
		}

	}

}
