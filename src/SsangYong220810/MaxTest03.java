package SsangYong220810;
import java.util.Scanner;

public class MaxTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,max;
		System.out.print("첫번째 수 입력>>");
		a = sc.nextInt();
		System.out.print("두번째 수 입력>>");
		b = sc.nextInt();
		
		if (a > b) 
			max = a;
		else
			max = b;
		System.out.println("큰수는 " + max);
	}

}
