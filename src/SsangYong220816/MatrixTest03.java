package SsangYong220816;

public class MatrixTest03 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int n = 1;
		for (int i = 0; i < arr.length-1; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i].length - 1 == j)
					arr[i][j] = sum;
				else {
				arr[i][j] = n++;
				sum += arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].length-1 == j)
					arr[j][i] = sum;
				sum += arr[j][i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
