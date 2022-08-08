package SsangYong;
import java.util.*;

public class Pro_Rest {

	public static void main(String[] args) {
		Date year = new Date();
		Scanner sc = new Scanner(System.in);
		
		int thisYear = year.getYear() + 1900;
		System.out.println(thisYear);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		
		if (n % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");

	}

}
