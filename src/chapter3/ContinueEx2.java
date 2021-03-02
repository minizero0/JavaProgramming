package chapter3;
import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit 입력시 종료 됩니다.");
		while(true) {
			System.out.print(">>");
			String text = sc.nextLine();
			if(text.equals("exit"))
				break;
			
		}
		System.out.println("종료합니다..");
		
	}

}
