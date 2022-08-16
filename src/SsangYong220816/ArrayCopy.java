package SsangYong220816;

public class ArrayCopy {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int b[] = a.clone();
		
		a[1] = 3;
		System.out.println("Array a");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		System.out.println("Array b");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

}
