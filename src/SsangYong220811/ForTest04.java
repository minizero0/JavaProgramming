package SsangYong220811;
import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 1;
		System.out.println("n을 입력하세요.");
		n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			if (i == 1)
				System.out.print(i + "=");
			else
			System.out.print(i + "*");
			sum *= i;
		}
		System.out.print(sum);
	}
}