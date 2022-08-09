package boostcamp;
import java.util.Scanner;

public class Back2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		for (int i = 0; i < test; i ++) {
			int tc = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < tc; k++)
					System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}

}
