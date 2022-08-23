package SsangYong220823;

import java.util.Scanner;

//사용자한테 암호와 암호확인을 입력받아 서로 동일한지 판별하는 pg 작성

public class StringEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pw, pw2;
		System.out.println("암호를 설정하세요.");
		pw = sc.next();
		
		System.out.println("암호확인.");
		pw2 = sc.next();
		
		if (pw.equals(pw2))
			System.out.println("동일합니다.");
		else
			System.out.println("잘못된 암호입니다.");

	}

}
