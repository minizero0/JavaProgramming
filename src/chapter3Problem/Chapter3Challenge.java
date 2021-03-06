package chapter3Problem;
import java.util.Scanner;
import java.util.Random;

public class Chapter3Challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while(true) {
		int n = r.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞춰 보세요.");
			while(true) {
			int m = sc.nextInt();//맞춰보는 수
			if(n==m) {
				System.out.println("정답입니다.");
				break;
				}
			
			else if(n>m) {
				System.out.println("더 높게");
			}
			else 
				System.out.println("더 낮게");
			}
			System.out.println("게임을 계속하시겠어요?(y/n)");
			String text = sc.next();
			
				if(text.equals("n")) {
					System.out.println("종료합니다..");
				break;
				}
				else
					System.out.println("게임을 계속합니다.");
			
			}
			
			
			}
	}



