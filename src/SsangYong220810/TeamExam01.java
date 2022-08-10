package SsangYong220810;
import java.util.Scanner;

public class TeamExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		System.out.println("월을 입력하세요");
		month = sc.nextInt();
		
		if (1 <= month && month <= 12) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
				System.out.println(month + "월은 31까지 있어요!");
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				System.out.println(month + "월은 30까지 있어요!");
			else
				System.out.println(month + "월은 28까지 있어요!");
		}
		else
			System.out.println("입력오류");
	}
}
