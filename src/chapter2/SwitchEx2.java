package chapter2;
import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 커피를 드시나요?");
		String coffee = sc.next();
		int price = 0; 
		switch(coffee) {
		case "아메리카노":
			price = 3500;
			break;
		case "카페라떼":
			price = 4000;
			break;
		case "자바칩프라푸치노":
			price = 5000;
			break;
		default:
			System.out.println("메뉴에 없는 음료 입니다.");
			
		}
		if(price != 0) 
			System.out.println("주문한" + coffee + "의 가격은\n" + price + "원 입니다.");
		
	}

}
