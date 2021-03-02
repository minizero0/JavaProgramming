package chapter3;

public class ForEx2Gugudan {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1;j<10;j++) {
				int sum =0;
				sum = i*j;
				System.out.print(i + "*" + j + "=" + sum);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}
