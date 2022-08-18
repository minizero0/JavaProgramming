package SsangYong220818;
class As{
	protected int i,j;
	
	public As() {
		System.out.println("A의 생성자 동작");
	}
	public As(int i, int j) {
		this.i = i;
		this.j = j;
	}	
}
class Bs extends As{
	int k;
	public Bs() {
		super(); //부모의 생성자를 요구하는 명령어.
		System.out.println("B의 생성자 동작");
	}
}

public class InheritanceAndConstructorTest02 {

	public static void main(String[] args) {
		Bs ob = new Bs();

	}

}
