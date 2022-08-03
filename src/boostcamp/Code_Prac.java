package boostcamp;

public class Code_Prac {

	public static void main(String[] args) {
		int a[] = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10 + 1);
			System.out.printf("%2d", a[i]);
		}

	}

}
