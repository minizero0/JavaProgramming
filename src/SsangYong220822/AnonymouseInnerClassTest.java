package SsangYong220822;
interface Animal{
	public void move();
}

public class AnonymouseInnerClassTest {

	public static void main(String[] args) {
		Animal s = new Animal(){  //익명클래스.
			public void move() {
				System.out.println("기어서 움직임.");
			}
		};
		s.move();
		
		Animal horse = new Animal() {
			public void move() {
				System.out.println("다그닥 다그닥 ");
			}
		};
		horse.move();
	}
}

/*인터페이스를 구현한 별도의 클래스를 만들지않고 바로 객체 생성할 때에 메소드를 오버라이딩 하여 사용하는 방법을 
 * ==> 이름없는 inner class (익명클래스)라고 한다.
 * */