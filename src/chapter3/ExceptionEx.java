package chapter3;
import java.util.Scanner;
import java.util.*;

public class ExceptionEx {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나누려는 수 입력");
			int n = sc.nextInt();
			System.out.println("나누기 수 입력");
			int m = sc.nextInt();
			
			try {
				System.out.println("값: " + n/m);
				break;
			}
			catch(ArithmeticException e){
				System.out.println("0불가");
				
			}
		}
		
		
	}

}
