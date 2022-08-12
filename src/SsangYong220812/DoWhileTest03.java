package SsangYong220812;

import java.util.Scanner;

public class DoWhileTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1, sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= N);
			System.out.println(sum);
	}
}
