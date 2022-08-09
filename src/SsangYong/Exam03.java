package SsangYong;
import java.util.Scanner;

public class Exam03 {
	
	final static double GRAM = 454;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		System.out.println("몸무게를 파운드로 입력>>");
		double pound = sc.nextDouble();
		weight = pound * GRAM;
		System.out.println("몸무게 >>" + weight);

	}

}
