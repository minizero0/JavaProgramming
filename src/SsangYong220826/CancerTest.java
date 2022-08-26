package SsangYong220826;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class CancerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		String code;
		System.out.println("주민번호 입력. ex) 96xxxx-1xxxxxx");
		code = sc.next();
		
		int gender = code.charAt(7)-'0';
		int age = Integer.parseInt(code.substring(0, 2));
		switch(gender) {
			case 1:System.out.println("male");age += 1900;break;
			case 2:System.out.println("femal");age += 1900;break;
			case 3:System.out.println("male");age += 2000;break;
			case 4:System.out.println("female");age += 2000;break;
		}
		System.out.println("출생연도 : " + age);

	}

}
