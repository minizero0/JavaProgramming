package SsangYong220817;

public class LogicalErrorTest {
	
	static int getFactorial(int n) {
		int result = 1;
		for (int i = n; i >= 1; i--) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(3));
	}
}