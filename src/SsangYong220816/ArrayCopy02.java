package SsangYong220816;

public class ArrayCopy02 {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[5];
//		int b[] = a.clone();
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];		
		
		a[1] = 3;
		System.out.println("Array a");
		for (int i : a)
			System.out.print(i + " ");
		
		System.out.println();
		System.out.println("Array b");
		for (int i : b)
			System.out.print(i + " ");
	}
}