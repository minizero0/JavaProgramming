package SsangYong220812;
import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pay[] = new double[12];
		double sum = 0;
		
		for (int i = 0; i < pay.length ; i++) {
			do {
				System.out.println((i+1) + "월의 카드 사용금액을 입력==>");
				pay[i] = sc.nextDouble();
			}while(pay[i] < 0);
			sum += pay[i];
		}
		int max = 0;
		int min = 0;
		for (int i = 0; i < pay.length; i++) {
			System.out.println((i+1) + "월 카드 사용금액:");
			System.out.println((int)pay[i]);
			if (pay[i] > max)
				max = i;
			if (pay[i] < min)
				min = i;
	}
		System.out.println("1년 전체 사용금액 : " + sum);
		System.out.println("월별평균사용금액 : " + sum/12);
		System.out.println("가장 지출이 많았던 월 : " + (max+1) + "월");
		System.out.println("가장 지출이 적었던 월 : " + (min+1) + "월");
	}
}
