package SsangYong220816;

public class ThreeDArray {

	public static void main(String[] args) {
		int arr[][][] = new int[2][3][4];
		//                     면  행  열
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++)
					arr[i][j][k] = n;
			}
			n++;
		}
		
		for (int i[][] : arr) {
			for (int j[] : i) {
				for (int k : j)
					System.out.print(k + " ");
				System.out.println();
			}
			System.out.println();
			
		}
	}

}
