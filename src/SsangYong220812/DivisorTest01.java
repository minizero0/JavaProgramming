package SsangYong220812;

public class DivisorTest01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
					sum += j;
				}
			}
			System.out.println("==> " + sum);
		}

	}

}
