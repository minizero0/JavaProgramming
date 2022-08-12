package SsangYong220812;

public class GuGudanWhile {

	public static void main(String[] args) {
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
