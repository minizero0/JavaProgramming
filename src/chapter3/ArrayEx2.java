package chapter3;
import java.util.Scanner;
public class ArrayEx2 {
//5개 양수중 최대값을 구하는 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		System.out.println("5개의 양수를 입력하시오");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max)
				max = arr[i];
			
		}
		System.out.println(max);
		
		
	
	}	

}
