package chapter2;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름  나이 사는곳 입력.");
		String name = sc.next();
		System.out.println("이름:"+name);
		int age = sc.nextInt();
		System.out.println("나이:" +age);
		String area = sc.next();
		System.out.println("사는곳:"+ area);
		
	}

}
