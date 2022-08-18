package SsangYong220818;

class MyUtil{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 클래스 메소드로 정의
	
	public static int findMax(int a, int b) {
		return a > b ? a : b;
	}
}

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MyUtil m1 = new MyUtil();
		
		int result = m1.findMax(1,22);
		System.out.println(result);
		

	}

}
