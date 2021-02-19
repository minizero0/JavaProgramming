package chapter2;
import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >=80)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}

}
