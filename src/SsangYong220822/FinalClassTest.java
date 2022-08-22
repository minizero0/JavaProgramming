package SsangYong220822;

class Ae{
	public static int i = 500;
	public static void pro() {
		System.out.println(i);
	}
}

class Be extends Ae{
	int j = 600;
	public void hello() {
		System.out.println("hello" + i);
		i += 100;
	}
}

public class FinalClassTest {

	public static void main(String[] args) {
		Be ob = new Be();
		ob.pro();
		ob.hello();
		System.out.println(ob.i);

	}

}
