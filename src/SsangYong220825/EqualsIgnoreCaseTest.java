package SsangYong220825;

public class EqualsIgnoreCaseTest {

	public static void main(String[] args) {
		String data = "hello";
		String data2 = "Hello";
		
		if (data.equals(data2))
			System.out.println("same");
		else
			System.out.println("diff");
		if (data.equalsIgnoreCase(data2))
			System.out.println("same");
		else
			System.out.println("diff");
			

	}

}
