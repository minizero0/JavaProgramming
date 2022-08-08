package boostcamp;
import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String score;
		
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int sum = 0;
			int count = 1;
			score = sc.next();
			for (int j = 0; j < score.length(); j++) {
				if (score.charAt(j) == 'O')
					sum += count++;
				else if(score.charAt(j) == 'X')
					count = 1;
			}
			System.out.println(sum);
		}

	}

}
