package chapter3;
import java.util.Scanner;
//정수 5개 출력 프로그램

public class ContinueEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i =0; i<5; i++) {
			System.out.println("정수 입력");
			int n = sc.nextInt();
			if(n<=0)
				continue;
			else
				sum  += n;
		}
		System.out.println("입력한 정수의 합은: " +sum);
	
	}
}
