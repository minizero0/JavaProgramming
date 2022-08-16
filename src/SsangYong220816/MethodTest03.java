package SsangYong220816;

public class MethodTest03 {
	
	private static void hello(String s, int num) { //method 정의   메소드 호출시 전달받기 위한 변수 ==> 매개변수.
		for (int i = 0; i < num; i++)
			System.out.println(s + " Hi");
	}

	public static void main(String[] args) {
		hello("Min",2);  //메소드 호출시 전달하는 값을 "인수"라고한다.
		
		String title = "SsangYongEducationCenter";
		System.out.println(title);
		hello("Risa",4);
		
		int year = 2022;
		System.out.println(year);
		
		hello("Jennie",1);

	}
}
