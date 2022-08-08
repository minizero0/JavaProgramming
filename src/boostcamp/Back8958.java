package boostcamp;
import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score[] = new char[80];
		
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			score = sc.next();
			int sum = 0;
			int count = 1;
			for (int j = 0; j < score.length(); j++) {
				if (score[j] == 'O')
					sum += count++;
			}
		}

	}

}
