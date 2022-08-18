package SsangYong220818;

class MyUtil1{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 클래스 메소드로 정의
	
	public static int findMax(int a, int b) {
		return a > b ? a : b;
//		if (b > a) 
//			a = b;
//		return a;
	}


	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 클래스 메소드로 정의	
	public static double findMax(double a, double b) { //메소드 오버로딩.
		return a > b ? a : b;
	}
}

public class MethodOverloadingTest02 {

	public static void main(String[] args) {
		int result = MyUtil1.findMax(1, 22);
		System.out.println(result);
		double result2 = MyUtil1.findMax(1.1, 2.2);
		System.out.println(result2);
	}
}