package SsangYong220809;

public class BooleanTest03 {

	public static void main(String[] args) {
		boolean isFlag = true;
		int n = 0;
		while (isFlag) {
			System.out.println("Hello");
			n += 1;
			if (n == 10)
				isFlag = false;
		}
	}

}
