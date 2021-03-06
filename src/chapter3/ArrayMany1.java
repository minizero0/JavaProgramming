package chapter3;

public class ArrayMany1 {

	public static void main(String[] args) {
		double arr[][] = new double[][] {
										{2.3, 3.2},
										{3.2,3.4},
										{4.3,4.3},
										{4.5,4.3}
										};//4*2배
		double sum =0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				sum += arr[i][j];
		int n = arr.length;
		int m =arr[0].length;
		System.out.println(n*m);
		System.out.println(sum/(n*m));
		System.out.println(sum/(arr.length*arr[0].length));
	}
	
}
