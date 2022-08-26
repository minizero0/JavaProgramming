package SsangYong220826;

//프로그램 실행시 필요한 값을 전달할 수 있다.

public class DivTest {
								// args[0] args[1]
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int div = a/b;
		System.out.println("나누기결과:" + div);
	}
}