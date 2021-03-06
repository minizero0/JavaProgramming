package chapter3;
import java.util.Scanner;

public class ArrayMany2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for(int i=0; i<arr.length;  i++) {
			int m = sc.nextInt();
			arr[n] = new int[m];
		}
		System.out.println(arr[0].length);	
		
		
	}
}
