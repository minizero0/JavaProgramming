package chapter3Problem;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		System.out.print("양의 정수 10개 입력하세요.>>");
		
		for(int i=0; i<10;i++) {
			n[i] =sc.nextInt();
		}
		
		System.out.print("3의배수는>>");
		for(int j=0;j<10;j++) {
			if(n[j]%3==0)
				System.out.print( n[j] + " ");
		}
	}

}
