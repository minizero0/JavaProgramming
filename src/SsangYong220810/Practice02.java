package SsangYong220810;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("0~9 사이의 수를 입력하세요.");
		number = sc.nextInt();
		
		if (number == 0)
			System.out.println("영");
		else if (number == 1)
			System.out.println("일");
		else if (number == 2)
			System.out.println("이");
		else if (number == 3)
			System.out.println("삼");
		else if (number == 4)
			System.out.println("사");
		else if (number == 5)
			System.out.println("오");
		else if (number == 6)
			System.out.println("육");
		else if (number == 7)
			System.out.println("칠");
		else if (number == 8)
			System.out.println("팔");
		else if (number == 9)
			System.out.println("구");
		else
			System.out.println("입력오류!");

	}

}
