package SsangYong220816;

public class MatrixTest02 {

	public static void main(String[] args) {
		int a[][] = new int[4][4];
		int n = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length -1 ; j++) {
				a[i][j] = n++;
				a[i][3] += a[i][j];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.printf("%d ",a[i][j]);
			System.out.println();
		}
	}
}
