package SsangYong220812;

public class TeamExam01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i <= 30; i++) {
			for (int j = 0; j <= 5; j++)
			sum += (i*j);
		}
		
		System.out.printf("%d", sum);
	}
}
