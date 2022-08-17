package SsangYong220817;

public class FactorialMethod {
	
	static int fact(int n) {
		int sum = 1;
		while (n > 0) {
			if (n == 1)
				System.out.print(n + "=");
			else
				System.out.print(n + "*");
			sum *= n;
			n--;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(fact(5));

	}

}
