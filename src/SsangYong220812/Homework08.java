package SsangYong220812;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pay[] = new double[12];
		double sum = 0;
		int max = 0,min = 1000000;
		
		for (int i = 0; i < pay.length ; i++) {
			pay[i] = sc.nextDouble();
			if (pay[i] < 0) {
				System.out.println("잘못된 입력입니다.");
				return;
			}
			sum += pay[i];
			if (pay[i] > max)
				max = i;
			if (pay[i] < min)
				min = i;
		}
		System.out.println("1년 전체 사용금액 : " + sum);
		System.out.println("월별평균사용금액 : " + sum/12);
		System.out.println("가장 지출이 많았던 월." + (max+1));
		System.out.println("가장 지출이 적었던 월." + (min+1));
	}
}
