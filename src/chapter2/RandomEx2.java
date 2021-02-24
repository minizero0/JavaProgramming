package chapter2;
import java.util.Random;

public class RandomEx2 {
	

	public static void main(String[] args) {
		int i;
		System.out.println();
		Random random = new Random();
		int ran = random.nextInt(10);
		
		if (ran!=1)
			System.out.println("미당첨입니다.");
		else
			System.out.println("BOOM!!");
	}

}
