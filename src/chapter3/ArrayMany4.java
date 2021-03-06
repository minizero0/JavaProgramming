package chapter3;

public class ArrayMany4 {
	
	static int[] arr() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length;i++)
			temp[i] = i;
		return temp;
	}
	
	static int[][] arrMany(){
		int temp[][] = new int[2][5];
		for(int i =0; i<temp.length;i++)
			for(int j=0; j<temp[i].length;j++)
				temp[i][j] = j;
		return temp;
	}

	public static void main(String[] args) {
		int arr2[];
		int arrMany2[][];
		arr2 = arr();
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		arrMany2=arrMany();
		for(int i=0; i<arrMany2.length;i++)
			for(int j=0; j<arrMany2[i].length;j++)
				System.out.print(arrMany2[i][j]);
		
	}

}
