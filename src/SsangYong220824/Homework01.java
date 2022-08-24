package SsangYong220824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		Scanner sc = new Scanner(System.in);
		double score;
		for (int i = 0; i < 10; i++) {
			score = sc.nextDouble();
			if (score >= 0 && score <= 10) {
				ar.add(score);
			}
			else {
				System.out.println("0~10 사이의 수를 다시 입력하세요");
				i--;
			}
		}
		
		Collections.sort(ar);
		ar.remove(0);
		ar.remove(ar.size()-1);
		double sum = 0;
		for (int i = 0; i < ar.size(); i++)
			sum += (double)ar.get(i);
		System.out.println(ar);
		System.out.println(sum);

	}

}
