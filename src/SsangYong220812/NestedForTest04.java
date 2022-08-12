package SsangYong220812;
import java.util.Scanner;

public class NestedForTest04 { //약수출력 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println("\n" + n + "의 약수의 개수 = " + cnt);
	}
}
