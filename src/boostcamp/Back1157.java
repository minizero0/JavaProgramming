package boostcamp;
import java.util.Scanner;

public class Back1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int arr[] = new int[25];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97)
				arr[s.charAt(i -= 97)];
			else
			arr[s.charAt(i) - 9]++;
		}
		

	}

}
