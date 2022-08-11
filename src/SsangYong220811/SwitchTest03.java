package SsangYong220811;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month, day;
		
		System.out.println("몇월인지 입력하세요.");
		month = sc.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("입력오류.");
			return;
		}
		
		switch(month) {
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default :
			day = 31;
		}
		
		System.out.println(month + "월은 " + day + "일까지입니다.");
	}
}
