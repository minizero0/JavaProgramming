package SsangYong220810;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height, weight;
		double avgWeight;
		System.out.println("키를 입력하세요.");
		height = sc.nextInt();
		avgWeight = (height - 100) * 0.9;
		System.out.println("체중을 입력하세요.");
		weight = sc.nextInt();
		
		System.out.println("표준 체중은" + avgWeight + "입니다.");
		
		if (weight > avgWeight)
			System.out.println("과체중 입니다.");
		else if (weight < avgWeight)
			System.out.println("저체중 입니다.");
		else
			System.out.println("표준입니다.");
		

	}

}
