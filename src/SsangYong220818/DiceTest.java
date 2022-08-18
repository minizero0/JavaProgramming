package SsangYong220818;

class Dice {
	private int face;
	
	public int roll () {
		face = (int)(Math.random() * 6 + 1);  //math.random 0~1 사이 실
		return face;
	}
	
}

public class DiceTest {

	public static void main(String[] args) {
		Dice dc = new Dice();
		System.out.println(dc.roll());

	}

}
