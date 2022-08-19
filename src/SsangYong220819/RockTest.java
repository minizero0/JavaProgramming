package SsangYong220819;

abstract class Rsp{
	public abstract void draw();
}

class Rock extends Rsp{
	public void draw() {
		System.out.println("바위");
	}
}

class Scissors extends Rsp{
	public void draw() {
		System.out.println("가위");
	}
}

	
public class RockTest {

	public static void main(String[] args) {
		Rock r1 = new Rock();
		Scissors s1 = new Scissors();
		r1.draw();
		s1.draw();

	}

}
