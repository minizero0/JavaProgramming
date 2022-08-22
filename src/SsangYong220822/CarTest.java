package SsangYong220822;

interface Movable{
	/*final생략*/int speed = 100;	//인터페이스 변수는 상수이므로 초기값이 필요하다.
	public void speedUp(int amount);
	public void speedDown(int amount);
//	public void printSpeed(){
//		System.out.println("현재속도 : " + speed);
//	} 인터페이스안 메소드는 abstract 추상적 메소드이기 때문에 body를 구체화할 수 없다.
}

public class CarTest {

	public static void main(String[] args) {
		

	}

}
