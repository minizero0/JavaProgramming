package SsangYong220817;
import java.util.Scanner;

public class RuntimeErrorTest {

	public static void main(String[] args) {
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
		
		int div = a/b;
		System.out.println("나누기 결과 :" + div);

	}

}
