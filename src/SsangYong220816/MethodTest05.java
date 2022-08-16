package SsangYong220816;

public class MethodTest05 {
	//구구단 출력.
	static void gugudan(int a) {
		System.out.println(" *** " + a + "단 *** ");
		for (int i = 1; i < 10; i++)
			System.out.println(a + " * " + i + " = " + a * i);
		System.out.println();
	}

	public static void main(String[] args) {
		gugudan(2);
		gugudan(5);
	}

}
