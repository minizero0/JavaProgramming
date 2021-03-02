package chapter3;
import java.util.Random;

public class ArrayEx {

	public static void main(String[] args) {
		int[] score = {10, 20, 30 ,40 ,50};
		int count = score.length;
		System.out.println(count);
		System.out.println(score.length-1);
		System.out.println(score[2]);
		System.out.println(score[score.length-1]);
		
		Random random = new Random();
		int rand = random.nextInt(3);
		
		String[] str = {"김승래", "박형준", "정재빈", "조영민"};
		System.out.println(str[rand]);	
			
		
		
	}
}
