package SsangYong220826;

import java.util.Scanner;

public class TeamExam02 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int	number1, number2, result;
		try {
		System.out.println("첫 번째 정수");
		number1 = sc.nextInt();
		System.out.println("두 번째 정수");
		number2 = sc.nextInt();
		
		result = number1/number2;
		System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println("문자열을 정수로 나눌 수 없다.");
		}
	}

}
