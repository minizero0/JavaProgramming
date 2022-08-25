package SsangYong220825;

public class EqualsIgnoreCaseTest {

	public static void main(String[] args) {
		String data = "hello";
		String data2 = "Hello";
		
		if (data.equals(data2))					//대소문자 구별 equals Test
			System.out.println("same");		
		else
			System.out.println("diff");
		if (data.equalsIgnoreCase(data2))		//대소문자 구별없이 equals Test
			System.out.println("same");
		else
			System.out.println("diff");
			

	}

}
