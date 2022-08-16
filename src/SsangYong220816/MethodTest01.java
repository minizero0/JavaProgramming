package SsangYong220816;

public class MethodTest01 {
	
	private static String hello() { //method 정의
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		return "hello";
	}

	public static void main(String[] args) {
		System.out.println(hello());
		
		String title = "SsangYongEducationCenter";
		System.out.println(title);
		hello();
		
		int year = 2022;
		System.out.println(year);
		
		hello();

	}
}
