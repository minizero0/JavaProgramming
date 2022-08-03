package boostcamp;
import java.util.Scanner;

public class Chap3_pro14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTMLS", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		
		
		while (true) {
			int count = 0;
			System.out.println("과목 이름.");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.printf(course[i] + "의 점수는" + score[i] + "\n");
					count++;
				}
			}
			if (count == 0)
				System.out.println("없는 과목입니다.");
		}
	}

}
