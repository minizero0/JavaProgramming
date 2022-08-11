package SsangYong220811;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("문자를 입력하세요.");
		ch = sc.next().charAt(0);
		
		switch (ch) {
			case 'R':
				System.out.println("사각형 면적계산");
				break;
			case 'T':
				System.out.println("삼각형 면적계산");
				break;
			case 'C':
				System.out.println("원 면적계산");
				break;
			default:
				System.out.println("잘못된 입력.");
		}

	}

}
