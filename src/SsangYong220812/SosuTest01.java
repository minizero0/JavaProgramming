package SsangYong220812;

import java.util.Scanner;

public class SosuTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				cnt++;
		}
		if (cnt == 1)
			System.out.println(n + "은 소수입니다.");
		else
			System.out.println(n + "은 소수가 아닙니다.");
	}

}
