package SsangYong220818;

class MyUtil1{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 클래스 메소드로 정의
	
	public static int findMax(int a, int b) {
		return a > b ? a : b;
//		if (b > a) 
//			a = b;
//		return a;
	}


	//두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 중복정의	
	public static double findMax(double a, double b) { //메소드 오버로딩.
		return a > b ? a : b;
	}
	
	//정수형 배열 매개변수로 전달받아 그 중에 가장 큰 수 반환하는 메소드 중복정의
	public static int findMax(int arr[]) { //메소드 오버로딩.
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}

public class MethodOverloadingTest02 {

	public static void main(String[] args) {
		System.out.println(MyUtil1.findMax(1, 3));
		System.out.println(MyUtil1.findMax(1.3, 3.3));
		int arr[] = {10,30,15,23,4};
		System.out.println(MyUtil1.findMax(arr));
	}
}