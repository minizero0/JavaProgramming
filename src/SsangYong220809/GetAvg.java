package SsangYong220809;
import java.util.Scanner;

public class GetAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int a,b,c,sum;
		double avg;
		System.out.println("이름과 국어, 영어, 수학점수를 입력하시오.");
		name = sc.next();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = (a + b + c);
		avg = sum / (double)3;
		System.out.printf("이름: %-10s, 총점: %-10d, 평균 : %.2f\n", name, sum, avg );
		if (avg >= 60)
			System.out.printf(name + "평균 : %.3f" + "합격",avg);
		else
			System.out.println(name + "평균 : " + avg + "불합격");

	}

}
