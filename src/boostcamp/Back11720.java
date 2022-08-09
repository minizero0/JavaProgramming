package boostcamp;
import java.util.Scanner;

public class Back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		char result[] = new char[number];
		for (int i = 0; i < number; i++) {
			result[i] = sc.next().charAt(0);
		}
		
		System.out.printf("%c", result[0]);
	}

}
