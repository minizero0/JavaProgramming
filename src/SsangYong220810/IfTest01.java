package SsangYong220810;
import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n >= 0)
			System.out.println(n+100);
		else
			System.out.println(n*n);
		System.out.println("작업종료");

	}

}
