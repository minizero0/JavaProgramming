package boostcamp;
import java.util.Scanner;

public class Chap3_pro8_retry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개>>");
		int number = sc.nextInt();
		int arr[] = new int[number];
		
		for (int i = 0; i < number; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					i--;
			}
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 10 == 0)	
				System.out.println();
		}
		
	}

}
