package SsangYong220816;

public class MethodTest08 {
	
	static void isEqual(double a[], double b[]) {
		boolean isFlag = true;
		
		for (int i = 0; i < a.length; i++) {
			if (a.length != b.length) {
				isFlag = false;
				break;
			}
			else if (a[i] != b[i]) {
				isFlag = false;
				break;
			}
		}
		if (isFlag)
			System.out.println("SAME");
		else
			System.out.println("DIFF");
		
	}
	
	public static void main(String args[]) {
		double a[] = {1.1, 1.2, 1.3};
		double b[] = {1.1, 1.2, 1.3};
		isEqual(a, b);
		
	}
}
