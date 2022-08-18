package SsangYong220818;

class A{
	int i,j;
}
class B extends A{
	int k;
}

public class InherianceTest01 {

	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		ob2.i = 10;
		ob2.j = 20;
		ob2.k = 30;
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		System.out.println(ob2.k);
	}
}
