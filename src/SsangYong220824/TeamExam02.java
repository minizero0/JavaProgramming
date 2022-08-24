package SsangYong220824;

import java.util.ArrayList;
import java.util.Scanner;

class Score1{
	double score;
	
	public Score1(double score) {
		this.score = score;
	}
	public String toString() {
		return score + " ";
	}
}

public class TeamExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input;
		double arr[] = new double[10];
		ArrayList<Score> s = new ArrayList<Score>();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째", i);
			input = sc.nextDouble();
			if (input >= 0.0 && input <= 10.0)
				s.add(new Score(input));
			else {
				System.out.println("입력값 오류 다시 입력하세요.");
				i--;
			}
			arr[i] = input;
		}
		System.out.println(s.size());
		for (int i = 0; i < s.size(); i++) {
			for (int j = 0; j < s.size() - (i+1); j++) {
				if (arr[j] > arr[j+1]) {
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		double sum = 0;
		for (int i = 1; i < arr.length-1; i++) 
			sum += arr[i];
		System.out.println(sum);
		

	}

}
