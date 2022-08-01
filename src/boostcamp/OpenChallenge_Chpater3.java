package boostcamp;
import java.util.Scanner;

public class OpenChallenge_Chpater3 {

	public static void main(String[] args) {
		// 카드 번호 맞추기 게임 UP&DOWN
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("수를 입력하세요.");
			int number = sc.nextInt();
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			while (true) {
				int answer = sc.nextInt();
				if (answer > number)
					System.out.println("더 낮게");
				if (answer < number)
					System.out.println("더 높게");
				if (answer == number) {
					System.out.println("정답입니다.");
					break;
				}
			}
			System.out.println("다시하시겠습니까(y/n)");
			String c = sc.next();
			if (c.equals("n"))
				break;
			else 
				continue;
		}
	}

}
