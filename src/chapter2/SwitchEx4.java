package chapter2;
import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int n = sc.nextInt();
		
		if(n % 2==0) {
			if(n % 3==0)
				System.out.println("6의 배수");
		}
		else	
			System.out.println("홀.");
				
		
		
	}

}
