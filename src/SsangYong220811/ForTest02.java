package SsangYong220811;
import java.util.Scanner;
public class ForTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("1부터 어디까지 더할까요?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++)
			sum += i;
//		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
	}
}
