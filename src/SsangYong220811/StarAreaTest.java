package SsangYong220811;

import java.util.Scanner;

public class StarAreaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String star;
		int month, day;
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("몇월에 태어났나요.");
		month = sc.nextInt();
		System.out.println("몇일에 태어났나요.");
		day = sc.nextInt();
		
//		if (month < 1 || month > 12) {
//			System.out.println("입력오류.");
//			return;
//		}
//		
//		if (day < 1 || day > 31) {
//			System.out.println("입력오류.");
//			return;
//		}
		switch (month) {
		case 1:if (day >= 20 && day<= 31) star = "물병자리";else return;break;
		case 2:if (day <= 18) star = "물병자리";else star = "물고기자리";break;	
		case 3: if (day <= 20) star = "물고기자리";else star = "양자리";break;	
		case 4:if (day <= 19) star = "양자리";else return;break;	
		default : return;
		}
		
//		if ((month == 1 && (day >= 20 && day <= 31)) || month == 2 && (day >=1 && day <=18))
//			star = "물병자리";
//		else if((month == 2 && (day >=19 && day <=31)) || month == 3 &&(day >= 1 && day <= 20))
//			star = "물고기자리";
//		else if ((month == 3 && (day >=21 && day <= 30)) && month == 4 && (day >= 1 && day <= 19))
//			star = "양자리";
//		else
//			return;
		System.out.println(name + "님의 별자리는 " + star + "입니다.");
	}
}
