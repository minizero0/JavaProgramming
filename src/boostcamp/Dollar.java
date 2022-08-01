package boostcamp;
import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)");
		int price = sc.nextInt();
		System.out.println(price + "원은 $" + (double)price/1100 + "입니다.");
		
	}

}
