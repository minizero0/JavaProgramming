package SsangYong220823;

import java.util.Random;
import java.util.Scanner;

public class TeamExam {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int n = r.nextInt(100)+1;
		int cnt = 0;
		
		while (true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			cnt++;
			if (num == n)
				break;
			else if (num < n)
				System.out.println("UP");
			else
				System.out.println("DOWN");
		}
		System.out.println("총 시도 :" + cnt);
	}

}
