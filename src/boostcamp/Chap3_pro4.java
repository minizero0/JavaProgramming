package boostcamp;
import java.util.Scanner;

public class Chap3_pro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하시오.");
		
		char a = sc.next().charAt(0);
		for (int i = 0; i <= a - 'a'; i++) {
			for (char j = 'a'; j <= a - i; j++)
				System.out.print(j);
			System.out.println();
		}
	}

}
