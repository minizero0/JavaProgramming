package boostcamp;
import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오");

		int price = sc.nextInt();
		
		while (price > 0) {
			int count = 0;
			if (price >= 50000) {
				count = price / 50000;
				price %= 50000;
				System.out.println("오만원권" + count + "매");
			}
			if (price >= 10000) {
				count = price / 10000;
				price %= 10000;
				System.out.println("만원권" + count + "매");
			}
			if (price >= 1000) {
				count = price / 1000;
				price %= 1000;
				System.out.println("천원권" + count + "매");
			}
			
		}
		
		
	}

}
