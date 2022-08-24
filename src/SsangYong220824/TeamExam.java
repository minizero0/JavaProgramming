package SsangYong220824;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	double score;
	
	public Score(double score) {
		this.score = score;
	}
	public String toString() {
		return score + " ";
	}
}

public class TeamExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input;
		double sum = 0;
		double max = -1;
		double min = 11;
		ArrayList<Score> s = new ArrayList<Score>();
		for (int i = 0; i < 10; i++) {
			input = sc.nextDouble();
			if (input >= 0.0 && input <= 10.0)
				s.add(new Score(input));
			else {
				System.out.println("입력값 오류 다시 입력하세요.");
				i--;
			}
			if (input > max)
				max = input;
			if (input < min)
				min = input;
			sum += input;
		}
		
		System.out.println("총 점수 : " + (sum-max-min));
		
		
		

	}

}
