package SsangYong220826;

public class FinallyTest02 {


	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과 : " + div);
			System.out.println("작업완료");		// <== 예외가 발생되면 동작하지 않는다.
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없다.");
		}catch(Exception e) {
			System.out.println("두개의 정수를 확인하세요.");
		}finally {	//예외가 발생하거나 발생하지 않거나 반드시 동작한다.
			System.out.println("작업완료");
		}
	}
}
