package SsangYong220810;
import java.util.Scanner;

public class Homework05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		System.out.println("성적을 입력하시오:");
		score = sc.nextInt();
		
		System.out.println(score >= 60 ? "합격" : "불합격");

	}

}
