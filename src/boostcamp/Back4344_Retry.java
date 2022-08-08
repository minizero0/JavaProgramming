package boostcamp;
import java.util.Scanner;

public class Back4344_Retry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		for (int i = 0; i < num1; i++) {
			int num2 = sc.nextInt();
			int arr[] = new int[num2];
			int count = 0;
			int avg = 0;
			for (int j = 0; j < num2; j++) {
				arr[j] = sc.nextInt();
				avg += arr[j];
			}
			avg/=num2;
			for (int x = 0; x < num2; x++) {
				if (arr[x] > avg)
					count++;
			}
			System.out.println(count);
			System.out.printf("%.3f%%\n", (float)100 / num2 * count);
		}

	}

}
