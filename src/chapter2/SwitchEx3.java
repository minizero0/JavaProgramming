package chapter2;
import java.util.Scanner;
public class SwitchEx3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("충전할 시간을 입력하세요 (1~5)");
		int addTime = sc.nextInt();
		int price = 0;
		
		switch(addTime) {
		case 5:
			price = 5000;
			break;
		case 4:
			price = 4000;
			break;
		case 3:
			price = 3000;
			break;
		case 2:
			price = 2000;
			break;
		case 1:
			price = 1000;
			break;
		default:
			System.out.println("다시 입력하세요.");
		}
		if(price!=0)System.out.println("충전할 시간의 금액은 " + price + "원 입니다.");
		
		
	}

}
