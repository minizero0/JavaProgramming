package SsangYong220816;

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < age.length; i++) {
			System.out.println("input age");
			age[i] = sc.nextInt();
			sum += age[i];
		}
		for (int i = 0; i < age.length; i++)
			System.out.println(age[i]);
		System.out.println("age sum = " + sum);
		System.out.println("age avg = " + sum/age.length);
	}
}