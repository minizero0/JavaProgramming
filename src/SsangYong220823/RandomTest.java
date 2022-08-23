package SsangYong220823;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);
		
		double d = rand.nextDouble();
		System.out.println(d);
		
		boolean b = rand.nextBoolean();
		System.out.println(b);
		
		int a = rand.nextInt(3);
		System.out.println(a);

	}

}
