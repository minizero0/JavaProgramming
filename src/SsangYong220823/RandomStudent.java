package SsangYong220823;

import java.util.Random;

public class RandomStudent {

	public static void main(String[] args) {
		Random r = new Random();
		char arr[] = new char[20];
		char c = 'a';
		
		int n = r.nextInt(arr.length);
		for (int i = 0; i < arr.length; i++)
			arr[i] = c++;
		System.out.println(arr[n]);
		

	}

}
