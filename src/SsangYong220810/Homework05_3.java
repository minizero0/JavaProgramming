package SsangYong220810;

import java.util.Scanner;

public class Homework05_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		System.out.println("점수를 입력하세요.");
		score = sc.nextInt();
		
		switch (score/10) {
		
		case 5: 
			System.out.println("안타깝게 불합격.");
			break;
		case 6: 
			System.out.println("합격.");
			break;
		case 7: 
			System.out.println("우수하게 합격.");
			break;
		case 8: 
			System.out.println("아주 우수하게 합격.");
			break;
		case 9: 
			System.out.println("아주 우수하게 합격.");
			break;
		case 10: 
			System.out.println("아주 우수하게 합격.");
			break;
		default :
			System.out.println("불합격.");
		
		}

	}

}
