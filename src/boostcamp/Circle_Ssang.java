package boostcamp;
import java.util.Scanner;

public class Circle_Ssang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = 3.14;
		double radius;
		
		System.out.print("원의 반지름을 입력하시오==>");
		radius = sc.nextInt();
		System.out.println(3.14 * 10);
		System.out.println("원의 둘레는 : " + radius * 2 * PI);
		System.out.println("원의 면적은 : " + radius * radius * PI);

	}

}
