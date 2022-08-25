package SsangYong220825;
//주민번 3,4,5,6,7,8 을 적하여 성별과 나이 판별 출력 .
import java.util.Scanner;
public class TeamExam {
	
	public static void getAge(int n) {
		System.out.println("age : " + (122 - n));
	}
	
	public static void getSex(char ch) {
		if(ch == '1' || ch == '3' || ch == '5' || ch == '7')
			System.out.println("sex : male");
		else if(ch == '2' || ch == '4' || ch == '6'|| ch == '8')
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
		
		getSex(s1.charAt(1));
		getAge(Integer.parseInt(s2));
	}
}
