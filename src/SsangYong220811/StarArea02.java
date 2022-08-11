package SsangYong220811;

import java.util.Scanner;

public class StarArea02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String star;
		int month, day;
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("몇월에 태어났나요.");
		month = sc.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("입력오류.");
			return;
		}
		
		int last = 31;
		switch(month) {
			case 4:case 6: case 9: case 11:last = 30;break;
			case 2:last = 28;
		}
		
		System.out.println("몇일에 태어났나요.");
		day = sc.nextInt();
		
		if (day > last) {
			System.out.println("입력된 날짜가 범위를 넘었습니다.");
			return;
		}
		
		switch (month) {
		case 1:if (day <= 19) star = "염소자리";else star = "물병자리";break;
		case 2:if (day <= 18) star = "물병자리";else star = "물고기자리";break;	
		case 3: if (day <= 20) star = "물고기자리";else star = "양자리";break;	
		case 4:if (day <= 19) star = "양자리";else star = "황소자리";break;
		case 5:if (day <= 20) star = "황소자리";else star = "쌍둥이자리";break;
		case 6:if (day <= 21) star = "쌍둥이자리";else star = "게자리";break;
		case 7:if (day <= 22) star = "게자리";else star = "사자자리";break;
		case 8:if (day <= 22) star = "사자자리";else star = "처녀자리";break;
		case 9:if (day <= 23) star = "처녀자리";else star = "전갈자리";break;
		case 10:if (day <= 22) star = "전갈자리";else star = "천칭자리";break;
		case 11:if (day <= 22) star = "천칭자리";else star = "사수자리";break;
		case 12:if (day <= 24) star = "사수자리";else star = "염소자리";break;
		default:return;
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
