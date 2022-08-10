package SsangYong220810;

import java.util.Scanner;

public class Homework05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		System.out.println("성적을 입력하시오:");
		score = sc.nextInt();
		if (score>=60) {
			System.out.println("합격!");
			System.out.println("축하합니다.");
		}
		else
			System.out.println("불합격!");

	}

}
