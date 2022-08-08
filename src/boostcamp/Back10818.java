package boostcamp;
import java.util.Scanner;
public class Back10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int arr[] = new int[number];
		
		int min = 1000001;
		int max = -1000001;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)	
				min = arr[i];
		}
		System.out.println(min + " " + max);

	}
}
