package SsangYong220823;

public class SortTest {

	public static void main(String[] args) {
		int data[] = {10,9,3,2,6};
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - i; j++) {
				if (j + 1 == data.length)
					break;
				if (data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		int data2[] = {20,30,12,5,6};
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data2[j] < data2[i]) {
					int temp = data2[i];
					data2[i] = data2[j];
					data2[j] = temp;
				}
			}
		}
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++)
			System.out.print(data2[i] + " ");

	}

}
