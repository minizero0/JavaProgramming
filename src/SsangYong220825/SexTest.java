package SsangYong220825;

import java.util.Scanner;

public class SexTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력. ex)960000-1xxxxxx");
		String num = sc.next();
		
		if (num.length() != 14) {
			System.out.println("올바르지 않은 번호입니다. 다시 입력하세요.");
			return;
		}
		
		String s = num.substring(num.indexOf("-"), 8);
		if(s.charAt(1) == '1' || s.charAt(1) == '3' || s.charAt(1) == '5' || s.charAt(1) == '7')
			System.out.println("male");
		else if(s.charAt(1) == '2' || s.charAt(1) == '4' || s.charAt(1) == '6'|| s.charAt(1) == '8')
			System.out.println("female");
	}

}
