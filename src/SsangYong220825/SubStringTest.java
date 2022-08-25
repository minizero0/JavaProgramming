package SsangYong220825;

public class SubStringTest {

	public static void main(String[] args) {
		String email = "tiger@naver.com";
		int n1 = email.indexOf("tiger");	
		int n2 = email.indexOf("@");
		System.out.println(email.substring(n1, n2));
	}
}
