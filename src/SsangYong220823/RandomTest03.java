package SsangYong220823;

import java.util.Random;

public class RandomTest03 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt();
		System.out.println(n);
		n = n >>> 1; 		//무조건 양수 만들어 준다.
		System.out.println(n);
		n = n%10 + 1; 		//0~9
		System.out.println(n);

	}

}
