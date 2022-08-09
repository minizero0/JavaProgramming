package SsangYong;
import java.util.Scanner;

public class Exam04 {
	static final double WIDTH = 3.3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input;
		double result;
		System.out.println("땅의 평수를 입력하시오.");
		input = sc.nextDouble();
		result = input * WIDTH;
		System.out.println(input + "평 땅은 " + result +  "평방미터 입니다.");
	}
}
