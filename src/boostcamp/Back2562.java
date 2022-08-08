package boostcamp;
import java.util.Scanner;

public class Back2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i])
				max = arr[i];
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max)
				break;
			count++;
		}
		
		System.out.println(max);
		System.out.println(count + 1);

	}

}
