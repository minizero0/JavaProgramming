package SsangYong220812;

public class ArrTest02 {

	public static void main(String[] args) {
		int []a = {8,13,21,27,33,44};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) { 
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		System.out.printf("\n평균은 %.1f 입니다.", (double)(sum / a.length));
	}
}
