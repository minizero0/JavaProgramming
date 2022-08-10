package SsangYong220810;

public class SwapTest {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println("변경하기 전");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("변경한 후");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
