package chapter3;

public class ArrayMany5 {

	public static void main(String[] args) {
		int arr[][] = new int [4][];
		int k=0;
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[1];
		arr[3] = new int[4];
		
		for(int i=0; i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = k++;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}
