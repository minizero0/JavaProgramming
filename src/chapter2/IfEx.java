package chapter2;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}
