package chapter2;

public class LogicalOperater {

	public static void main(String[] args) {
		System.out.println(3>=2);
		System.out.println(3<2);
		System.out.println('a'<'b');
		System.out.println('b'<'a');
		
		int x =5;
		int y = 6;
		int s =(x<y)?1:2;
		System.out.println(s);
		System.out.println("두수의 차는" + ((x>y)?(x-y):(y-x)));
		System.out.println(x&y);
	}

}
