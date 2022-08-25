package SsangYong220825;
//주민번 3,4,5,6,7,8 을 적하여 성별과 나이 판별 출력 .
import java.util.Scanner;

public class TeamExam {
	
	public static int getAge(int n) {
		return 122 - n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력. ex)960000-1xxxxxx");
		String num = sc.next();
		
		if (num.length() != 14) {
			System.out.println("올바르지 않은 번호입니다. 다시 입력하세요.");
			return;
		}
		
		String s = num.substring(num.indexOf("-"), 8);
		String s2 = num.substring(0, 2); 
		
		int age = getAge(Integer.parseInt(s2));
		if(s.charAt(1) == '1' || s.charAt(1) == '3' || s.charAt(1) == '5' || s.charAt(1) == '7')
			System.out.println("male");
		else if(s.charAt(1) == '2' || s.charAt(1) == '4' || s.charAt(1) == '6'|| s.charAt(1) == '8')
			System.out.println("female");
		System.out.println("age : " + age);
	}

}
