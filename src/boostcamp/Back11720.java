package boostcamp;
import java.util.Scanner;

public class Back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String result = sc.next();
		sc.close();
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += result.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
