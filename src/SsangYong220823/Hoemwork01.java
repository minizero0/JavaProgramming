package SsangYong220823;

public class Hoemwork01 {
	
	public static void swap(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - (i+1); j++) {
//				if (j + 1 == arr.length)
//					break;
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,20,5,2,3};
		swap(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
