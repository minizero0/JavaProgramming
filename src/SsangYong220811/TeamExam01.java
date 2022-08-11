package SsangYong220811;
import java.util.Scanner;

public class TeamExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum1=0, sum2=0, cnt1 = 0, cnt2 = 0;
		
		System.out.println("n을 입력하세요.");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum1 += i;
				cnt1++;
			}	
			else {
				sum2 += i;
				cnt2++;
			}
		}
		System.out.printf("1부터 n까지의 짝수합: %d, 짝수의 개수: %d\n", sum1, cnt1);
		System.out.printf("1부터 n까지의 홀수합: %d, 홀의 개수: %d", sum2, cnt2);
	}

}
