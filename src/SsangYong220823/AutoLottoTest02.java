package SsangYong220823;

import java.util.Random;

public class AutoLottoTest02 {

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i <arr.length; i++) { 
			arr[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					i--;
			}
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d ", arr[i]);

	}

}
