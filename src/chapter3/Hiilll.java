package chapter3;
import java.util.Random;
import java.util.Scanner;

public class Hiilll {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = random.nextInt(100);
			System.out.println("숫자를 찾아보세요");
			while(true) {
				
				int m =sc.nextInt();
				if(m==n) {
						break;
						
				}
				else if(m>n)
					System.out.println("더 낮게");
				else
					System.out.println("더 높게");
			}
			System.out.println("정답입니다. 계속하시겠습니까?(y/n)");
			String s = sc.next();
			if(s.equals("n")) {
				System.out.println("종료합니다..");
				break;
			}
		}
	}

}
