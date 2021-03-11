package chapter4;
import java.util.Scanner;

public class Hello {
	String name;
	public Hello() {
		
	}
	public Hello(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println("이녀석의 이름은 " + this.name);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hello h = new Hello("Master Jo");
		Hello j = new Hello();
		System.out.println("j의 이름을 입력하세요.");
		j.name = sc.next();
		h.getName();
		j.getName();
		
	}

}
