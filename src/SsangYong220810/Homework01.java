package SsangYong220810;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		int num1, num2, sum;
		
		System.out.println("연산자를 입력하세요.");
		ch = sc.next().charAt(0);
		
		System.out.println("정수 두개를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (ch == '+') 
			sum = num1 + num2;
		else if(ch == '-')
			sum = num1 - num2;
		else if(ch == '*')
			sum = num1 * num2;
		else if(ch == '/')
			sum = num1 / num2;
		else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println(num1 + " " + ch + " " + num2 + "의 결과는 = " + sum + "입니다.");

	}

}
