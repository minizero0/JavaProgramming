package SsangYong220826;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class CancerTest02 {
	
	public static boolean valid(String code) {
		int n = 2, sum = 0;
		boolean isFlag = false;
		for (int i = 0; i < code.length()-1; i++) {
			if (n==10)
				n = 2;
			if (code.charAt(i) != '-')
				sum += (code.charAt(i) -'0') * n++;
		}
		int check = 11 - sum%11;
		if (check == code.charAt(code.length()-1)-'0')
			isFlag = true;
		return isFlag;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		String code;
		
		System.out.println("주민번호 입력. ex) 96xxxx-1xxxxxx");
		code = sc.next();
		
		if (valid(code))
			System.out.println("올바른 주민번호입니다.");
		else {
			System.out.println("잘못된 주민번호입니다. 다시 입력하세요.");
			return;
		}
		
		int gender = code.charAt(7)-'0';
		int year = Integer.parseInt(code.substring(0, 2));
		
		switch(gender) {
			case 1:System.out.println("male");year += 1900;break;
			case 2:System.out.println("femal");year += 1900;break;
			case 3:System.out.println("male");year += 2000;break;
			case 4:System.out.println("female");year += 2000;break;
		}
			
		System.out.println("출생년도 : " + year);
		int age = cal.get(cal.YEAR) - year;
		System.out.println("나이 : " + age);
	
		if (age < 40 || cal.get(cal.YEAR) % 2 != year % 2 )
			System.out.println("암검진 대상자가 아닙니다.");
		else {
			String check = "위암,간암";
			if (age >= 50)
				check += ",대장암";
			if (gender == 2 || gender == 4)
				check += ",유방암,자궁암";
			System.out.println("무료암건진 대상자입니다.");
			System.out.println("검진항목은 " + check + "입니다.");
		}
	}

}
