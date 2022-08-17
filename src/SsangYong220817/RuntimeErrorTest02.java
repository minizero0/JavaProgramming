package SsangYong220817;
import java.util.Scanner;

public class RuntimeErrorTest02 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("첫번째 수 입력==>");
		a = sc.nextInt();
		System.out.println("두번째 수 입력==>");
		b = sc.nextInt(); // b를 0으로 입력하면 오류 발생.
		/*
		 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at JavaProgramming/SsangYong220817.RuntimeErrorTest.main(RuntimeErrorTest.java:14)
		 */
		// 프로그램 실행 중 나타나는 오류 예외처리를 통해 에러 처리 가능.
		
		int div = a/b;
		System.out.println("나누기 결과 :" + div);
		}catch(Exception e) {
			System.out.println("0으로 나누면 안됨.");
		}
	}

}
