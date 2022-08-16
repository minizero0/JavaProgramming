package SsangYong220816;

public class MethodTest04 {
	
	//매개변수로 두개의 정수를 전달받아 더하기 결과를 출력.
	static int Plus(int a, int b) {
		return a+b; //메소드의 마지막에는 return 문장을 쓰지 않아도 호출한 곳으로 다시 돌아갑니다.
	}

	public static void main(String[] args) {
		System.out.println(Plus(1,2));
		System.out.println(Plus(10,25));
	}
}