package boostcamp;
import java.util.Scanner;

public class Chap3_pro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int number = sc.nextInt();
		
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
