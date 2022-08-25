package SsangYong220825;

import java.util.Scanner;

//주민번호를 통해 성별과 나이 판별 출력 .
public class TeamExam {
	
	public static void getAge(int n) {
		System.out.println("age : " + (122 - n));
	}
	public static void millGetAge(int n) {
		System.out.println("age : " + (22 - n));
	}
	
	public static void getSex(int ch) {
		if(ch % 2 == 1)
			System.out.println("sex : male");
		else if(ch % 2 == 0)
			System.out.println("set : female");
		else
			System.out.println("input error");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력. ex)960000-1xxxxxx");
		String num = sc.next();
		
		if (num.length() != 14) {
			System.out.println("올바르지 않은 번호입니다. 다시 입력하세요.");
			return;
		}
		String s1 = num.substring(num.indexOf("-"), 8);
		String s2 = num.substring(0, 2); 
		if((s1.charAt(1)) == '3' || (int)(s1.charAt(1)) == '4')
			millGetAge(Integer.parseInt(s2));
		else	
			getAge(Integer.parseInt(s2));
		
		getSex((int)s1.charAt(1));
		
	}
}
