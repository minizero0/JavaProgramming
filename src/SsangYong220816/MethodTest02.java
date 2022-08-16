package SsangYong220816;

public class MethodTest02 {
	
	private static void hello(String s) { //method 정의   메소드 호출시 전달받기 위한 변수 ==> 매개변수.
		System.out.println(s + "Hi");
		System.out.println(s + "Hi");
		System.out.println(s + "Hi");
	}

	public static void main(String[] args) {
		hello("영민");  //메소드 호출시 전달하는 값을 "인수"라고한다.
		
		String title = "SsangYongEducationCenter";
		System.out.println(title);
		hello("소진");
		
		int year = 2022;
		System.out.println(year);
		
		hello("현지");

	}
}
