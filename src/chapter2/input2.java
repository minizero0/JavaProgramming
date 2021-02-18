package chapter2;
import java.util.Scanner;


public class input2 {
	
	public static int sum(int n , int m ) {
		return n+m;
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(sum(a,b));
		
	}

}
