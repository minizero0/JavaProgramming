package SsangYong220816;

public class MethodTest09 {
	
	public static void hello() { //method 정의
		int i = 0;
		if (i < 1)    //때에 따라 메소드 이후의 문장을 실행하지않고 종료 가능.
			return;
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		hello();
		
		String title = "SsangYongEducationCenter";
		System.out.println(title);
		hello();
		
		int year = 2022;
		System.out.println(year);
		
		hello();

	}
}
