package chapter3Problem;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세이.");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
