package SsangYong220816;
import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {10, 20, 30};
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		for (int i = 0; i < a.length; i++)
//			a[i] = sc.nextInt();
		
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]); //오류발생.
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println(a.length);
//		System.out.println(a[a.length]); //오류발생.
	}
}