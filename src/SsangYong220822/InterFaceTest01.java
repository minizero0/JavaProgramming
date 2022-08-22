package SsangYong220822;

interface Ad{
	public void pro();
}

class Bd implements Ad{
	public void pro() {
		System.out.println("pro입니다.");
	}
}

public class InterFaceTest01 {

	public static void main(String[] args) {
		Bd ob = new Bd();
		ob.pro();
	}
}
