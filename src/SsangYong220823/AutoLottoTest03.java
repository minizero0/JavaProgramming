package SsangYong220823;

import java.util.Random;

public class AutoLottoTest03 {
	public static boolean isAlready(int arr[], int n, int last) {
		boolean isFlag = false;
		for (int i = 0; i < last; i++) {
			if (arr[i] == n) {
				isFlag = true;
				break;
			}
		}
		return isFlag;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i <arr.length; ) {
			int n = r.nextInt(45) + 1;
			if(!isAlready(arr, n, i)) {
				arr[i] = n;
				i++;
			}
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d ", arr[i]);

	}

}
