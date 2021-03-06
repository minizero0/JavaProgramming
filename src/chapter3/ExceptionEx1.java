package chapter3;
import java.util.Scanner;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("배열의 길이를 입력하세요.(최댓값은 5 입니다.)");
	int arr[];
	int n = sc.nextInt();
	arr = new int[n];
	
	try {
		for(int i=0;i<5;i++) {
			arr[n]=i;
		}
		
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("최댓값을 넘었ㅅ브니다.");
	}
}
}