package boostcamp;
import java.util.Scanner;

public class pro5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if (a + b > c && a + c > b && b + c > a)
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 될 수 없습니다.");

	}

}
