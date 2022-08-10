package SsangYong220810;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("정수 a를 입력하세요");
		a = sc.nextInt();
		System.out.println("정수 b를 입력하세요");
		b = sc.nextInt();
		System.out.println("정수 c를 입력하세요");
		c = sc.nextInt();
		
		if (a > b) {
			if (a > c)
				System.out.println("가장 큰 수는 " + a);
			else
				System.out.println("가장 큰 수는 " + c);
		}
		else {
			if (b > c)
				System.out.println("가장 큰 수는 " + b);
			else
				System.out.println("가장 큰 수는 " + c);
		}
				
	}

}
