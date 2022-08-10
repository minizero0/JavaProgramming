package SsangYong220810;
import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 0)
			System.out.println(a+100);
		else
			System.out.println(a*a);
		System.out.println("작업종료");

	}

}
