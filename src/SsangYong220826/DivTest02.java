package SsangYong220826;

//프로그램 실행시 필요한 값을 전달할 수 있다.

public class DivTest02 {
								// args[0] args[1]
	public static void main(String[] args) {
		try {
//		String str1 = args[0];
//		String str2 = args[1];
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div = a/b;
		System.out.println("나누기 결과:" + div);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 나누기 할 두개의 정수를 전달하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어용");
		}catch(NumberFormatException e) {
			System.out.println("정수를 입력하세요");
		}
	}
}