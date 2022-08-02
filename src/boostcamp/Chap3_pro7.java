package boostcamp;

public class Chap3_pro7 {

	public static void main(String[] args) {
		int n [] = new int[10];
		double sum = 0;
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < n.length; i++) {
			int k = (int)(Math.random()*10 + 1);
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println();
		System.out.println("평균은 " + (sum/n.length));

	}

}
