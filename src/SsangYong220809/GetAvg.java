package SsangYong220809;
import java.util.Scanner;

public class GetAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int a,b,c;
		double avg;
		System.out.println("이름과 국어, 영어, 수학점수를 입력하시오.");
		name = sc.next();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		avg = (a + b + c) / (double)3;
		
		if (avg >= 60)
			System.out.println(name + "평균 : " + avg + "합격");
		else
			System.out.println(name + "평균 : " + avg + "불합격");

	}

}
