package chapter2;

public class methodEx {

	public static void main(String[] args) {
		add(10,20);
		System.out.println(add(10,20,30	));
	}
	

	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int add(int x, int y, int z) {
		return x+y+z;
	}
	
}
