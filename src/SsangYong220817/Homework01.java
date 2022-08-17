package SsangYong220817;

class Box{
	private int height;
	private int weidth;
	private int area;
	private boolean empty;
	
	public Box(int height, int weidth, boolean empty) {
		this.height = height;
		this.weidth = weidth;
		area = height * weidth;
		this.empty = empty;
	}
	public Box() {
		
	}
	
	public int getArea() { 
		return area;
	}
	
	public void printInfo() {
		if (empty)
			System.out.println("height : " + height + "\nweidth : " + weidth + "\n너비 : " + area + "\n무언가 담겨있다.");
		else
			System.out.println("height : " + height + "\nweidth : " + weidth + "\n너비 : " + area + "\n비어있다.");
	}
}

public class Homework01 {

	public static void main(String[] args) {
		Box s = new Box(10, 20, true);
		Box d = new Box(10, 30, false);
		Box a = new Box();
		s.printInfo();
		d.printInfo();
		a.printInfo();

	}

}
