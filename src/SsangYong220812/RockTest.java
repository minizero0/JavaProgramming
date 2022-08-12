package SsangYong220812;

import java.util.Scanner;

public class RockTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str_user = " ", str_com = " ";
		int com = (int)(Math.random()*3);
		System.out.println("0, 1, 2 중에 입력.");
		int user = sc.nextInt();
		
		switch(user) {
			case 0:str_user = "바위";break;
			case 1:str_user = "가위";break;
			case 2:str_user = "보";break;
		}
		
		switch(com) {
			case 0:str_com = "바위";break;
			case 1:str_com = "가위";break;
			case 2:str_com = "보";break;
		}
		System.out.println("나는 " + str_user);
		System.out.println("컴퓨터 " + str_com);
		
		if (user == com) 
			System.out.println("비겼습니다.");
		else if((user == 0 && com ==2) || (user == 1 && com == 0) || (user ==2 && com == 1))
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("컴퓨터가 이겼습니다.");

	}

}
