package boostcamp;
import java.util.Scanner;

public class Chap3_pro6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
		
		System.out.println("금액을 입력하시오.");
		int price = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (price/unit[i] != 0) {
				System.out.printf("%d원 짜리 : %d개\n", unit[i], price/unit[i]);
				price %= unit[i];
			}
		}
	}

}
