package SsangYong220823;

import java.util.Random;

public class RandomTest02 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand.nextInt(10);
		System.out.println(n+1);

		
		
		int s = rand.nextInt();
		if (s < 0) 
			s = s * -1;			//음수 양수 변환
		s = s % 10 + 1;			// 0~9 이기 때문에 + 1
		System.out.println(s);
	}

}
