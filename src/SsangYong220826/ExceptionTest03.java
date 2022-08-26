package SsangYong220826;

public class ExceptionTest03 {
	public static void calcDiv(int a, int b) throws ArithmeticException {
		int div = a/b;
		System.out.println("나누기 결과: " + div);
	}

	public static void main(String[] args) {
		try {
			calcDiv(4,2);
			calcDiv(4,0);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}
	}
	//메소드 안에서 예외가 발생합니다.
	//메소드 안에서 직접 try~catch로 할 수 있다.
	//메소드 호출하는 쪽은 예외처를 맡길 수 있다.   <--- line 4

}
