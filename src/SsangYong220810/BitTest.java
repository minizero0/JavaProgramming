package SsangYong220810;

public class BitTest {

	public static void main(String[] args) {
		int a = 7;
		int b = 10;
		int i = a & b;
		int j = a | b;
		int k = a ^ b;
		
		while (a > 0) {
			System.out.print(a%2);
			a/=2;
		}
		System.out.println();
		
		while (b > 0) {
			System.out.print(b%2);
			b/=2;
		}
		System.out.println();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
