package chapter3;
import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum =0;
		
		System.out.println(arr.length + "개의 정수를 입력하세요");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.println((double)sum/arr.length);
	}

}
