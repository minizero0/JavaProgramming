package SsangYong220810;

public class ShortCutOperationTest {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		if (++a >= 10 && ++b >= 10)
			System.out.println("ok");
		else
			System.out.println("no");
		
		System.out.println(a);
		System.out.println(b);
		int c = 5;
		int d = 5;
		if (++c >= 10 & ++d >= 10)
			System.out.println("ok");
		else
			System.out.println("no");
		
		System.out.println(c);
		System.out.println(d);

	}

}
