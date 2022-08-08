package boostcamp;
import java.util.Scanner;

public class Back4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int num1 = sc.nextInt();
			float avg = 0;
			int count = 0;
			int arr[] = new int[num1];
			for (int j = 0; j < num1; j++) {
				arr[j] = sc.nextInt();
				avg += arr[j];
			}
			avg /= num1;
			for (int x = 0; x < num1; x++) {
				if (arr[x] > avg)
					count++;
			}
			System.out.printf("%.3f%%\n", (float)100 / num1 * count);
		}
	}

}
