package SsangYong220818;
class Cs{
	protected int i,j;
	
	public Cs(int i, int j) {
		this.i = i;
		this.j = j;
	}	
}
class Ds extends Cs{
	int k;
	public Ds() {
		super(1,2); //부모의 생성자를 요구하는 명령어. 
		//상속된 자식클래스의 첫번째 줄에 부모의 기본생성자를 요구하는 super()가 기본적으로 생략되어있음.
		System.out.println("B의 생성자 동작");
	}
}

public class InheritanceAndConstructorTest03 {

	public static void main(String[] args) {
		Ds ob = new Ds();
		System.out.println(ob.i);

	}
}
