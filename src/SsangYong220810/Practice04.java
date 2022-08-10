package SsangYong220810;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,max;
		System.out.println("정수 a를 입력하세요");
		a = sc.nextInt();
		System.out.println("정수 b를 입력하세요");
		b = sc.nextInt();
		System.out.println("정수 c를 입력하세요");
		c = sc.nextInt();
		
		if (a > b) {
			if (a > c)
				max = a;
			else
				max = c;
		}
		else {
			if (b > c)
				max = b;
			else
				max = c;
		}
		System.out.println("가장 큰 수는 " + max);
				
	}

}
