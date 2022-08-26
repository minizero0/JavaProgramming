package SsangYong220826;

public class DivTest04 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과:" + div);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어용 ");  	//Exception 이 예외처리의 조상이기 때문에 
														//포함관계에 있다면 먼저 사용하여 에러처리한다.
		}
		catch(Exception e) {
			System.out.println("나누기할 두개의 정수를 확인하세요.");
		}

	}

}
