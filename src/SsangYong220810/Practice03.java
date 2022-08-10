package SsangYong220810;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		int wol;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월 입니까?");
		wol = sc.nextInt();
		
		if (wol >= 1 && wol <= 12) {
			if (wol >= 3 && wol <= 5)
				System.out.println(wol + "월은 봄입니다.");
			else if(wol >= 6 && wol <= 8)
				System.out.println(wol + "월은 여름입니다.");
			else if(wol >= 9 && wol <= 11)
				System.out.println(wol + "월은 가을입니다.");
			else
				System.out.println(wol + "월은 겨울입니다.");
		}
		else
			System.out.println("입력오류!");
		
	}

}
