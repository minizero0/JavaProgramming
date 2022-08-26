package SsangYong220826;

public class DivTest03 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과:" + div);
		}catch(Exception e) {
			System.out.println("나누기할 두개의 정수를 확인하세요.");
		}

	}

}
