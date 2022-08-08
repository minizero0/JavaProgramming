package boostcamp;
import java.util.Scanner;

public class Back1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int arr[] = new int[number];
		int max = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = 0; i < arr.length; i++) 
			sum += (arr[i]/(double)max) * 100;
		System.out.println(sum/number);
	}

}
