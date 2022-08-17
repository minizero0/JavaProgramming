package SsangYong220817;

public class booleanTest01 {
	static boolean sosu(int n) {
		boolean isFlag = true;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n%i == 0)
				count++;
		}
		if (count != 0)
			isFlag = false;
		return isFlag;
		
	}
	public static void main(String args[]) {
		System.out.println(sosu(6));
		if (sosu(6))
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}
