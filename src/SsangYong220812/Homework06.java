package SsangYong220812;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] readings;
		System.out.println("배열의 크기를 입력하세요.");
		int n = sc.nextInt();
		readings = new double[n];
		
		System.out.println(readings.length);
	}
}
