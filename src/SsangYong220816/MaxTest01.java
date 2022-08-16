package SsangYong220816;

public class MaxTest01 {

	public static void main(String[] args) {
		int a[] = {1,3,6,10,6,2};
		int max;
		max = a[0];
		
		for (int i = 1; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);

	}

}
