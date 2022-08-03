package boostcamp;

public class Chap3_pro10 {

	public static void main(String[] args) {
		
		int arr[][] = new int [4][4];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) 
				arr[i][j] = (int)(Math.random()*10 + 1);
		}
		
		while (count < 6) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if (arr[row][col] != 0) {
				arr[row][col] = 0;
				count++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) 
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}

	}

}
