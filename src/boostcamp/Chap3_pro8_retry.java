package boostcamp;
import java.util.Scanner;

public class Chap3_pro8_retry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 몇개?");
		int number = sc.nextInt();
		int array [] = new int[number];
		
		for (int i = 0; i < number; i++) {
			array[i] = (int)(Math.random()*100 + 1);
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j])
					i--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
		
	}

}
