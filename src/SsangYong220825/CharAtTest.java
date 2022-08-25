package SsangYong220825;

public class CharAtTest {

	public static void main(String[] args) {
		String data = "hello korea";
		for (int i = 0; i < data.length();i++) {
			if (data.charAt(i) == 'k') {
				System.out.println(data.charAt(i));
				System.out.println(i);
			}
		}

	}

}
