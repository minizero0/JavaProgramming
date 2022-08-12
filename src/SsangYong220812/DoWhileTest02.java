package SsangYong220812;

import java.util.Scanner;

public class DoWhileTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i = 1 ;
		System.out.println("구구단 중에 몇단을 출력할까요?");
		n = sc.nextInt();
		
		do {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
			i++;
		}while(i < 10);
		System.out.println("종료");

	}

}
