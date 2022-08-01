package boostcamp;
import java.util.Scanner;

public class pro6 {

	public static void main(String[] args) {
		System.out.println("1~99 사이의 정수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		if (number % 10 == 3 || number % 10 == 6 || number % 10 == 9)
			System.out.print("박수짝");
		
		if (number / 10 == 3 || number / 10 == 6 || number / 10 == 9)
			System.out.println("짝");
		else
			System.out.println();

	}

}
