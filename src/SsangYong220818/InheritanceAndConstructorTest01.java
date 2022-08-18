package SsangYong220818;
class G{
	protected int i,j;
	public G(int i, int j) { //생성자를 생성했기 때문에 기본생성자(매개변수가 없는 생성자)를 제공하지 않는다.
		this.i = i;
		this.j = j;
	}
}
public class InheritanceAndConstructorTest01 {

	public static void main(String[] args) {
		G ob = new G(1, 2);
		System.out.println("ok");
		System.out.println(ob.i);

	}

}
