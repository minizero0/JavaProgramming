package boostcamp;
import java.util.Scanner;

public class Program_Ssang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int number = sc.nextInt();
		
		if (number >= 0 )
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");

	}

}
