package SsangYong220824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamExam03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList sad = new ArrayList();	
		double sum = 0;
			
		for (int i = 0; i < 10; i++) {
			double score = s.nextDouble();
			sad.add(score);
			
		}
		Collections.sort(sad);
		System.out.println(sad);
		
		sad.remove(0);
		sad.remove(sad.size()-1);
		
		
		System.out.println(sad);
		
		

	}

}
