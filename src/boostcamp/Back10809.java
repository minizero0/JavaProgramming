package boostcamp;
import java.util.Scanner;
public class Back10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for (char j = 'a'; j <= 'z'; j++) {
			int count = 0;
			for (int i = 0; i < s.length();i ++) {
				if (s.charAt(i) == j) {
					System.out.print(i + " ");
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.print(-1 + " ");
		}

	}

}
