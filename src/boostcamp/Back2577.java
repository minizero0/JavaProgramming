package boostcamp;
import java.util.Scanner;

public class Back2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a*b*c;
		System.out.println(sum);
		int arr[] = new int[10];
		while (sum > 0) {
			arr[sum%10]++;
			sum /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
