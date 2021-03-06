package chapter3;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int arr[] = new int[5];
		System.out.println(arr.length +"개의 정수를 입력하세요.");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("배열의 평균값은:" + (double)sum/arr.length);
	}

}
