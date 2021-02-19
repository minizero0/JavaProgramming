package chapter2;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		switch (score/10) {
			case 10:
			case 9:
				grade =  'A';
				break;
			case 8:
			case 7:
				grade = 'B';
				break;
			case 6:
			case 5:
				grade = 'C';
				break;
			case 4:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		System.out.println(grade + "학점입니다.");
			
	
		
	}

}
