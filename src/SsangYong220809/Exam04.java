package SsangYong220809;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		System.out.printf("천의 자리 %d\n", number/1000);
		number %= 1000;
		System.out.printf("백의 자리 %d\n", number/100);
		number %= 100;
		System.out.printf("십의 자리 %d\n", number/10);
		number %= 10;
		System.out.printf("일의 자리 %d\n", number);

	}

}
