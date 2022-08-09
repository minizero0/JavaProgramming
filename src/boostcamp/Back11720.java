package boostcamp;
import java.util.Scanner;

public class Back11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String result[] = new String[number];
		int sum = 0;
		result[number] = sc.next();
		
		for (int i =0; i <number; i++) {
			sum += (int)result[i];
		}

	}

}
