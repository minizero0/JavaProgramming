package SsangYong220826;

import java.util.Scanner;

public class ValidCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력하세요 ==> ex)96xxxx-1xxxxxx");
		String code = sc.next();
		int n = 2 , sum = 0;
		for (int i = 0; i < code.length() - 1; i++) {
			if (n == 10)
				n = 2;
			if (code.charAt(i) != '-')
				sum += (code.charAt(i) - '0') * n++;
		}
		int last = 11 - sum%11;
		if (last != code.charAt(code.length()-1) -'0')
			System.out.println("잘못된 주민번호");
		else
			System.out.println("");
		
	}
}
