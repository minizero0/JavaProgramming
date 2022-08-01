package boostcamp;
import java.util.Scanner;

public class pro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if (a > b && a > c) {
			if (b > c)
				System.out.println("중간값은 " + b);
			else
				System.out.println("중간값은 " + c);
		}
		if (b > a && b > c) {
			if (a > c)
				System.out.println("중간값은 " + a);
			else
				System.out.println("중간값은 " + c);
		}
		else {
			if (a > b)
				System.out.println("중간값은 " + a);
			else
				System.out.println("중간값은 " + b);
		}
			

	}

}
