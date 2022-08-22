package SsangYong220822;

interface I{
	public void pro();
}

interface J{
	public void hello();
}

class K implements I,J{
	public void pro() {
		System.out.println("K pro overriding");
	}
	public void hello() {
		System.out.println("K hello overriding");
	}
}

public class InterfaceTest03 {

	public static void main(String[] args) {
		K ob = new K();
		ob.pro();
		ob.hello();
	}
}
