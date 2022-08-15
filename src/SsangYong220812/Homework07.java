package SsangYong220812;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
