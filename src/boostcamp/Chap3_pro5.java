package boostcamp;
import java.util.Scanner;

public class Chap3_pro5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0)
				System.out.print(array[i] + " ");
		}
		
	}

}
