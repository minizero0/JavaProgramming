package boostcamp;
import java.util.Scanner;

public class Back3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[42];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr[a % 42]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				count++;
		}
		System.out.println(count);
	}

}
