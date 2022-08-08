package SsangYong;
import java.util.Scanner;

public class Pdf7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		
		System.out.println("컴퓨터 개론 과목의 점수를 입력하시오: ");
		int 컴퓨터개론 = sc.nextInt();
		System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오: ");
		int C언어 = sc.nextInt();
		System.out.println("영어 과목의 점수를 입력하시오: ");
		int 영어 = sc.nextInt();
		System.out.println("일반 수학 과목의 점수를 입력하시오: ");
		int 일반수학 = sc.nextInt();
		sum = 컴퓨터개론 + C언어 + 영어 + 일반수학;
		System.out.println("평균 점수는 " + sum/4f + "점입니다.");
	}
}
