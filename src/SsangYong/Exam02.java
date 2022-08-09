package SsangYong;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double sum = (3 * x * x * x) - (7 * x * x) + 9;
		System.out.println(sum);
	}

}
