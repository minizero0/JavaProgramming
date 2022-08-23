package SsangYong220823;

import java.util.Random;

public class TeamExam02 {
	
	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					i--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (j + 1 == arr.length)
					break;
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d ", arr[i]);
	}
}
