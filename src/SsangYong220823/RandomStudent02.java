package SsangYong220823;

import java.util.Random;

public class RandomStudent02 {

	public static void main(String[] args) {
		Random r = new Random();
		char arr[] = new char[20];
		char c = 'a';
		for (int i = 0; i < arr.length; i++)
			arr[i] = c++;
		
		for(int i = 0; i < 100; i++) {
			System.out.print(arr[i % arr.length]);
		}
		
		int n = r.nextInt(arr.length);
		
		System.out.println(arr[n]);
		

	}

}
